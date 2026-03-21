package chap14.interacting_with_users.page856;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrintingData {

    public static void main(String[] args) {
        try (var in = new FileInputStream("zoo.txt")) {
            System.out.println("Found file!");
        } catch (FileNotFoundException e) {
            System.err.println("File not found!");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
        }
    }
}