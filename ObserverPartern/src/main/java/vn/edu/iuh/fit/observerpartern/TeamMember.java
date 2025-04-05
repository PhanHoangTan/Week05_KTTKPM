package vn.edu.iuh.fit.observerpartern;

public class TeamMember implements Observer {
    private String name;
    private Task task;

    public TeamMember(String name, Task task) {
        this.name = name;
        this.task = task;
        this.task.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Team member " + name + " notified. New task status: " + task.getStatus());
    }
}