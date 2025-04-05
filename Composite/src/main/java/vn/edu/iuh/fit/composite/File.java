package vn.edu.iuh.fit.composite;

// File.java
public class File extends FileSystem {
    private String data;

    public File(String name, String data) {
        super(name);
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public void display() {
        System.out.println("File: " + getName() + ", Data: " + getData());
    }
}