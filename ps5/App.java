package student;
import student.*;


public class App {
    
    public static void main(String args[]) {
        SerializationTest writer = new SerializationTest();
        writer.serializationTest();

        DeserializationTest reader = new DeserializationTest();
        reader.deserializationTest();
    }
}
