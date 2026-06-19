class Patient {
    private String name;
    private int age;
    
    Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void getTreatmentPlan() {
        System.out.println("Basic treatment for " + name);
    }
}

class InPatient extends Patient {
    int roomNumber;
    
    InPatient(String name, int age, int roomNumber) {
        super(name, age);
        this.roomNumber = roomNumber;
    }
    
    void getTreatmentPlan() {
        System.out.println("Full treatment plan for room " + roomNumber);
    }
}

class OutPatient extends Patient {
    String appointmentDate;
    
    OutPatient(String name, int age, String appointmentDate) {
        super(name, age);
        this.appointmentDate = appointmentDate;
    }
    
    void getTreatmentPlan() {
        System.out.println("Outpatient treatment on " + appointmentDate);
    }
}

public class HospitalRecords {
    public static void main(String[] args) {
        Patient[] patients = {
            new InPatient("John", 45, 302),
            new OutPatient("Mary", 30, "2024-01-15")
        };
        
        for(Patient p : patients) {
            p.getTreatmentPlan();
        }
    }
}
