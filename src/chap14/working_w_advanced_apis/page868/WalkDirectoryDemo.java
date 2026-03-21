package chap14.working_w_advanced_apis.page868;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class WalkDirectoryDemo {

    private static long getSize(Path p) {
        try {
            return Files.size(p);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static long getPathSize(Path source) throws IOException {
        try (Stream<Path> stream = Files.walk(source)) {
            return stream
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(WalkDirectoryDemo::getSize)
                    .sum();
        }
    }

    private static long getPathSizeWithDepth(Path source, int depth) throws IOException {
        try (Stream<Path> stream = Files.walk(source, depth)) {
            return stream
                    .filter(p -> !Files.isDirectory(p))
                    .mapToLong(WalkDirectoryDemo::getSize)
                    .sum();
        }
    }

    public static void main(String[] args) {
        try {
            Path root = Path.of("ocp-data", "chap14", "advanced-apis", "walk");
            Path sub1 = root.resolve("level1");
            Path sub2 = sub1.resolve("level2");

            Files.createDirectories(sub2);

            Files.writeString(root.resolve("a.txt"), "12345");
            Files.writeString(sub1.resolve("b.txt"), "1234567890");
            Files.writeString(sub2.resolve("c.txt"), "123456789012345");

            long totalSize = getPathSize(root);
            long depth1Size = getPathSizeWithDepth(root, 1);

            System.out.println("Root: " + root);
            System.out.println("Total size (all levels): " + totalSize + " bytes");
            System.out.println("Total size (depth 1 only): " + depth1Size + " bytes");

            System.out.println("\nFiles.walk() output:");
            try (Stream<Path> stream = Files.walk(root)) {
                stream.forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}