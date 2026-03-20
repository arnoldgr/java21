package chap14.io_streams.page837;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LowLevelVsHighLevelStreams {

    private static final Path FILE = Path.of("ocp-data", "chap14", "io", "zoo-data.txt");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(FILE.getParent());
        Files.writeString(FILE, "Lion\nTiger\nElephant");

        demonstrateLowAndHighLevel();
    }

    private static void demonstrateLowAndHighLevel() throws IOException {
        System.out.println("=== Low-Level vs High-Level Streams ===");

        try (var br = new BufferedReader(new FileReader(FILE.toFile()))) {
            System.out.println("Low-level stream: FileReader");
            System.out.println("High-level stream: BufferedReader");

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Read line: " + line);
            }
        }
    }
}
