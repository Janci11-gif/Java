public class Employee {
    String name;
    double salary;
    int yearsOfExperience;

    public Employee(String name, double salary, int yearsOfExperience) {
        this.name = name;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
    }

    public double calculateBonus() {
        if (yearsOfExperience > 5) {
            return 0.2 * salary;
        } else {
            return 0.1 * salary;
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sahil", 50000, 6);
        Employee emp2 = new Employee("Bishow", 50000, 4);

        System.out.println(emp1.name + " Bonus: " + emp1.calculateBonus());
        System.out.println(emp2.name + " Bonus: " + emp2.calculateBonus());
    }
}