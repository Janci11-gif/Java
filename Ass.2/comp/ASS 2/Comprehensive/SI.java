package Comprehensive;
//Create a class SimpleInterest with principal, rate, and time as private variables. 
// Use a constructor to initialize them and a method calculateInterest() to return simple interest. 
// Display the result.

public class SI {
    double principal;
    double rate;
    double time;

    public SI(double principal, double rate, double time) {
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    public double calculateInterest() {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        SI si = new SI(1000, 5, 2);
        System.out.println("Simple Interest: " + si.calculateInterest());
    }
}