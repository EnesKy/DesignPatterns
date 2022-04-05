package odev2.codes;

import java.util.ArrayList;

import static odev2.codes.Util.datedPrint;

/**
 *   Internet Kafe manager : Object Pool Manager
 *
 * - Multi thread safe Singleton
 * - Havuz boyutu: 10
 */

public class InternetCafe {

    private static volatile InternetCafe instance;
    private final ArrayList<Computer> computerList;
    private final ArrayList<Customer> customerList;
    private final ArrayList<Customer> waitingList;
    private final int cafeCapacity = 10;

    /**
     * Singleton olabilmesi için *private* tanımlı constructor.
     */
    private InternetCafe() {
        datedPrint("-----------------------------------------------------------");
        datedPrint("-------------- Internet Cafe'ye Hoş Geldiniz --------------");
        datedPrint("-----------------------------------------------------------");
        computerList = new ArrayList<>(cafeCapacity);
        customerList = new ArrayList<>(cafeCapacity);
        waitingList = new ArrayList<>();
    }

    /**
     * Singleton olabilmesi için *public static* tanımlı constructor.
     * @return instance of InternetCafe
     */
    public static InternetCafe getInstance() {
        if (instance == null)
            synchronized (InternetCafe.class) { //Multi thread safe olabilmesi için *synchronized* ile instance null kontrolü
                if (instance == null)
                    instance = new InternetCafe();
            }
        return instance;
    }

    /**
     * Müşteri check-in fonksiyonu
     * Kafe'de kullanılabilir, boş bir masa varsa müşteri buraya check-in yapar. Yoksa bekleme salonuna gönderilir.
     * Multi thread safe olabilmesi için *synchronized* tanımlı fonksiyon
     * @return available Computer or null
     */
    public synchronized Computer checkIn(Customer customer) {
        Computer availableComputer = getAvailableComputer();
        if (availableComputer != null) {                        // Kullanılabilir, boş masa varsa
            if (computerList.contains(availableComputer)) {     // Daha önce açılmış bir masa mı?
                int index = computerList.indexOf(availableComputer);
                computerList.get(index).customer = customer;
            } else if (computerList.size() < cafeCapacity) {    // Daha önce açılmamış bir masa ise müşteriye yeni masa aç.
                availableComputer.customer = customer;
                computerList.add(availableComputer);
            }
            if (waitingList.contains(customer)) {               // Eğer kullanıcı bekleme salonundan geldiyse salon listesini güncelle.
                datedPrint("----------------------------------------------------------");
                datedPrint(customer.name + " bekleme salonundan çağırılıyor...");
                waitingList.remove(customer);
            }
            datedPrint("----------------------------------------------------------");
            datedPrint( availableComputer.id + "'e " + availableComputer.customer.name + " oturdu.");
            customerList.add(customer);
            report();
        } else {                                                // Eğer uygun masa bulanamadıysa
            if (!waitingList.contains(customer)) {
                datedPrint("----------------------------------------------------------");
                datedPrint( "Boş masa bulunamadı." + customer.name + " bekleme salonuna alınıyor...");
                waitingList.add(customer);                      // Müşteriyi bekleme salonuna gönder.
            }
        }
        return availableComputer;
    }

    /**
     * Müşteri check-out fonksiyonu
     * Multi thread safe olabilmesi için *synchronized* tanımlı fonksiyon
     * Müşteri süresi dolduğunda check-out yapar.
     */
    public synchronized void checkOut(Customer customer) {
        for (var computer : computerList) {
            if (computer.customer == customer) {
                datedPrint(computer.id + "'in süresi doldu.");
                datedPrint(customer.name + " kalktı ve cafeden ayrıldı.");
                datedPrint(computer.id + " artık boş.");
                computer.clearCustomer();                      // Müşteri masadan kalktı.
                customerList.remove(customer);                 // Müşteri kafeden ayrıldı.
                break;
            }
        }
       report();
    }

    /**
     * Kafe'de kullanılabilir, boş bir masa kontrol fonksiyonu
     * @return available Computer or null
     */
    private Computer getAvailableComputer() {
        if (computerList.isEmpty())                 // Açık bilgisayar yoksa yeni masa aç.
            return new Computer(getNewComputerID());

        for (var computer: computerList) {          // Müsait bir masa bul.
            if (!computer.isOccupied())
                return computer;
        }

        if (computerList.size() < cafeCapacity)    // Eğer müsait masa yoksa ve kapasite dolmadıysa yeni masa aç.
            return new Computer(getNewComputerID());
        else
            return null;                           // Kapasite doluysa null dön.
    }

    /**
     * Raporlama fonksiyonu
     * Kafedeki müşteri ve masalar hakkında bilgi verir.
     */
    private void report() {
        datedPrint("----------------------------------------------------------");
        if (customerList.isEmpty()) {
            datedPrint("Masaların hepsi boş.");
            datedPrint("----- Internat cafe kapatılıyor. -----");
        } else {
            datedPrint("----- Masa Durumu -> " + computerList.toString().replace("]", ""));
            System.out.println("---------------------]");
        }
        datedPrint("----------------------------------------------------------");
        if (!waitingList.isEmpty())
            datedPrint("----- Bekleme Salonu Durumu -> " + waitingList);
    }

    /**
     * @return Yeni masa adı
     */
    private String getNewComputerID() {
        return "Masa " + (computerList.size() + 1);
    }

}
