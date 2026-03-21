package chap14.working_w_advanced_apis.page871;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamDemo {

    public static void main(String[] args) {
        try {
            Path dir = Path.of("ocp-data", "chap14", "advanced-apis", "dirstream");
            Files.createDirectories(dir);

            Files.writeString(dir.resolve("animals.txt"), "lion,tiger,bear");
            Files.writeString(dir.resolve("Zoo.java"), "public class Zoo {}");
            Files.writeString(dir.resolve("image.png"), "not really an image");

            try (DirectoryStream<Path> dirStream =
                         Files.newDirectoryStream(dir, "*.{txt,java}")) {

                System.out.println("Files matching *.{txt,java}:");
                for (Path entry : dirStream) {
                    System.out.println(entry);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}