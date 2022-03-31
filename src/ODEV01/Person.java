package ODEV01;

public class Person {

    String name;
    String surname;
    Boolean haveLicence = false;
    String licenceCapability; //Car, Motocycle, Marine, Aircraft

    public Person() {}

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.haveLicence = false;
    }

    //Compiler-generated default constructor
    public Person(String name, String surname, Boolean haveLicence, String licenceCapability) {
        this.name = name;
        this.surname = surname;
        this.haveLicence = haveLicence;
        this.licenceCapability = licenceCapability;
    }

    //Copy constructor
    Person(Person p) {
        name = p.name;
        surname = p.surname;
        haveLicence = p.haveLicence;
        licenceCapability = p.licenceCapability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getHaveLicence() {
        return haveLicence;
    }

    public void setHaveLicence(Boolean haveLicence) {
        this.haveLicence = haveLicence;
    }

    public String getLicenceCapability() {
        return licenceCapability;
    }

    public void setLicenceCapability(String licenceCapability) {
        this.licenceCapability = licenceCapability;
    }

}
