package student;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Student extends Address {
    String firstName;
    Date dob;
    Address address;

    Student(String firstName, String date, String city, String state, int pincode, String country) {
        
        super(city, state, pincode, country);
        this.firstName = firstName;
        try {
            this.dob = new SimpleDateFormat("dd-MM-yyyy").parse(date);              //convert date from string to date class
        } catch (ParseException exc) {
            System.out.println("error in the date");
        }
    }
}
