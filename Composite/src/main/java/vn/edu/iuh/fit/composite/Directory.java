package vn.edu.iuh.fit.composite;

// Directory.java
import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystem {
    private List<FileSystem> children = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void add(FileSystem child) {
        children.add(child);
    }

    public void remove(FileSystem child) {
        children.remove(child);
    }

    @Override
    public void display() {
        System.out.println("Directory: " + getName());
        for (FileSystem child : children) {
            child.display();
        }
    }
}