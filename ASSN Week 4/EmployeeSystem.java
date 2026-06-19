class Employee {
    private String name;
    private String id;
    protected double baseSalary;
    
    Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }
    
    double calculateSalary() {
        return baseSalary;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employee {
    double bonus;
    
    Manager(String name, String id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }
    
    double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employee {
    double overtimeHours;
    
    Developer(String name, String id, double baseSalary, double overtimeHours) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
    }
    
    double calculateSalary() {
        return baseSalary + (overtimeHours * 50);
    }
}

public class EmployeeSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("John", "M001", 75000, 10000);
        Employee developer = new Developer("Sarah", "D001", 65000, 15);
        
        manager.displayInfo();
        developer.displayInfo();
    }
}
