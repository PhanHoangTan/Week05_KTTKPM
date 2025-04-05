package vn.edu.iuh.fit.partern;

public class SmartSensor implements Observer {
    @Override
    public void update(boolean isOn) {
        if (isOn) {
            System.out.println("SmartSensor: Detecting light is on.");
        } else {
            System.out.println("SmartSensor: Detecting light is off.");
        }
    }
}