package medium;
import java.util.Scanner;
public class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public char calculateGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for student 1: ");
        String name1 = scanner.nextLine();
        System.out.print("Enter marks for student 1: ");
        int marks1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name for student 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter marks for student 2: ");
        int marks2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name for student 3: ");
        String name3 = scanner.nextLine();
        System.out.print("Enter marks for student 3: ");
        int marks3 = scanner.nextInt();
        scanner.close();

        Student student1 = new Student(name1, marks1);
        Student student2 = new Student(name2, marks2);
        Student student3 = new Student(name3, marks3);

        System.out.println("Student 1: " + student1.name + ", Grade: " + student1.calculateGrade());
        System.out.println("Student 2: " + student2.name + ", Grade: " + student2.calculateGrade());
        System.out.println("Student 3: " + student3.name + ", Grade: " + student3.calculateGrade());
    }
}
    
