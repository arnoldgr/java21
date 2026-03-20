package chap14.read_and_writting_files.page846;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyTextFileWithBufferedReaderWriter {

    private static final Path DATA_DIR = Path.of("ocp-data", "chap14", "files");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(DATA_DIR);

        Path source = DATA_DIR.resolve("zoo-data.txt");
        Path target = DATA_DIR.resolve("zoo-data-copy.txt");

        Files.writeString(source, """
                Lion
                Tiger
                Elephant
                """);

        copyTextFile(source, target);

        System.out.println("Copied text file using BufferedReader/BufferedWriter.");
        System.out.println("Target content:\n" + Files.readString(target));
    }

    static void copyTextFile(Path src, Path dest) throws IOException {
        try (var reader = new BufferedReader(new FileReader(src.toFile()));
             var writer = new BufferedWriter(new FileWriter(dest.toFile()))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}