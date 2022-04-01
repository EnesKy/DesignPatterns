package odev1.codes;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */
public class Motorcycle extends Vehicle {
    // Motosiklet-> Chopper, Commuter, Cross, Kar Motosikleti, Scooter, Sport Touring, Super Sport

    String vehicleType =  "Motorcycle";
    int wheelCount;

    public Motorcycle(
            String brand, String color, String model, String productionYear, String engineName, int enginePower,
            int engineCapacity, String fuelType, String vehicleType, int wheelCount, Person driver, ArrayList<Person> personList) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, personList);
        this.setType(vehicleType);
        this.wheelCount = wheelCount;
    }

    @Override
    String pureDefinition() {
        return null;
    }

    @Override
    public String definition() {
        return null;
    }
}
