package shapes;
import java.lang.Math;

public class Triangle {
    float base, height;

    Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    void perimeter() {
        double temp = Math.pow((base*base + height*height), 0.5);
        System.out.print("perimeter is ");
        System.out.println(base + height + temp);
    }

    void area() {
        System.out.print("area is ");
        System.out.println(0.5 * base * height);
    }
}
