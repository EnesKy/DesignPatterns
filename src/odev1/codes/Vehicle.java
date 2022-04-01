package odev1.codes;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

interface VehicleFuncs { //virtual func
    String definition();
}

public abstract class Vehicle implements VehicleFuncs { //Araç, Vasıta

    private String privateDefinition() {
        return "Private info";
    }

    abstract String pureDefinition(); //pure virtual func

    String type;
    String brand;
    String model;
    String color;
    String productionYear;
    String engineName;
    int enginePower;
    int engineCapacity;
    String fuelType;
    Person driver = new Person(); // Composition -> Zorunlu kullanım: Sürücü olmadan taşıt kullanılamaz.
    ArrayList<Person> passengerList;

    String publicDefinition() {
        return "";
    }

    public Vehicle(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType,
            Person driver, ArrayList<Person> passengerList
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
