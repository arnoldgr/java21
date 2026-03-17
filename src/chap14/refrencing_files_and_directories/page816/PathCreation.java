package chap14.refrencing_files_and_directories.page816;
import java.net.URI;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreation {

    public static void main(String[] args) {
        // Path is an interface, so it cannot be created with new.
        // Path.of(...) creates a Path object that references a location.
        // It does NOT create a physical file.

        // 1) Path.of(String)
        Path zooPath1 = Path.of("src/chap14/resources/stripes.txt");

        // 2) Path.of(String first, String... more)
        Path zooPath2 = Path.of("src", "chap14", "resources", "stripes.txt");

        System.out.println("zooPath1: " + zooPath1);
        System.out.println("zooPath2: " + zooPath2);
        System.out.println("Files.exists(zooPath1)? " + Files.exists(zooPath1));

        System.out.println();

        // 3) Older style: Paths.get(...)
        Path zooPath3 = Paths.get("src", "chap14", "resources", "stripes.txt");
        System.out.println("zooPath3 (Paths.get): " + zooPath3);

        // 4) FileSystems helper
        Path zooPath4 = FileSystems.getDefault().getPath("src/chap14/resources/stripes.txt");
        System.out.println("zooPath4 (FileSystems): " + zooPath4);

        System.out.println();

        // 5) URI-based Path creation
        // Using file:// is safer for a runnable example
        Path zooPath5 = Path.of(URI.create("file:///tmp/ocp-demo.txt"));
        System.out.println("zooPath5 (from URI): " + zooPath5);

        System.out.println();
        System.out.println("Important: Path objects reference file locations.");
        System.out.println("They do NOT create physical files by themselves.");

        /*
         * EXAM NOTE:
         * Path.of(URI.create("https://www.selikoff.net")) may appear in exam-style questions,
         * but it may fail at runtime if no filesystem provider supports the "https" scheme.
         */
    }
}
