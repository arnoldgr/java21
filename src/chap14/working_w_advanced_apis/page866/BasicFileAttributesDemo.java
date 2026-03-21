package chap14.working_w_advanced_apis.page866;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class BasicFileAttributesDemo {

    public static void main(String[] args) {
        try {
            Path baseDir = Path.of("ocp-data", "chap14", "advanced-apis", "attributes");
            Files.createDirectories(baseDir);

            Path file = baseDir.resolve("sea.txt");
            Files.writeString(file, "Sea turtle data");

            BasicFileAttributes data = Files.readAttributes(file, BasicFileAttributes.class);

            System.out.println("Path: " + file);
            System.out.println("Is a directory? " + data.isDirectory());
            System.out.println("Is a regular file? " + data.isRegularFile());
            System.out.println("Is a symbolic link? " + data.isSymbolicLink());
            System.out.println("Size (bytes): " + data.size());
            System.out.println("Last modified: " + data.lastModifiedTime());
            System.out.println("Creation time: " + data.creationTime());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}