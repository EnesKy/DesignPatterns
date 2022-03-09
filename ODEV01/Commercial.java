package ODEV01;

import java.util.ArrayList;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

public class Commercial extends Car {
    //Ticari Araçlar -> Kamyon, Tır, Otobüs, Minibüs, Çekici

    String carType = "Commercial";

    public Commercial(
            String brand, String color, String model, String productionYear, String engineName,
            int enginePower, int engineCapacity, String fuelType, String vehicleType,  String doorCount,
            String transmissionType, String kilometer, Passenger driver, ArrayList<Passenger> passengerList
    ) {
        super(
                brand, color, model, productionYear, engineName, enginePower, engineCapacity, fuelType,
                vehicleType, doorCount, transmissionType, kilometer, driver, passengerList
        );
        this.setCarType(carType);
    }



}
