package chap14.interacting_with_users.page858;
import java.io.Console;

public class ConsoleInput {

    public static void main(String[] args) {
        Console console = System.console();

        if (console != null) {
            String userInput = console.readLine("Enter text: ");
            console.writer().println("You entered: " + userInput);
            console.flush();
        } else {
            System.err.println("Console not available. Run this class from a terminal, not IntelliJ.");
        }
    }
}
