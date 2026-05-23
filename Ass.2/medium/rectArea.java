package medium;
public class rectArea {
    double length;
    double width;

    public rectArea(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public static void main(String[] args) {
        rectArea rectangle1 = new rectArea(5.0, 3.0);
        rectArea rectangle2 = new rectArea(7.5, 4.5);
        rectArea rectangle3 = new rectArea(10.0, 6.0);

        System.out.println("Area of Rectangle 1: " + rectangle1.calculateArea());
        System.out.println("Area of Rectangle 2: " + rectangle2.calculateArea());
        System.out.println("Area of Rectangle 3: " + rectangle3.calculateArea());
    }
    
}