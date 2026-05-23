package Comprehensive;
//Write a Java program that takes two numbers from command line arguments and prints their sum and product. 
// Validate that the user enters exactly two arguments.
public class ArgSumCalc {
    public static void main(String[] args) {
       
        if (args.length != 2) {
            System.out.println("Error: Please provide exactly two numbers.");
            return; 
        }

        try {
           
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
 
            double sum = num1 + num2;
            double product = num1 * num2;

            
            System.out.println("Sum: " + sum);
            System.out.println("Product: " + product);

        } catch (NumberFormatException e) {
            System.out.println("Error: Arguments must be valid numbers.");
        }
    }
}