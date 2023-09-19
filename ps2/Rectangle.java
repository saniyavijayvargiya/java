package shapes;

public class Rectangle {
    float length, breadth;

    Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void perimeter() {
        System.out.print("perimeter is ");
        System.out.println(2 * (length + breadth));
    }

    void area() {
        System.out.print("area is ");
        System.out.println(length * breadth);
    }
}
