package chap14.read_and_writting_files.page844;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyBufferedByteStream {

    private static final Path DATA_DIR = Path.of("ocp-data", "chap14", "files");

    public static void main(String[] args) throws IOException {
        Files.createDirectories(DATA_DIR);

        Path source = DATA_DIR.resolve("buffered-source.bin");
        Path target = DATA_DIR.resolve("buffered-copy.bin");

        byte[] sample = new byte[1054];
        for (int i = 0; i < sample.length; i++) {
            sample[i] = (byte) (i % 128);
        }
        Files.write(source, sample);

        copyStream(new FileInputStream(source.toFile()), new FileOutputStream(target.toFile()));

        System.out.println("Buffered copy complete: " + source + " -> " + target);
        System.out.println("Source size: " + Files.size(source));
        System.out.println("Target size: " + Files.size(target));
    }

    static void copyStream(FileInputStream in, FileOutputStream out) throws IOException {
        try (in; out) {
            int batchSize = 1024;
            byte[] buffer = new byte[batchSize];
            int lengthRead;

            while ((lengthRead = in.read(buffer, 0, batchSize)) > 0) {
                out.write(buffer, 0, lengthRead);
                out.flush(); // okay for demo; not ideal after every write in real life
            }
        }
    }
}