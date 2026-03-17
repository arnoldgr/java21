package chap14.operating_on_file_and_path.page819;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class PathOperations {

    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/chap14/resources");

        nio(path);
    }

    // NIO.2 version of file/directory operations.
    // Note: More NIO.2 APIs throw IOException than the legacy I/O APIs did.
    // Specifically, Files.size(), Files.getLastModifiedTime(), and Files.list()
    // all throw a checked IOException, which is why this method declares it.
    public static void nio(Path path) throws IOException {
        if (Files.exists(path)) {
            System.out.println("Absolute Path: " + path.toAbsolutePath());
            System.out.println("Name: " + path.getFileName());
            System.out.println("Is Directory: " + Files.isDirectory(path));
            System.out.println("Is Regular File: " + Files.isRegularFile(path));
            System.out.println("Parent Path: " + path.getParent());

            if (Files.isRegularFile(path)) {
                // Files.size() and Files.getLastModifiedTime() both throw IOException
                System.out.println("Size: " + Files.size(path));
                System.out.println("Last Modified: " + Files.getLastModifiedTime(path));
            } else {
                System.out.println("Directory Contents:");

                // Files.list() opens a connection to the file system and returns a Stream<Path>.
                // The Stream uses lazy evaluation, meaning each path element is loaded as needed
                // rather than loading the entire directory contents at once.
                //
                // IMPORTANT: NIO.2 stream-based methods open a file system resource that MUST
                // be properly closed to avoid a resource leak. A resource leak in the file system
                // can lock the path from modification long after the process has completed.
                // Always use try-with-resources with these NIO.2 stream methods.
                //
                // Note: Not all streams need to be closed — only those that open file system
                // resources, like the ones returned by NIO.2 methods. Regular streams (e.g.,
                // from Collections) do not require closing.
                try (Stream<Path> stream = Files.list(path)) {
                    stream.forEach(p -> System.out.println("   " + p.getFileName()));
                }
            }
        } else {
            System.out.println("The file or directory does not exist.");
        }
    }
}
