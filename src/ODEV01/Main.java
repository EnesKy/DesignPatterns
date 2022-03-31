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
    static ArrayList<Person> personList1 = new ArrayList<>();
    static ArrayList<Person> personList2 = new ArrayList<>();
    static ArrayList<Person> personList3 = new ArrayList<>();

    public static void fillLists(Person driver) {

        //Java'da fonksiyonlara verilen parametreler her zaman pass by value şeklindedir.

        vehicleList = new ArrayList<>();
        personList1.add(driver);
        personList1.add(new Person("Aleyna", "Yılmaz", true, "Car"));

        Car reno = new Car("Renault", "Grey", "Megane", "2021",
                "",140,140, "Petrol", "Sedan",
                "4", "Automatic", "10.000", personList1.get(0), personList1);
        reno.accidentReports.add("05.10.2021 tarihinde arkadan çarpma şeklinde bir kazaya karışmıştır.");
        reno.changedParts.put("06.10.2021", List.of("Ön çamurluk","Turbo Radyatör"));
        vehicleList.add(reno);

        personList2.add(new Person("Ahmet", "Yiğit", true, "Car"));
        personList2.add(new Person("Ayşe", "Yiğit", true, "Car"));
        personList2.add(new Person("Ebru", "Keser"));
        personList2.add(new Person("Eray", "Acar"));
        vehicleList.add(
                new Car("Nissan", "White", "Qashqai", "2017",
                        "",120,120, "Diesel", "SUV",
                        "4", "Automatic", "40.000", personList2.get(0), personList2)
        );

        personList3.add(new Person("Mahmut", "Yiğit", true, "Aircraft"));
        vehicleList.add(
                new Aircraft(
                        "Airbus", "White", "A380", "2010",
                        "", 10000, 10000, "Petrol", personList3.get(0), personList3
                )
        );
    }

    public static void main(String[]args) {

        Person enes = new Person("Enes", "Yılmaz", true, "Car"); //instance of a class
        fillLists(enes);

        for (Vehicle vehicle : vehicleList) { // Range base for loop: foreach
            if (vehicle instanceof Car) {
                System.out.println(vehicle.pureDefinition());
                System.out.println(vehicle.definition());
            }
            System.out.println(vehicle.toString());
        }

        //Generic example
        GenericClass<String> type = new GenericClass<>();
        type.set("Enes");
        GenericClass type1 = new GenericClass();
        type1.set(true);
        type1.set(12687391);

    }

}

