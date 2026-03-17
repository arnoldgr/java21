package chap14.refrencing_files_and_directories.page815;

import java.io.File;

public class FileReference {

    public static void main(String[] args) {
        // Creating a File object does NOT create a physical file on disk.
        String fullPath = "src/chap14/resources/stripes.txt";

        // 1) Single String constructor
        File zooFile1 = new File(fullPath);

        // 2) Parent String + child String constructor
        File zooFile2 = new File("src/chap14/resources", "stripes.txt");

        // 3) Parent File + child String constructor
        File parent = new File("src/chap14/resources");
        File zooFile3 = new File(parent, "stripes.txt");

        // 4) If parent is null, it behaves like the single String constructor
        File zooFile4 = new File((File) null, fullPath);

        System.out.println("zooFile1 path: " + zooFile1.getPath());
        System.out.println("zooFile2 path: " + zooFile2.getPath());
        System.out.println("zooFile3 path: " + zooFile3.getPath());
        System.out.println("zooFile4 path (null parent): " + zooFile4.getPath());

        System.out.println();
        System.out.println("zooFile1 exists? " + zooFile1.exists());
        System.out.println("zooFile2 exists? " + zooFile2.exists());
        System.out.println("zooFile3 exists? " + zooFile3.exists());

        System.out.println();
        System.out.println("Important: File objects reference file locations.");
        System.out.println("They do NOT create physical files by themselves.");
    }
}
