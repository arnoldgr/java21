package chap12.CreatingModularPrograms.Page687;

/**
 * Task class
 * ----------
 * Represents a simple entry point for the zoo.animal.feeding module.
 * This class contains a main() method that prints a message to the console.
 *
 * Notes:
 * - This is intentionally minimal, as the book focuses on module structure
 *   rather than business logic.
 * - In a real application, this class could be expanded with feeding logic
 *   and integration with other modules.
 */
public class Task {

    /**
     * main()
     * -------
     * The starting point of the Java application.
     * Uses varargs (String... args) to accept command-line inputs.
     *
     * When run, it prints "All fed!" to the console, confirming that
     * the program executed successfully.
     *
     * ⚠️ Important exam note:
     * - The module-info.java file for this class must be placed in the
     *   root of the module (not inside a package).
     * - Module names follow package naming rules (periods allowed, dashes not).
     * - This simple setup demonstrates the minimum requirements for a module.
     */
    public static void main(String... args) {
        System.out.println("All fed!"); // Prints output to console
    }
}