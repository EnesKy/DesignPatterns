package odev2.codes;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {

        //Müşteriler kapıda sıra olmaya başladılar.
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Customer 1"));
        customers.add(new Customer("Customer 2"));
        customers.add(new Customer("Customer 3"));
        customers.add(new Customer("Customer 4"));
        customers.add(new Customer("Customer 5"));
        customers.add(new Customer("Customer 6"));
        customers.add(new Customer("Customer 7"));
        customers.add(new Customer("Customer 8"));
        customers.add(new Customer("Customer 9"));
        customers.add(new Customer("Customer 10"));
        customers.add(new Customer("Customer 11"));
        customers.add(new Customer("Customer 12"));
        customers.add(new Customer("Customer 13"));
        customers.add(new Customer("Customer 14"));
        customers.add(new Customer("Customer 15"));

        //Kapı açıldı. Müşteriler içeriye akın ediyor.
        for (var customer : customers)
            customer.start();

    }

}
