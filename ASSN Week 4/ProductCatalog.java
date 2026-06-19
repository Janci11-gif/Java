class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void displayDetails() {
        System.out.println("Product: " + name + ", Price: " + price);
    }
}

class Electronics extends Product {
    int warranty;
    
    Electronics(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Warranty: " + warranty + " months");
    }
}

class Clothing extends Product {
    String size;
    
    Clothing(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }
    
    void displayDetails() {
        super.displayDetails();
        System.out.println("Size: " + size);
    }
}

public class ProductCatalog {
    public static void main(String[] args) {
        Product[] products = {
            new Electronics("Laptop", 800, 24),
            new Clothing("T-Shirt", 25, "L")
        };
        
        for(Product p : products) {
            p.displayDetails();
            System.out.println("---");
        }
    }
}
