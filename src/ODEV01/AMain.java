package ODEV01;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public class AMain {

    public static void main(String[]args) {

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        ArrayList<Passenger> passengerList = new ArrayList<>();



        for (Vehicle vehicle : vehicleList) {
            System.out.println(vehicle.type);
        }


        System.out.println("Selamlar");
    }

}

