package ODEV01;

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

    public Car(
            String brand, String color, String model, String productionYear, String engineName, int enginePower,
            int engineCapacity, String fuelType, String vehicleType, String doorCount, String transmissionType, String kilometer
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType);
        this.setType(vehicleType);
        this.vehicleType = vehicleType;
        this.doorCount = doorCount;
        this.transmissionType = transmissionType;
        this.kilometer = kilometer;
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
