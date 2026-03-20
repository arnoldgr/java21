package chap12.CreatingModularPrograms.Page693;

/**
 * HippoBirthday class
 * -------------------
 * Represents internal logic for celebrating a hippo’s birthday.
 * This class is placed in the `zoo.animal.care.details` package,
 * which is intentionally **not exported** in the module declaration.
 *
 * ⚠️ Important:
 * - Since this package is not exported, classes here cannot be
 *   accessed by other modules (e.g., zoo.animal.feeding).
 * - This demonstrates module-level encapsulation: only selected
 *   packages are exposed via `exports`, while internal details
 *   remain private.
 * - If another module tries to import this class, the compiler
 *   will throw an error because the package is hidden.
 */
public class HippoBirthday {

    /**
     * celebrate()
     * -----------
     * Simulates a hippo birthday celebration.
     * Prints a message to the console.
     *
     * This method is internal to the zoo.animal.care module.
     * Other modules cannot call it directly because the
     * `zoo.animal.care.details` package is not exported.
     *
     * Example:
     * - Allowed: Called within zoo.animal.care itself.
     * - Forbidden: Called from zoo.animal.feeding or zoo.animal.habitat,
     *   which would result in a compile-time error.
     */
    public void celebrate() {
        System.out.println("Hippo birthday celebration — private details.");

        // Demonstrates how internal packages remain hidden from other modules
    }
}