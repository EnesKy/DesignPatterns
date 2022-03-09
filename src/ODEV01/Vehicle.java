package ODEV01;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public class Vehicle { //Vasıta

    String type;
    String brand;
    String model;
    String color;
    String productionYear;
    String engineName;
    int enginePower;
    int engineCapacity;
    String fuelType;

    public Vehicle(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType
    ) {
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.productionYear = productionYear;
        this.engineName = engineName;
        this.enginePower = enginePower;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
