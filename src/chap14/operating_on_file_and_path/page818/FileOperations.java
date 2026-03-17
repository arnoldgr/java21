package chap14.operating_on_file_and_path.page818;
import java.io.File;

public class FileOperations {

    public static void main(String[] args) {
        File file = new File("src/chap14/resources");

        io(file);
    }

    public static void io(File file) {
        if (file.exists()) {
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Name: " + file.getName());
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
            System.out.println("Parent Path: " + file.getParent());

            if (file.isFile()) {
                System.out.println("Size: " + file.length());
                System.out.println("Last Modified: " + file.lastModified());
            } else {
                File[] subfiles = file.listFiles();

                if (subfiles != null) {
                    System.out.println("Directory Contents:");
                    for (File subfile : subfiles) {
                        System.out.println("   " + subfile.getName());
                    }
                }
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}
