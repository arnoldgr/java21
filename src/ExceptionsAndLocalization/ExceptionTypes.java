package ExceptionsAndLocalization;
// Exception Types
// Java has three main categories of exceptions: Checked, Unchecked, and Errors.
// Checked exceptions must be handled or declared, unchecked exceptions do not,
// and Errors are serious problems your program should not try to recover from.

import java.io.IOException;
// Checked vs Unchecked Exceptions
// Checked exceptions must be declared or handled — the compiler enforces this.
// Unchecked exceptions do not need to be declared or handled — they happen at runtime.

// CHECKED — must declare with 'throws' or handle with try/catch
public class ExceptionTypes {

    // Checked exceptions - must be handled or declared
    class CanNotHopException extends Exception {}
    class NoMoreCarrotsException extends Exception {}

    // Superclass hop() declares NO exceptions
    // so Bunny CANNOT add new checked exceptions when overriding
    class Hopper {
        public void hop() {}
    }

    // Superclass hop() declares CanNotHopException
    // so Bunny is allowed to declare fewer or none at all
    class HopperWithException {
        public void hop() throws CanNotHopException {}
    }

    // LEGAL: overriding with fewer exceptions than parent
    class Bunny extends HopperWithException {
        public void hop() {} // dropping the exception is perfectly fine
    }

    // Method that simulates a fall, handles IOException internally using try-catch
    void fall(int distance) {
        // Try block to catch any exceptions that may occur
        try {
            // Check if the distance exceeds the safe limit of 10
            if(distance > 10) {
                // Throw IOException if distance is greater than 10
                throw new IOException();
            }
            // Catch any Exception (including IOException) if thrown
        } catch (Exception e) {
            // Print the stack trace to help identify where the error occurred
            e.printStackTrace();
        }
    }

    // Throws an unchecked RuntimeException - no declaration needed
    private static void hop() {
        throw new RuntimeException("cannot hop");
    }

    public static void main(String[] args) {
        // Create an instance of ExceptionTypes to call the fall method
        ExceptionTypes obj = new ExceptionTypes();

        System.out.println("Test 1: distance = 5 (safe, no exception expected)");
        obj.fall(5); // distance is 10 or less, should run fine
        System.out.println("Test 1 passed!\n");

        System.out.println("Test 2: distance = 15 (too far, exception expected)");
        obj.fall(15); // distance is greater than 10, should trigger IOException
        System.out.println("Test 2 completed - exception was caught internally\n");

        System.out.println("Test 3: distance = 10 (boundary value, no exception expected)");
        obj.fall(10); // exactly 10, should run fine
        System.out.println("Test 3 passed!\n");

        try {
            hop();
        } catch (Exception e) {
            System.out.println(e);              // prints type + message
            System.out.println(e.getMessage()); // prints message only
            e.printStackTrace();                // prints full call hierarchy
        }
    }
}