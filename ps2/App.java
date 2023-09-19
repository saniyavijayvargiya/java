package shapes;
import shapes.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String args[]) {
        int cont = 1;
        int option;
        Scanner sc = new Scanner(System.in);
        float radius, side, base, height, length, breadth;

        System.out.println("choose a shape to find perimeter/area/volume");
        System.out.println("1) circle");
        System.out.println("2) square");
        System.out.println("3) rectangle");
        System.out.println("4) triangle");
        System.out.println("5) sphere");
        System.out.println("6) cube");
        System.out.println("7) cylinder");

        do {
            try {
                System.out.print("enter option number: ");
                option = sc.nextInt();
    
                if (option == 1) {
                    System.out.print("enter radius: ");
                    radius = sc.nextFloat();
                    Circle circle = new Circle(radius);
                    circle.circumference();
                    circle.area();
                }
                else if (option == 2) {
                    System.out.print("enter side: ");
                    side = sc.nextFloat();
                    Square square = new Square(side);
                    square.perimeter();
                    square.area();
                } 
                else if (option == 3) {
                    System.out.print("enter length: ");
                    length = sc.nextFloat();
                    System.out.print("enter breadth: ");
                    breadth = sc.nextFloat();
                    Rectangle rect = new Rectangle(length, breadth);
                    rect.perimeter();
                    rect.area();
                } 
                else if (option == 4) {
                    System.out.print("enter base: ");
                    base = sc.nextFloat();
                    System.out.print("enter height");
                    height = sc.nextFloat();
                    Triangle tri = new Triangle(base, height);
                    tri.perimeter();
                    tri.area();
                } 
                else if (option == 5) {
                    System.out.print("enter radius: ");
                    radius = sc.nextFloat();
                    Sphere sphere = new Sphere(radius);
                    sphere.area();
                    sphere.volume();
                } 
                else if (option == 6) {
                    System.out.print("enter side: ");
                    side = sc.nextFloat();
                    Cube cube = new Cube(side);
                    cube.area();
                    cube.volume();
                } 
                else if (option == 7) {
                    System.out.print("enter radius: ");
                    radius = sc.nextFloat();
                    System.out.print("enter height: ");
                    height = sc.nextFloat();
                    Cylinder cyl = new Cylinder(radius, height);
                    cyl.area();
                    cyl.volume();
                }
                else {
                    System.out.print("incorrect option entered");
                }
    
                System.out.print("enter 1 to continue or any other number to exit: ");
                cont = sc.nextInt();
            }
            catch (InputMismatchException exc) {
                System.out.println("invalid input");
                break;
            }
            
        } while (cont == 1);
        sc.close();
    }
}
