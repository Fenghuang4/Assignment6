// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Circle smallCircle = new Circle(5);

        System.out.println("Area of small circle is :"+ smallCircle.getArea());
        System.out.println("Circumference of small circle is :"+ smallCircle.getCircumference());

        Circle bigCircle = new Circle(15);

        System.out.println("Area of small circle is :"+ bigCircle.getArea());
        System.out.println("Circumference of small circle is :"+ bigCircle.getCircumference());
    }
}