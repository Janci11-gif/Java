class Student {
    private String name;
    private String rollNumber;
    private double[] marks;
    
    Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    double calculateAverage() {
        double sum = 0;
        for(double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", Roll: " + rollNumber);
        System.out.println("Average: " + calculateAverage());
    }
}

class GraduateStudent extends Student {
    String thesisTopic;
    
    GraduateStudent(String name, String rollNumber, double[] marks, String thesisTopic) {
        super(name, rollNumber, marks);
        this.thesisTopic = thesisTopic;
    }
    
    void printThesis() {
        System.out.println("Thesis: " + thesisTopic);
    }
    
    void displayInfo() {
        super.displayInfo();
        printThesis();
    }
}

public class GradeBook {
    public static void main(String[] args) {
        Student undergrad = new Student("Alice", "UG001", new double[]{85, 90, 78});
        GraduateStudent grad = new GraduateStudent("Bob", "GR001", new double[]{95, 88, 92}, "AI Research");
        
        undergrad.displayInfo();
        grad.displayInfo();
    }
}
