package chap14.interacting_with_users.page860;

import java.io.Console;
import java.util.Arrays;

public class ConsoleMethods {

    public static void main(String[] args) {
        Console console = System.console();

        if (console == null) {
            System.err.println("Console not available. Run this class from a terminal, not IntelliJ.");
            return;
        }

        String name = console.readLine("Please enter your name: ");
        console.writer().format("Hi %s%n", name);

        console.format("What is your address? ");
        String address = console.readLine();

        char[] password = console.readPassword(
                "Enter a password between %d and %d characters: ", 5, 10);

        char[] verify = console.readPassword("Enter the password again: ");

        console.printf("Address entered: %s%n", address);
        console.printf("Passwords %s%n",
                Arrays.equals(password, verify) ? "match" : "do not match");

        console.flush();
    }
}