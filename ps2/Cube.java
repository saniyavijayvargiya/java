package shapes;
import java.lang.Math;

public class Cube {
    float side;

    Cube (float side) {
        this.side = side;
    }

    void area() {
        System.out.print("area is ");
        System.out.println(6 * Math.pow(side, 2));
    }

    void volume() {
        System.out.print("volume is ");
        System.out.println(Math.pow(side, 3));
    }
}
