class FoodItem {
    private String name;
    private double price;
    
    FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    void displayMenuItem() {
        System.out.println(name + " - $" + price);
    }
}

class Pizza extends FoodItem {
    String size;
    String[] toppings;
    
    Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }
    
    void displayMenuItem() {
        super.displayMenuItem();
        System.out.println("Size: " + size + ", Toppings: " + String.join(",", toppings));
    }
}

class Burger extends FoodItem {
    String cheese;
    String pattyType;
    
    Burger(String name, double price, String cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }
    
    void displayMenuItem() {
        super.displayMenuItem();
        System.out.println(cheese + " cheese, " + pattyType + " patty");
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem pizza = new Pizza("Margherita", 12.99, "Large", new String[]{"Cheese", "Tomato"});
        FoodItem burger = new Burger("Classic", 8.99, "Swiss", "Beef");
        
        pizza.displayMenuItem();
        burger.displayMenuItem();
    }
}
