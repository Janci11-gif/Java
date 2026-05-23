package Comprehensive;
//Create a class MobilePhone with brand, model, and price. 
// Keep price as a private variable and provide getPrice() and setPrice() methods to access and update it. 
// Display phone details using a method.
public class MobilePhone {
    public String brand;
    public String model;
    private double price;

    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("Apple", "iPhone 13", 999.99);
        phone.displayDetails();

        
        phone.setPrice(899.99);
        System.out.println("Updated Price:");
        phone.displayDetails();
    }
}