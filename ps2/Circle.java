package shapes;
import java.lang.Math;

public class Circle {
    float radius;
    static final double pi = Math.PI;

    Circle(float radius) {
        this.radius = radius;
    }

    void circumference() {
        System.out.print("circumference is ");
        System.out.println(2 * pi * radius);
    }

    void area() {
        System.out.print("area is ");
        System.out.println(pi * Math.pow(radius, 2));
    }
}
