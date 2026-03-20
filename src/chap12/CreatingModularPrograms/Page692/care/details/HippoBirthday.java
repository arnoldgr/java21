package zoo.animal.care.details;

/**
 * HippoBirthday class
 * -------------------
 * Represents internal logic for celebrating a hippo’s birthday.
 * This class is placed in the `zoo.animal.care.details` package,
 * which is intentionally not exported in the module declaration.
 *
 * ⚠️ Important:
 * - Since this package is not exported, classes here cannot be
 *   accessed by other modules.
 * - This demonstrates the principle of encapsulation at the
 *   module level: only selected packages are exposed via `exports`.
 * - Think of this as "healthcare privacy" for the animals —
 *   internal details remain hidden from outside modules.
 */
public class HippoBirthday {

    /**
     * celebrate()
     * -----------
     * Simulates an internal birthday celebration for a hippo.
     * Prints a message to the console.
     *
     * Since this method belongs to a non-exported package, it is
     * only usable within the zoo.animal.care module itself.
     * Other modules cannot call this method directly.
     */
    public void celebrate() {
        System.out.println("Hippo birthday celebration — private details.");
    }
}