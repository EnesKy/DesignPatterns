package odev2.codes;

import java.util.ArrayList;

import static odev2.codes.Util.datedPrint;

/**
 * Internet cafe manager : Object Pool Manager
 *
 * - Multi thread safe Singleton
 * - Pool size: 10
 */

public class InternetCafe {

    private static volatile InternetCafe instance;
    private final ArrayList<Computer> computerList;
    private final ArrayList<Customer> customerList;
    private final ArrayList<Customer> waitingList;
    private final int cafeCapacity = 10;

    private InternetCafe() {
        datedPrint("----------------------------------------------------------");
        datedPrint("-------------- Internet cafeye hoş geldiniz --------------");
        datedPrint("----------------------------------------------------------");
        computerList = new ArrayList<>(cafeCapacity);
        customerList = new ArrayList<>(cafeCapacity);
        waitingList = new ArrayList<>();
    }

    public static InternetCafe getInstance() {
        if (instance == null)
            synchronized (InternetCafe.class) {
                if (instance == null)
                    instance = new InternetCafe();
            }
        return instance;
    }

    /**
     * @return check in the customer if there is available computer
     */
    public synchronized Computer checkIn(Customer customer) {
        Computer availableComputer = getAvailableComputer();
        if (availableComputer != null) {
            if (computerList.contains(availableComputer)) {
                int index = computerList.indexOf(availableComputer);
                computerList.get(index).customer = customer;
            } else if (computerList.size() < cafeCapacity) {
                availableComputer.customer = customer;
                computerList.add(availableComputer);
            }
            waitingList.remove(customer);
            customerList.add(customer);
            datedPrint("----------------------------------------------------------");
            datedPrint( availableComputer.id + "'e " + availableComputer.customer.name + " oturdu.");
            report();
        } else {
            if (!waitingList.contains(customer))
                waitingList.add(customer);
        }
        return availableComputer;
    }

    /**
     * Customers session is over and checks out
     */
    public synchronized void checkOut(Customer customer) {
        for (var computer : computerList) {
            if (computer.customer == customer) {
                customerList.remove(customer);
                datedPrint("----------------------------------------------------------");
                datedPrint(customer.name + " süresi bitti ve kalktı. " + computer.id + " artık boş.");
                computer.clearCustomer();
                break;
            }
        }
       report();
    }

    /**
     * @return available computer if there is one
     */
    private Computer getAvailableComputer() {
        //If computerlist is empty return new computer
        if (computerList.isEmpty())
            return new Computer(getNewComputerID());

        //Return first available computer in computerlist
        for (var computer: computerList) {
            if (!computer.isOccupied())
                return computer;
        }

        //Return new computer if there is no available computer in computerlist and capacity not exceeded
        if (computerList.size() < cafeCapacity)
            return new Computer(getNewComputerID());
        else
            return null;
    }

    /**
     * @return new computer id
     */
    private String getNewComputerID() {
        return "Masa " + (computerList.size() + 1);
    }

    private void report() {
        datedPrint("----------------------------------------------------------");
        if (customerList.isEmpty()) {
            datedPrint("Masaların hepsi boş.");
        } else {
            datedPrint("----- Masa Durumu -> " + computerList.toString().replace("]", ""));
            System.out.println("---------------------]");
        }
        datedPrint("----------------------------------------------------------");
        if (!waitingList.isEmpty())
            datedPrint("----- Bekleme Salonu Durumu -> " + waitingList);
    }

}
