package chap14.working_w_advanced_apis.page864;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAttributeChecks {

    public static void main(String[] args) {
        try {
            Path baseDir = Path.of("ocp-data", "chap14", "advanced-apis", "attributes");
            Files.createDirectories(baseDir);

            Path sampleFile = baseDir.resolve("sample.txt");
            Files.writeString(sampleFile, "Hello OCP 17");

            System.out.println("Path: " + sampleFile);
            System.out.println("isDirectory: " + Files.isDirectory(sampleFile));
            System.out.println("isRegularFile: " + Files.isRegularFile(sampleFile));
            System.out.println("isSymbolicLink: " + Files.isSymbolicLink(sampleFile));

            try {
                System.out.println("isHidden: " + Files.isHidden(sampleFile));
            } catch (IOException e) {
                System.out.println("Could not determine hidden attribute: " + e.getMessage());
            }

            System.out.println("isReadable: " + Files.isReadable(sampleFile));
            System.out.println("isWritable: " + Files.isWritable(sampleFile));
            System.out.println("isExecutable: " + Files.isExecutable(sampleFile));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}