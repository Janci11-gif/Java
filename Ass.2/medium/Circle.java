package medium;
public class Circle {
    double radius;
    final double PI = 3.14159;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10);
        System.out.println("Circle 1 - Area: " + circle1.calculateArea() + ", Circumference: " + circle1.calculateCircumference());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea() + ", Circumference: " + circle2.calculateCircumference());
    }
}