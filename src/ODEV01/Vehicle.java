package ODEV01;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public abstract class Vehicle { //Vasıta

    String type;
    String brand;
    String model;
    String color;
    String productionYear;
    String engineName;
    int enginePower;
    int engineCapacity;
    String fuelType;
    Passenger driver; // Aggregation
    ArrayList<Passenger> passengerList;

    abstract String pureDefinition(); //pure virtual func

    interface VehicleFuncs { //virtual func
        String definition();
    }

    private String privateDefinition() {
        return "Private info";
    }

    public Vehicle(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType,
            Passenger driver, ArrayList<Passenger> passengerList
    ) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.engineName = engineName;
        this.enginePower = enginePower;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.driver = driver;
        this.passengerList = passengerList;
    }

    public void setType(String type) {
        this.type = type;
    }

}
