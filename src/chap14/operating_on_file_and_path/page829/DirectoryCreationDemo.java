package chap14.operating_on_file_and_path.page829;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryCreationDemo {

    public static void main(String[] args) {
        try {
            System.out.println("=== DirectoryCreationDemo ===");

            Path baseDir = Path.of("ocp-data/chap14/directories");
            Files.createDirectories(baseDir);

            // createDirectory() - parent must already exist
            Path singleDir = baseDir.resolve("field");
            if (Files.notExists(singleDir)) {
                Files.createDirectory(singleDir);
                System.out.println("Created directory with createDirectory(): " + singleDir);
            } else {
                System.out.println("Already exists: " + singleDir);
            }

            // createDirectories() - creates missing parents too
            Path nestedDir = Path.of("ocp-data/chap14/directories/pasture/green");
            Files.createDirectories(nestedDir);
            System.out.println("Created nested directories with createDirectories(): " + nestedDir);

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}