package odev1.codes;

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
            Person driver, ArrayList<Person> personList
    ) {
        super(brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType, driver, personList);
        this.setType(vehicleType);
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
