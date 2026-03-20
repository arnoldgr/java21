package chap14.read_and_writting_files.page846;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesNewBufferedReaderWriter {

    private static final Path DATA_DIR = Path.of("ocp-data", "chap14", "files");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(DATA_DIR);

        Path source = DATA_DIR.resolve("nio-reader-source.txt");
        Path target = DATA_DIR.resolve("nio-reader-copy.txt");

        Files.writeString(source, """
                Zebra
                Giraffe
                Rhino
                """);

        copyPath(source, target);

        System.out.println("Copied using Files.newBufferedReader/newBufferedWriter");
        System.out.println("Target content:\n" + Files.readString(target));
    }

    static void copyPath(Path input, Path output) throws IOException {
        try (var reader = Files.newBufferedReader(input);
             var writer = Files.newBufferedWriter(output)) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
}
