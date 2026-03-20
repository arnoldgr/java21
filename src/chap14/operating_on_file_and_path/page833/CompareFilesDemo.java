package chap14.operating_on_file_and_path.page833;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CompareFilesDemo {

    public static void main(String[] args) {
        try {
            System.out.println("=== CompareFilesDemo ===");

            Path baseDir = Path.of("ocp-data/chap14/compare");
            Files.createDirectories(baseDir);

            Path file1 = baseDir.resolve("monkey.txt");
            Path file2 = baseDir.resolve("wolf.txt");
            Path sameReference = file1;

            Files.writeString(file1, "Harold");
            Files.writeString(file2, "Howler");

            // isSameFile() - same physical file?
            System.out.println("file1.equals(file2): " + file1.equals(file2));
            System.out.println("Files.isSameFile(file1, sameReference): " + Files.isSameFile(file1, sameReference));
            System.out.println("Files.isSameFile(file1, file2): " + Files.isSameFile(file1, file2));

            // mismatch() - compare file contents
            long mismatchPosition = Files.mismatch(file1, file2);
            System.out.println("Files.mismatch(file1, file2): " + mismatchPosition);

            // Compare same content
            Path file3 = baseDir.resolve("copy-of-monkey.txt");
            Files.writeString(file3, "Harold");
            System.out.println("Files.mismatch(file1, file3): " + Files.mismatch(file1, file3)); // -1

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}