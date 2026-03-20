package chap14.operating_on_file_and_path.page830;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyMoveDeleteDemo {

    public static void main(String[] args) {
        try {
            System.out.println("=== CopyMoveDeleteDemo ===");

            Path baseDir = Path.of("ocp-data/chap14/file-ops");
            Files.createDirectories(baseDir);

            // Create source file
            Path sourceFile = baseDir.resolve("book.txt");
            Files.writeString(sourceFile, "Java OCP workshop content");
            System.out.println("Created source file: " + sourceFile);

            // Copy file
            Path copiedFile = baseDir.resolve("movie.txt");
            Files.copy(sourceFile, copiedFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copied file to: " + copiedFile);

            // Move / rename file
            Path movedFile = baseDir.resolve("movie-renamed.txt");
            Files.move(copiedFile, movedFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Moved/Renamed file to: " + movedFile);

            // Create directory to show move() on directory
            Path oldDir = baseDir.resolve("zoo");
            Files.createDirectories(oldDir);

            Path newDir = baseDir.resolve("zoo-new");
            if (Files.exists(newDir)) {
                Files.delete(newDir);
            }

            Files.move(oldDir, newDir);
            System.out.println("Renamed directory from zoo to zoo-new");

            // Delete file
            boolean deleted = Files.deleteIfExists(movedFile);
            System.out.println("Deleted movie-renamed.txt? " + deleted);

        } catch (IOException e) {
            System.out.println("IOException: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}