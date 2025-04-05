package vn.edu.iuh.fit.composite;


public class Main {
    public static void main(String[] args) {
        // Tạo các tập tin
        File file1 = new File("File1.txt", "Data of File1");
        File file2 = new File("File2.txt", "Data of File2");
        File file3 = new File("File3.txt", "Data of File3");

        // Tạo các thư mục
        Directory dir1 = new Directory("Directory1");
        Directory dir2 = new Directory("Directory2");
        Directory rootDir = new Directory("RootDirectory");

        // Thêm các tập tin vào thư mục
        dir1.add(file1);
        dir1.add(file2);

        // Thêm thư mục con và tập tin vào thư mục gốc
        rootDir.add(dir1);
        rootDir.add(file3);
        rootDir.add(dir2);

        // Hiển thị cấu trúc cây
        rootDir.display();
    }
}