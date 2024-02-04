import java.util.Scanner;
import java.io.File;

public class FileInfo {
    String name;
    File f1;

    void getFile() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the file name:");
        name = input.nextLine();
        f1 = new File(name);
    }

    void showDetails() {
        System.out.println("File Name:" + f1.getName());
        System.out.println("Path:" + f1.getPath());
        System.out.println("Abs Path:" + f1.getAbsolutePath());
        System.out.println("This file is:" + (f1.exists() ? "Exists" : "Does not exists"));
        System.out.println("Is Readable:" + f1.canRead());
        System.out.println("IS Writable:" + f1.canWrite());
        System.out.println("Type of File:" + name.substring(name.lastIndexOf(".") + 1));
        System.out.println("File Size:" + f1.length() + "bytes");
    }

    public static void main(String args[]) {
        FileInfo fi = new FileInfo();
        fi.getFile();
        fi.showDetails();
    }
}
