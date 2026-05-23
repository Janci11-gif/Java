

package medium;
public class Product {
    String productName;
    double price;
    double discountPercentage;

    public Product(String productName, double price, double discountPercentage) {
        this.productName = productName;
        this.price = price;
        this.discountPercentage = discountPercentage;
    }

    public double calculateFinalPrice() {
        return price - (price * discountPercentage / 100);
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500, 10);

        System.out.println("Final price of " + product1.productName + ": " + product1.calculateFinalPrice());

    }
}