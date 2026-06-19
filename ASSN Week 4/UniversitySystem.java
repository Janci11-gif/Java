class Person {
    private String name;
    private int id;
    
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    void getRoleDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Student extends Person {
    String program;
    
    Student(String name, int id, String program) {
        super(name, id);
        this.program = program;
    }
    
    void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("Student in: " + program);
    }
}

class Teacher extends Person {
    String subject;
    
    Teacher(String name, int id, String subject) {
        super(name, id);
        this.subject = subject;
    }
    
    void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("Teaching: " + subject);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Person student = new Student("Alice", 101, "Computer Science");
        Person teacher = new Teacher("Dr. Brown", 201, "Mathematics");
        
        student.getRoleDetails();
        teacher.getRoleDetails();
    }
}
