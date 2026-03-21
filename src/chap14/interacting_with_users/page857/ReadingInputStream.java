package chap14.interacting_with_users.page857;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingInputStream {

    public static void main(String[] args) {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter some text: ");
            String userInput = reader.readLine();
            System.out.println("You entered: " + userInput);
        } catch (IOException e) {
            System.err.println("Error reading input.");
            e.printStackTrace();
        }
    }
}