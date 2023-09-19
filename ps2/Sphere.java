package shapes;
import java.lang.Math;

public class Sphere {
    float radius;
    static final double pi = Math.PI;

    Sphere(float radius) {
        this.radius = radius;
    }

    void area() {
        System.out.print("area is ");
        System.out.println(4 * pi * Math.pow(radius, 2));
    }

    void volume() {
        System.out.print("volume is ");
        System.out.println((4/3) * pi * Math.pow(radius, 3));
    }
}
