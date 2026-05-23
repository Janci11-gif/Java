package medium;
import java.util.Scanner;
public class bankAccount {
    String accountHolderName;
    String accountNumber;
    double balance;

    public bankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Amount withdrawn. New balance: " + balance);
        }
    }
    public static void main(String[] args) {
        bankAccount account1 = new bankAccount("Sahil", "123456789", 1000.00);

        System.out.println("Account Balance: "+account1.balance);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account1.deposit(depositAmount);

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account1.withdraw(withdrawalAmount);
        scanner.close();
    }
}