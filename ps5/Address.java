package student;
import java.io.Serializable;

public class Address implements Serializable {                 //implement class Serializable for reading/writing objects
    String city, state, country;
    int pincode;

    Address(String city, String state, int pincode, String country) {
        this.city = city;
        this.state = state;
        this.pincode = pincode;
        this.country = country;
    }
}
