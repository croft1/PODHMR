package devicroft.podhmr.models;

/**
 * Created by m on 04-Mar-17.
 */

public class GP {

    String name;
    long registrationAHPRA;
    long providerNumber;
    String email;
    String qualifications; //MBBS


    public GP(String name, long ahpra, long providerNumber, String email, String qualifications) {
        this.name = name;
        registrationAHPRA = ahpra;
        this.providerNumber = providerNumber;
        this.email = email;
        this.qualifications = qualifications;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRegistrationAHPRA() {
        return registrationAHPRA;
    }

    public void setRegistrationAHPRA(long registrationAHPRA) {
        this.registrationAHPRA = registrationAHPRA;
    }

    public long getProviderNumber() {
        return providerNumber;
    }

    public void setProviderNumber(long providerNumber) {
        this.providerNumber = providerNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
