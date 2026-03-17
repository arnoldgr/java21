package chap14.refrencing_files_and_directories.page816;
import java.io.File;
import java.nio.file.Path;

public class FilePathConversion {

    public static void main(String[] args) {
        File file = new File("src/chap14/resources/stripes.txt");

        // Convert File -> Path
        Path newPath = file.toPath();

        // Convert Path -> File
        File backToFile = newPath.toFile();

        System.out.println("Original File: " + file.getPath());
        System.out.println("Converted Path: " + newPath);
        System.out.println("Back to File: " + backToFile.getPath());

        System.out.println();
        System.out.println("File absolute path: " + file.getAbsolutePath());
        System.out.println("Back-to-file absolute path: " + backToFile.getAbsolutePath());
    }
}