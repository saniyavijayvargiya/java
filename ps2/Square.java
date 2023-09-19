package shapes;

public class Square {
    float side;

    Square(float side) {
        this.side = side;
    }

    void perimeter() {
        System.out.print("perimeter is ");
        System.out.println(4 * side);
    }

    void area() {
        System.out.print("area is ");
        System.out.println(side * side);
    }
}
