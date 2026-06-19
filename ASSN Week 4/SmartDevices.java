class SmartDevice {
    String brand;
    String model;
    boolean isOn;
    
    SmartDevice(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isOn = false;
    }
    
    void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is now ON");
    }
    
    void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is now OFF");
    }
}

class SmartPhone extends SmartDevice {
    int batteryLevel;
    
    SmartPhone(String brand, String model, int batteryLevel) {
        super(brand, model);
        this.batteryLevel = batteryLevel;
    }
    
    void turnOn() {
        if(batteryLevel > 10) {
            super.turnOn();
            System.out.println("Phone is booting up");
        } else {
            System.out.println("Battery too low");
        }
    }
}

class SmartWatch extends SmartDevice {
    boolean heartMonitor;
    
    SmartWatch(String brand, String model, boolean heartMonitor) {
        super(brand, model);
        this.heartMonitor = heartMonitor;
    }
    
    void turnOn() {
        super.turnOn();
        System.out.println("Watch connecting to phone");
    }
}

public class SmartDevices {
    public static void main(String[] args) {
        SmartDevice phone = new SmartPhone("Samsung", "S23", 80);
        SmartDevice watch = new SmartWatch("Apple", "Series 9", true);
        
        phone.turnOn();
        watch.turnOn();
    }
}
