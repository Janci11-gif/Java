package Comprehensive;
//Create a Customer class with name, isMember (boolean), and purchaseAmount. 
// If a customer is a member and purchase amount > 1000, apply 15% discount. Otherwise, no discount. 
// Display final amount payable.
import java.util.Scanner;
public class Customer {
     String name;
     boolean isMember;
     double purchaseAmount;

    public Customer(String name, boolean isMember, double purchaseAmount) {
        this.name = name;
        this.isMember = isMember;
        this.purchaseAmount = purchaseAmount;
    }

    public double calculateFinalAmount() {
        double finalAmount = purchaseAmount;
        if (isMember && purchaseAmount > 1000) {
            finalAmount = purchaseAmount - (purchaseAmount * 0.15);
        }
        return finalAmount;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Is Member: " + isMember);
        System.out.println("Purchase Amount: " + purchaseAmount);
        System.out.println("Final Amount Payable: " + calculateFinalAmount());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        System.out.print("Are you a member? (true/false): ");
        boolean isMember = scanner.nextBoolean();
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        Customer customer = new Customer(name, isMember, purchaseAmount);
        customer.displayInfo();

        scanner.close();
    }
}