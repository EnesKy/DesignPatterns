package ODEV01;

//Hava Taşıtları: Yolcu Uçağı, Savaş Uçağı, Helikopter, Zeplin, Planör, İnsansız Hava Aracı,
public class Aircraft extends Vehicle {

    String vehicleType = "Aircraft";

    public Aircraft(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType);
        this.setType(vehicleType);
    }

}
