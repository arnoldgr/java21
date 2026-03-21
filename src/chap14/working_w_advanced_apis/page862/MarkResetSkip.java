package chap14.working_w_advanced_apis.page862;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MarkResetSkip {

    private static void readWithMarkReset(InputStream is) throws IOException {
        System.out.println("=== mark()/reset() demo ===");

        System.out.print((char) is.read()); // L

        if (is.markSupported()) {
            is.mark(100); // mark before I
            System.out.print((char) is.read()); // I
            System.out.print((char) is.read()); // O
            is.reset(); // back to I
        }

        System.out.print((char) is.read()); // I
        System.out.print((char) is.read()); // O
        System.out.print((char) is.read()); // N

        System.out.println();
    }

    private static void readWithSkip(InputStream is) throws IOException {
        System.out.println("=== skip() demo ===");

        System.out.print((char) is.read()); // T
        long skipped = is.skip(2); // skip I and G
        System.out.println("\nSkipped characters: " + skipped);

        is.read(); // reads E but does not print
        System.out.print((char) is.read()); // R
        System.out.print((char) is.read()); // S

        System.out.println();
    }

    public static void main(String[] args) {
        try {
            InputStream lionStream = new ByteArrayInputStream("LION".getBytes());
            readWithMarkReset(lionStream); // expected: LIOION

            InputStream tigerStream = new ByteArrayInputStream("TIGERS".getBytes());
            readWithSkip(tigerStream); // expected: TRS
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}