package chap14.operating_on_file_and_path.page822;
import java.nio.file.Path;

public class PathImmutability {

    public static void main(String[] args) {
        Path p = Path.of("whale");

        p.resolve("krill"); // result ignored

        System.out.println("Path after ignored resolve(): " + p); // whale

        p = p.resolve("krill"); // reassign to keep result

        System.out.println("Path after reassignment: " + p); // whale/krill
    }
}
