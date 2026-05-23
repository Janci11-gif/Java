public class Car {
    String brand;
    String model;
    double price;

    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2500000);
        Car car2 = new Car("Honda", "Civic", 1800000);
        Car car3 = new Car("Ford", "Mustang", 3500000);
        Car car4 = new Car("BMW", "X5", 5000000);
        Car car5 = new Car("Audi", "A4", 2800000);

        if (car1.price > 2000000) {
            System.out.println("Brand: " + car1.brand + ", Model: " + car1.model + ", Price: " + car1.price);
        }
        if (car2.price > 200