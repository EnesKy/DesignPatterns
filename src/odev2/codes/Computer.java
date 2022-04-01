package odev2.codes;

public class Computer {

    String id;
    Customer customer;

    public Computer(String id) {
        this.id = id;
    }

    /**
     * @return true if computer is in use
     */
    public Boolean isOccupied() {
        return customer != null;
    }

    public void clearCustomer() {
        customer = null;
    }

    @Override
    public String toString() {
        if (customer == null)
            return "\n---------------------   " + id + " -> " + "Boş";
        else
            return "\n---------------------   " + id + " -> " + customer.name;
    }
}
