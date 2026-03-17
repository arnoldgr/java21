package chap14.operating_on_file_and_path.page826;
import java.nio.file.Path;

public class RelativizePath{

    public static void main(String[] args) {
        Path path1 = Path.of("fish.txt");
        Path path2 = Path.of("friendly/birds.txt");

        System.out.println("path1.relativize(path2): " + path1.relativize(path2));
        System.out.println("path2.relativize(path1): " + path2.relativize(path1));

        System.out.println();

        Path absolute1 = Path.of("/habitat");
        Path absolute2 = Path.of("/sanctuary/raven/poe.txt");

        System.out.println("absolute1.relativize(absolute2): " + absolute1.relativize(absolute2));
        System.out.println("absolute2.relativize(absolute1): " + absolute2.relativize(absolute1));

        System.out.println();

        // EXAM NOTES:
        // Both paths must be BOTH relative or BOTH absolute.
        // Mixing absolute and relative throws IllegalArgumentException.
        //
        // Example:
        // Path.of("/primate/chimpanzee").relativize(Path.of("bananas.txt"));
    }
}