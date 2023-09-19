package student;
import java.util.*;
import java.io.*;

public class DeserializationTest {
    Scanner sc = new Scanner(System.in);

    void deserializationTest() {
        String inputFileName;
        System.out.print("enter file name to read objects: ");
        inputFileName = sc.nextLine().trim();
        Student obj;
    
        try {
            FileInputStream fin = new FileInputStream(inputFileName);
            ObjectInputStream in = new ObjectInputStream(fin);
            
            for (int i = 0; i < 4; i++) {
                obj = (Student)in.readObject();
                System.out.println(obj.firstName + ", " + obj.dob + ", " + obj.city + ", " + obj.state + "(" + obj.pincode + ")");
            }
            in.close();
        } catch (FileNotFoundException exc) {
            System.out.println("given file name not found");
        } catch (IOException exc) {
            System.out.println("an error occurred while reading objects");
        } catch (ClassNotFoundException exc) {
            System.out.println("an error occurred while reading objects");
        } 
    }
}

