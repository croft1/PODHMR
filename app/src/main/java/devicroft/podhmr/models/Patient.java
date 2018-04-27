package devicroft.podhmr.models;

/**
 * Created by m on 04-Mar-17.
 */

public class Patient {

    String fullName;
    String dob;
    int medicareNumber;
    String address;
    String phoneNumber;
    String regularPharmacy;
    String allergies;

    public Patient(String name, String dob, int medicareNumber, String address, String phoneNumber, String regularPharmacy, String allergies) {
        fullName = name;
        this.dob = dob;
        this.medicareNumber = medicareNumber;
        this.address = address;

    }



    public String getFullName() {
        return fullName;
    }

    public void setName(String name) {
        this.fullName = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMedicareNumber() {
        return medicareNumber;
    }

    public void setMedicareNumber(int medicareNumber) {
        this.medicareNumber = medicareNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRegularPharmacy() {
        return regularPharmacy;
    }

    public void setRegularPharmacy(String regularPharmacy) {
        this.regularPharmacy = regularPharmacy;
    }
}
