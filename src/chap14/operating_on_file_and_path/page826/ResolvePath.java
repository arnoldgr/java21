package chap14.operating_on_file_and_path.page826;
import java.nio.file.Path;

public class ResolvePath{

    public static void main(String[] args) {
        Path path1 = Path.of("/cats/../panther");
        Path path2 = Path.of("food");

        System.out.println("Relative path appended:");
        System.out.println(path1.resolve(path2)); // /cats/../panther/food

        System.out.println();

        Path path3 = Path.of("/turkey/food");

        System.out.println("Absolute path replaces base:");
        System.out.println(path3.resolve("/tiger/cage")); // /tiger/cage

        System.out.println();

        // EXAM RULE:
        // resolve() behaves like path concatenation,
        // BUT if the argument is absolute, the argument is returned.
    }
}