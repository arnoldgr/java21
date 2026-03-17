package chap14.operating_on_file_and_path.page827;
import java.nio.file.Path;

public class NormalizePath {

    public static void main(String[] args) {
        Path p1 = Path.of("./armadillo/../shells.txt");
        System.out.println("Original: " + p1);
        System.out.println("Normalized: " + p1.normalize());
        System.out.println();

        Path p2 = Path.of("/cats/../panther/food");
        System.out.println("Original: " + p2);
        System.out.println("Normalized: " + p2.normalize());
        System.out.println();

        Path p3 = Path.of("../../fish.txt");
        System.out.println("Original: " + p3);
        System.out.println("Normalized: " + p3.normalize());
        System.out.println();

        Path compare1 = Path.of("/pony/../weather.txt");
        Path compare2 = Path.of("/weather.txt");

        System.out.println("compare1.equals(compare2): " + compare1.equals(compare2));
        System.out.println("compare1.normalize().equals(compare2.normalize()): "
                + compare1.normalize().equals(compare2.normalize()));
    }
}
