class Device {
    String deviceName;
    
    Device(String deviceName) {
        this.deviceName = deviceName;
    }
    
    void operate() {
        System.out.println(deviceName + " operating");
    }
}

class Light extends Device {
    Light(String deviceName) {
        super(deviceName);
    }
    
    void operate() {
        System.out.println(deviceName + " - Light turned ON");
    }
}

class Thermostat extends Device {
    Thermostat(String deviceName) {
        super(deviceName);
    }
    
    void operate() {
        System.out.println(deviceName + " - Temperature set to 72 degrees");
    }
}

class SecurityCamera extends Device {
    SecurityCamera(String deviceName) {
        super(deviceName);
    }
    
    void operate() {
        System.out.println(deviceName + " - Recording started");
    }
}

public class SmartHomeSystem {
    public static void main(String[] args) {
        Device[] devices = {
            new Light("Living Room Light"),
            new Thermostat("Smart Thermostat"),
            new SecurityCamera("Front Door Camera")
        };
        
        for(Device d : devices) {
            d.operate();
        }
    }
}
