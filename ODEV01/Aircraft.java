package ODEV01;

import java.util.ArrayList;

//Hava Taşıtları: Yolcu Uçağı, Savaş Uçağı, Helikopter, Zeplin, Planör, İnsansız Hava Aracı,
public class Aircraft extends Vehicle {

    String vehicleType = "Aircraft";
    Passenger hostes; //Composition -> zorunlu değil. Hostes olmadan da Hava Aracı oluşturulabilir.

    public Aircraft(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType,
            Passenger driver, ArrayList<Passenger> passengerList
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, passengerList);
        this.setType(vehicleType);
    }

    public Aircraft(  //Burada copilot olduğu için bu kullanım Aggregation
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType,
            Passenger driver, ArrayList<Passenger> passengerList, Passenger newHostes
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, passengerList);
        this.setType(vehicleType);
        this.hostes = newHostes;
    }

    @Override
    String pureDefinition() {
        return null;
    }

}
