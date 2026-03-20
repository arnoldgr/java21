package chap14.io_streams.page836;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteVsCharacterStreams {

    private static final Path IO_DIR = Path.of("ocp-data", "chap14", "io");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(IO_DIR);

        Path byteFile = IO_DIR.resolve("byte-data.bin");
        Path textFile = IO_DIR.resolve("text-data.txt");

        writeBytes(byteFile);
        readBytes(byteFile);

        writeCharacters(textFile);
        readCharacters(textFile);
    }

    private static void writeBytes(Path path) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(path.toFile())) {
            fos.write(65); // 'A'
            fos.write(66); // 'B'
            fos.write(67); // 'C'
        }
        System.out.println("Wrote bytes to: " + path);
    }

    private static void readBytes(Path path) throws IOException {
        System.out.println("\nReading bytes from: " + path);

        try (FileInputStream fis = new FileInputStream(path.toFile())) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.println("Byte value: " + data + " Character: " + (char) data);
            }
        }
    }

    private static void writeCharacters(Path path) throws IOException {
        try (FileWriter fw = new FileWriter(path.toFile())) {
            fw.write("Hello OCP Java 21!\n");
            fw.write("Character streams are for text.");
        }
        System.out.println("\nWrote characters to: " + path);
    }

    private static void readCharacters(Path path) throws IOException {
        System.out.println("\nReading characters from: " + path);

        try (FileReader fr = new FileReader(path.toFile())) {
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        }
        System.out.println();
    }
}
