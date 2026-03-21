package chap14.working_w_advanced_apis.page866;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFileAttributeViewDemo {

    public static void main(String[] args) {
        try {
            Path baseDir = Path.of("ocp-data", "chap14", "advanced-apis", "attributes");
            Files.createDirectories(baseDir);

            Path file = baseDir.resolve("modify-time.txt");
            Files.writeString(file, "Timestamp demo");

            BasicFileAttributeView view =
                    Files.getFileAttributeView(file, BasicFileAttributeView.class);

            BasicFileAttributes attributes = view.readAttributes();

            System.out.println("Before update:");
            System.out.println("Last modified: " + attributes.lastModifiedTime());

            FileTime newTime = FileTime.fromMillis(
                    attributes.lastModifiedTime().toMillis() + 10_000
            );

            view.setTimes(newTime, null, null);

            BasicFileAttributes updated = view.readAttributes();

            System.out.println("After update:");
            System.out.println("Last modified: " + updated.lastModifiedTime());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
