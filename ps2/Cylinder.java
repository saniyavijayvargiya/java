package shapes;
import java.lang.Math;

public class Cylinder {
    float radius, height;
    static final double pi = Math.PI;

    Cylinder(float radius, float height) {
        this.radius = radius;
        this.height = height;
    }

    void area() {
        System.out.print("area is ");
        System.out.println((2 * pi * radius * height) + (2 * pi * Math.pow(radius, 2)));
    }

    void volume() {
        System.out.print("volume is ");
        System.out.println(pi * Math.pow(radius, 2) * height);
    }
}
