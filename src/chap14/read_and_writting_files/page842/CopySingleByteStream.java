package chap14.read_and_writting_files.page842;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopySingleByteStream {

    private static final Path DATA_DIR = Path.of("ocp-data", "chap14", "files");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(DATA_DIR);

        Path sourceBytes = DATA_DIR.resolve("single-byte-source.bin");
        Path targetBytes = DATA_DIR.resolve("single-byte-copy.bin");

        Path sourceText = DATA_DIR.resolve("single-char-source.txt");
        Path targetText = DATA_DIR.resolve("single-char-copy.txt");

        Files.write(sourceBytes, new byte[]{65, 66, 67, 68}); // A B C D
        Files.writeString(sourceText, "Hello OCP!");

        copyStream(new FileInputStream(sourceBytes.toFile()), new FileOutputStream(targetBytes.toFile()));
        copyStream(new FileReader(sourceText.toFile()), new FileWriter(targetText.toFile()));

        System.out.println("Copied byte file: " + sourceBytes + " -> " + targetBytes);
        System.out.println("Copied text file: " + sourceText + " -> " + targetText);
    }

    static void copyStream(FileInputStream in, FileOutputStream out) throws IOException {
        try (in; out) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }

    static void copyStream(FileReader in, FileWriter out) throws IOException {
        try (in; out) {
            int b;
            while ((b = in.read()) != -1) {
                out.write(b);
            }
        }
    }
}
