class Vehicle {
    String plateNumber;
    double baseRate;
    
    Vehicle(String plateNumber, double baseRate) {
        this.plateNumber = plateNumber;
        this.baseRate = baseRate;
    }
    
    double calculateRental(int days) {
        return baseRate * days;
    }
}

class Car extends Vehicle {
    Car(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }
}

class Truck extends Vehicle {
    Truck(String plateNumber, double baseRate) {
        super(plateNumber, baseRate);
    }
    
    double calculateRental(int days) {
        return (baseRate * days) + 100;
    }
}

class Bike extends Vehicle {
    Bike(String plateNumber) {
        super(plateNumber, 25);
    }
    
    double calculateRental(int days) {
        return 25;
    }
}

public class VehicleRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car("CAR001", 80),
            new Truck("TRK001", 120),
            new Bike("BIK001")
        };
        
        for(Vehicle v : vehicles) {
            System.out.println(v.plateNumber + " rental: " + v.calculateRental(5));
        }
    }
}
