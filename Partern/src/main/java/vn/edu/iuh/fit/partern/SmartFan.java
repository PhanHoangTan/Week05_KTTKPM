package vn.edu.iuh.fit.partern;

public class SmartFan implements Observer {
    @Override
    public void update(boolean isOn) {
        if (isOn) {
            System.out.println("SmartFan: Turning on.");
        } else {
            System.out.println("SmartFan: Turning off.");
        }
    }
}