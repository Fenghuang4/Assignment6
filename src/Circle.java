
public class Circle {
    int radius;
    public Circle(int inputRadius) {
        this.radius = inputRadius;
    }
    public double getCircumference() {
        return 2 * radius * 3.14159;
    }

    public double getArea() {
        return radius * radius * 3.14159;
    }
}
