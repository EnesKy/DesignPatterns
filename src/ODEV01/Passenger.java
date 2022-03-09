package ODEV01;

public class Passenger {

    String name;
    String surname;
    String age;
    String gender;
    Boolean haveLicence;
    String licenceCapability; //Car, Motocycle, Marine, Aircraft

    public Passenger(String name, String surname, String age, String gender, Boolean haveLicence, String licenceCapability) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.haveLicence = haveLicence;
        this.licenceCapability = licenceCapability;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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
