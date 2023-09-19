package student;
import java.util.*;
import java.io.*;

public class SerializationTest {
    Scanner sc = new Scanner(System.in);
    
    void serializationTest() {

        Student obj1 = new Student("Max", "12-12-1997", "Indore", "Madhya Pradesh", 452001, "India");
    
        Student obj2 = new Student("Alex", "03-10-1995", "Indore", "Madhya Pradesh", 452001, "India");
    
        Student obj3 = new Student("Ross", "15-03-1999", "Indore", "Madhya Pradesh", 452001, "India");
    
        Student obj4 = new Student("Max", "07-11-1992", "Indore", "Madhya Pradesh", 452001, "India");
    
        ArrayList<Student> list = new ArrayList<>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
    
        String inputFileName;
        System.out.print("enter file name to write objects: ");               //take file name as command line argument from user
        inputFileName = sc.nextLine().trim();
    
        try {
            FileOutputStream fout = new FileOutputStream(inputFileName);
            ObjectOutputStream out = new ObjectOutputStream(fout);
    
            for (Student obj : list) {
                out.writeObject(obj);
                System.out.println("record written successfully");
            }
            out.flush();
            out.close();
        } catch (FileNotFoundException exc) {
            System.out.println("given file name not found");
        } catch (IOException exc) {
            System.out.println("an error occured while writing objects");
        }
    }
}

