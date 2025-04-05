package vn.edu.iuh.fit.composite;

// FileSystem.java
public abstract class FileSystem {
    protected String name;

    public FileSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void display();
}
