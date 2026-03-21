package chap14.working_w_advanced_apis.page871;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class FindInDirectoryDemo {

    public static void main(String[] args) {
        try {
            Path root = Path.of("ocp-data", "chap14", "advanced-apis", "find");
            Path src = root.resolve("src");
            Path docs = root.resolve("docs");

            Files.createDirectories(src);
            Files.createDirectories(docs);

            Files.writeString(src.resolve("Lion.java"), "public class Lion {}");
            Files.writeString(src.resolve("Tiger.java"), "public class Tiger { int age = 5; }");
            Files.writeString(docs.resolve("notes.txt"), "Study notes");
            Files.writeString(docs.resolve("bigfile.java"), "x".repeat(1500));

            long minSize = 20;

            try (Stream<Path> stream = Files.find(
                    root,
                    10,
                    (path, attr) -> attr.isRegularFile()
                            && path.toString().endsWith(".java")
                            && attr.size() > minSize
            )) {
                System.out.println("Matching .java files larger than " + minSize + " bytes:");
                stream.forEach(System.out::println);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}