package Comprehensive;
//Create a Student class with name and an array of 3 subject marks. 
// Write a method to calculate the average and another to determine pass/fail status (average >= 40). 
// Display the name, marks, average, and result.

public class Student {
    String name;
    double[] marks;
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }
    public double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    public String determinePassFail() {
        double average = calculateAverage();
        return average >= 40 ? "Pass" : "Fail";
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("Average: " + calculateAverage());
        System.out.println("Result: " + determinePassFail());
    }
    public static void main(String[] args) {
        double[] marks = {45, 55, 65};
        Student student = new Student("Abin", marks);
        student.displayDetails();
    }
}