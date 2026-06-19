abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length;
    double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    double calculateArea() {
        return 3.14159 * radius * radius;
    }
}

class Triangle extends Shape {
    double base;
    double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Rectangle(5, 8),
            new Circle(4),
            new Triangle(6, 10)
        };
        
        double totalArea = 0;
        for(Shape shape : shapes) {
            double area = shape.calculateArea();
            totalArea += area;
            System.out.println("Area: " + area);
        }
        System.out.println("Total area: " + totalArea);
    }
}
