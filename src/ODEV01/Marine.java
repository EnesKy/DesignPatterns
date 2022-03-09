package ODEV01;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public class Marine extends Vehicle {
    // Deniz Araçları: Motoryat, Yelkenli, Katamaran, Sürat Teknesi, Bot, Jet Ski, Sandal, Gezi Teknesi,
    // Balıkçı Teknesi, Yolcu Gemisi, Yük Gemisi / Tanker, Denizaltı

    String vehicleType = "Marine";

    public Marine(
            String brand, String color, String model, String productionYear,
            String engineName, int enginePower, int engineCapacity, String fuelType,
            Passenger driver, ArrayList<Passenger> passengerList
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, passengerList);
        this.setType(vehicleType);
    }

    @Override
    String pureDefinition() {
        return null;
    }

}
