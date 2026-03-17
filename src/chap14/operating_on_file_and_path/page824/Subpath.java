package chap14.operating_on_file_and_path.page824;
import java.nio.file.Path;

public class Subpath {

    public static void main(String[] args) {
        Path p = Path.of("/mammal/omnivore/raccoon.image");

        System.out.println("Path is: " + p);

        for (int i = 0; i < p.getNameCount(); i++) {
            System.out.println("   Element " + i + " is: " + p.getName(i));
        }

        System.out.println();
        System.out.println("subpath(0, 3): " + p.subpath(0, 3));
        System.out.println("subpath(1, 2): " + p.subpath(1, 2));
        System.out.println("subpath(1, 3): " + p.subpath(1, 3));

        // EXAM NOTES:
        // p.subpath(0, 4) -> IllegalArgumentException
        // p.subpath(1, 1) -> IllegalArgumentException
    }
}
