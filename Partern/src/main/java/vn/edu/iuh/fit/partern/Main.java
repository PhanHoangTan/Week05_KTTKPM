package vn.edu.iuh.fit.partern;

public class Main {
    public static void main(String[] args) {
        LightSwitch lightSwitch = new LightSwitch();
        SmartFan smartFan = new SmartFan();
        SmartSensor smartSensor = new SmartSensor();

        lightSwitch.addObserver(smartFan);
        lightSwitch.addObserver(smartSensor);

        System.out.println("Switching on the light:");
        lightSwitch.switchOn();

        System.out.println("\nSwitching off the light:");
        lightSwitch.switchOff();
    }
}