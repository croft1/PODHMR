package devicroft.podhmr.models;

import com.google.android.gms.maps.model.LatLng;

/**
 * Created by m on 04-Mar-17.
 */

public class Pharmacist {

    int registrationAHPRA;
    int pharmacyApprovalNumber;
    int gender; //enum 0 male, 1 female.
    String name;
    String email;
    LatLng homePharmacyLocation;

    public Pharmacist(int registrationAHPRA, int pharmacyApprovalNumber, int gender, String name, String email, LatLng homePharmacyLocation) {
        this.registrationAHPRA = registrationAHPRA;
        this.pharmacyApprovalNumber = pharmacyApprovalNumber;
        this.gender = gender;
        this.email = email;
        this.homePharmacyLocation = homePharmacyLocation;

    }

    public int getRegistrationAHPRA() {
        return registrationAHPRA;
    }

    public void setRegistrationAHPRA(int registrationAHPRA) {
        registrationAHPRA = registrationAHPRA;
    }

    public int getPharmacyApprovalNumber() {
        return pharmacyApprovalNumber;
    }

    public void setPharmacyApprovalNumber(int pharmacyApprovalNumber) {
        pharmacyApprovalNumber = pharmacyApprovalNumber;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LatLng getHomePharmacyLocation() {
        return homePharmacyLocation;
    }

    public void setHomePharmacyLocation(LatLng homePharmacyLocation) {
        this.homePharmacyLocation = homePharmacyLocation;
    }


}
