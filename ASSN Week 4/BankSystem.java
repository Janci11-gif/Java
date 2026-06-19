class BankAccount {
    private String accountNumber;
    private double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }
    
    void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal");
        }
    }
    
    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    void withdraw(double amount) {
        if(getBalance() - amount >= 1000) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance of 1000 required");
        }
    }
    
    void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount("SAV001", 2500, 5.5);
        account.deposit(500);
        account.addInterest();
        account.withdraw(1800);
        account.withdraw(300);
        System.out.println("Final balance: " + account.getBalance());
    }
}
