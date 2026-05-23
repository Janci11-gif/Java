package Comprehensive;
//Create a Laptop class with brand, ramSize, and storage. 
// Create 3 objects and display their specs only if the RAM is 8 GB or more.

public class Laptop {
    String brand;
    int ramSize;
    int storage;

    public Laptop(String brand, int ramSize, int storage) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.storage = storage;
    }

    public void displaySpecs() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM Size: " + ramSize + " GB");
        System.out.println("Storage: " + storage + " GB");
    }

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Dell", 16, 512);
        Laptop laptop2 = new Laptop("HP", 8, 256);
        Laptop laptop3 = new Laptop("Lenovo", 12, 1024);

        if (laptop1.ramSize >= 8) {
            laptop1.displaySpecs();
            System.out.println();
        }

        if (laptop2.ramSize >= 8) {
            laptop2.displaySpecs();
            System.out.println();
        }

        if (laptop3.ramSize >= 8) {
            laptop3.displaySpecs();
            System.out.println();
        }
    }
}