package chap14.refrencing_files_and_directories.page815;

import java.io.File;
import java.io.IOException;

public class CreatePhysicalFile{

    public static void main(String[] args) throws IOException {
        File directory = new File("src/chap14/resources");
        if (!directory.exists()) {
            directory.mkdirs();
        }

        File file = new File(directory, "created_by_java.txt");

        if (file.createNewFile()) {
            System.out.println("File created successfully: " + file.getPath());
        } else {
            System.out.println("File already exists: " + file.getPath());
        }
    }
}
