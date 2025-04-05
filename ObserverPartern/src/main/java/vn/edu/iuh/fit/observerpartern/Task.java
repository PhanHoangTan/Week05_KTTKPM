package vn.edu.iuh.fit.observerpartern;

public class Task extends Subject {
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
        notifyObservers();
    }
}