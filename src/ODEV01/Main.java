package ODEV01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Enes Kamil YILMAZ on 08/03/2022
 */

class Main { //default access specifier for Class

    //uninitialized and initialized variables
    //static member variables and Static functions and invocations
    static ArrayList<Vehicle> vehicleList; ///arrays that can shrink at run time: ArrayList
    static ArrayList<Passenger> passengerList1 = new ArrayList<>();
    static ArrayList<Passenger> passengerList2 = new ArrayList<>();
    static ArrayList<Passenger> passengerList3 = new ArrayList<>();

    public static void main(String[]args) {

        fillLists();

        for (Vehicle vehicle : vehicleList) { // Range base for loop: foreach
            if (vehicle instanceof Car)
                System.out.println(vehicle.pureDefinition());
            System.out.println(vehicle.toString());
        }


        //Generic example
        GenericClass<String> type = new GenericClass<>();
        type.set("Enes");
        GenericClass type1 = new GenericClass();
        type1.set(true);
        type1.set(12687391);
    }

    public static void fillLists() {

        //Java'da fonksiyonlara verilen parametreler her zaman pass by value şeklindedir.

        vehicleList = new ArrayList<>();
        Passenger enes = new Passenger("Enes", "Yılmaz", true, "Car"); //instance of a class
        passengerList1.add(enes);
        passengerList1.add(new Passenger("Aleyna", "Yılmaz", true, "Car"));

        Car reno = new Car("Renault", "Grey", "Megane", "2021",
                "",140,140, "Petrol", "Sedan",
                "4", "Automatic", "10.000", passengerList1.get(0), passengerList1);
        reno.accidentReports.add("05.10.2021 tarihinde arkadan çarpma şeklinde bir kazaya karışmıştır.");
        reno.changedParts.put("06.10.2021", List.of("Ön çamurluk","Turbo Radyatör"));
        vehicleList.add(reno);

        passengerList2.add(new Passenger("Ahmet", "Yiğit", true, "Car"));
        passengerList2.add(new Passenger("Ayşe", "Yiğit", true, "Car"));
        passengerList2.add(new Passenger("Ebru", "Keser"));
        passengerList2.add(new Passenger("Eray", "Acar"));
        vehicleList.add(
                new Car("Nissan", "White", "Qashqai", "2017",
                        "",120,120, "Diesel", "SUV",
                        "4", "Automatic", "40.000",passengerList2.get(0), passengerList2)
        );

        passengerList3.add(new Passenger("Mahmut", "Yiğit", true, "Aircraft"));
        vehicleList.add(
                new Aircraft(
                        "Airbus", "White", "A380", "2010",
                        "", 10000, 10000, "Petrol", passengerList3.get(0), passengerList3
                )
        );
    }

}

