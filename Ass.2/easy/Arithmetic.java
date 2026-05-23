//Simple arithmetic operations Write a Java program that declares two integers and prints their sum, difference, product, and quotient.
public class Arithmetic {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}
