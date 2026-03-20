package chap14.operating_on_file_and_path.page828;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PathRealPathDemo {

    public static void main(String[] args) {
        try {
            Path baseDir = Path.of("ocp-data/chap14/realpath");
            Files.createDirectories(baseDir);

            Path file = baseDir.resolve("food.txt");
            if (Files.notExists(file)) {
                Files.writeString(file, "lion food");
            }

            System.out.println("=== PathRealPathDemo ===");

            Path theoreticalPath = Path.of("ocp-data/chap14/realpath/./../realpath/food.txt");

            System.out.println("Original Path:      " + theoreticalPath);
            System.out.println("toAbsolutePath():   " + theoreticalPath.toAbsolutePath());
            System.out.println("normalize():        " + theoreticalPath.normalize());
            System.out.println("toRealPath():       " + theoreticalPath.toRealPath());

            System.out.println();
            System.out.println("Current working directory as real path:");
            System.out.println(Path.of(".").toRealPath());

        } catch (IOException e) {
            System.out.println("IOException: " + e.getMessage());
        }
    }
}