package Comprehensive;
//Create a class TemperatureConverter that uses a final constant for the formula to convert Celsius to Fahrenheit. 
// Accept a temperature from the user (using Scanner) and display both Celsius and Fahrenheit values.
import java.util.Scanner;
public class TempCon {
    static final double Constant = 32.0;
    static final double Multiplier = 1.8;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = ((celsius * Multiplier) + Constant);
        
        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        scanner.close();
    }
}