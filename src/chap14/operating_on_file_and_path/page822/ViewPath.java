package chap14.operating_on_file_and_path.page822;
import java.nio.file.Path;

public class ViewPath {

    public static void main(String[] args) {
        Path path = Path.of("/land/hippo/harry.happy");

        System.out.println("The Path is: " + path);

        for (int i = 0; i < path.getNameCount(); i++) {
            System.out.println("   Element " + i + " is: " + path.getName(i));
        }

        System.out.println();
        System.out.println("Name count: " + path.getNameCount());

        Path rootPath = Path.of("/");
        System.out.println("Root-only path name count: " + rootPath.getNameCount());

        // EXAM NOTE:
        // rootPath.getName(0) would throw IllegalArgumentException at runtime.
    }
}
