package Comprehensive;
// Create a Subject class with a subjectName and a marks variable. Store 5 subjects in an array. For each subject, use switch or if-else to assign grades:

//     ≥ 90 → A
//     80–89 → B
//     70–79 → C
//     Below 70 → D

// Display subject name, marks, and grade.
import java.util.Scanner;
public class Subject {
    String subjectName;
    double marks;

    public Subject(String subjectName, double marks) {
        this.subjectName = subjectName;
        this.marks = marks;
    }

    public char assignGrade() {
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
    public void displayInfo() {
        System.out.println("Subject: " + subjectName);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + assignGrade());
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Subject[] subjects = new Subject[5];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Enter subject name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks for " + name + ": ");
            double marks = scanner.nextDouble();
            scanner.nextLine();

            subjects[i] = new Subject(name, marks);
        }

        System.out.println("\nSubject Details:");
        for (Subject subject : subjects) {
            subject.displayInfo();
            System.out.println();
        }

        scanner.close();
    }
}