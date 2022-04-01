package odev1.codes;

import java.util.*;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public class Car extends Vehicle {
    //Otomobil: Arazi, Suv, Sedan, Hatchback, Cabrio, Station Wagon, Pick up

    String vehicleType = "Car";
    String carType;
    String doorCount;
    String transmissionType;
    String kilometer;
    Stack<String> accidentReports = new Stack<>();
    Map<String, List<String>> changedParts = new HashMap<>();

    public Car(
            String brand, String color, String model, String productionYear, String engineName, int enginePower,
            int engineCapacity, String fuelType, String vehicleType, String doorCount, String transmissionType,
            String kilometer, Person driver, ArrayList<Person> personList
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, personList);
        this.setType(vehicleType);
        this.vehicleType = vehicleType; //this for disambiguation
        this.doorCount = doorCount;
        this.transmissionType = transmissionType;
        this.kilometer = kilometer;
    }

    @Override
    public String toString() { //method overriding
        return "Car{" +
                "vehicleType='" + vehicleType + '\'' +
                ", carType='" + carType + '\'' +
                ", doorCount='" + doorCount + '\'' +
                ", transmissionType='" + transmissionType + '\'' +
                ", kilometer='" + kilometer + '\'' +
                '}';
    }

    @Override
    String pureDefinition() { //virtual functions
        return "Car: brand: " + brand + ", model: " + model + ", year: " + productionYear;
    }

    @Override
    public String definition() {
        return "Pure Car: brand: " + brand + ", model: " + model + ", year: " + productionYear;
    }

    //@Override //Can't override privateDefinition
    public String privateDefinition() {
        return "Can't override privateDefinition";
    }

    @Override
    String publicDefinition() {
        return super.publicDefinition();
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(String doorCount) {
        this.doorCount = doorCount;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getKilometer() {
        return kilometer;
    }

    public void setKilometer(String kilometer) {
        this.kilometer = kilometer;
    }

}
