package Comprehensive;
// //Create a class TaxPayer with name and income. Write a method to calculate tax using if-else:

//     Income < 2,50,000 → No Tax
//     2,50,000 to 5,00,000 → 10%
//     5,00,000 to 10,00,000 → 20%
//     Above 10,00,000 → 30%

// Display the name and tax payable.
public class TaxPayer {
    private String name;
    private double income;

    public TaxPayer(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public double calculateTax() {
        double tax = 0;
        if (income < 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.1;
        } else if (income <= 1000000) {
            tax = income * 0.2;
        } else {
            tax = income * 0.3;
        }
        return tax;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Income: " + income);
        System.out.println("Tax Payable: " + calculateTax());
    }
    public static void main(String[] args) {
        TaxPayer taxpayer1 = new TaxPayer("Sahil", 300000);

        taxpayer1.displayInfo();
        System.out.println();
    }
}