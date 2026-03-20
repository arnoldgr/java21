package chap12.CreatingModularPrograms.Page692.feeding.animal.zoo;

/**
 * Task class
 * ----------
 * Entry point for the zoo.animal.feeding module.
 * This class contains a simple main() method that prints a message
 * confirming animals have been fed.
 *
 * ✅ Important:
 * - Because the `zoo.animal.feeding` package is exported in the
 *   module-info.java file, other modules can call code in this package.
 * - This demonstrates how the `exports` directive makes selected
 *   functionality available outside the module.
 * - Without the `exports` directive, this class would only be runnable
 *   from the command line within its own module.
 */
public class Task {

    /**
     * main()
     * -------
     * The starting point of the feeding module.
     * Uses varargs (String... args) to accept command-line inputs.
     *
     * Prints "All fed!" to the console, confirming the program executed
     * successfully. Other modules can also invoke this class because
     * the package is exported.
     *
     * Example usage from another module:
     *   zoo.animal.feeding.Task.main(new String[]{});
     */
    public static void main(String... args) {
        // Entry point of the feeding module
        System.out.println("All fed!"); // confirms the program executed successfully

        // Other modules can call code in this package because of exports in module-info.java
    }
}