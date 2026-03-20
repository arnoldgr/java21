package zoo.animal.care.medical;

/**
 * Diet class
 * ----------
 * Represents medical feeding guidelines for animals.
 * This class is placed in the `zoo.animal.care.medical` package,
 * which is exported in the module declaration so that other modules
 * can access its functionality.
 *
 * ✅ Important:
 * - Unlike the `zoo.animal.care.details` package, this package is
 *   explicitly exported in `module-info.java`.
 * - This means classes here (like Diet) are accessible to other
 *   modules, such as zoo.animal.feeding or zoo.animal.habitat.
 * - Demonstrates how modules can selectively expose functionality
 *   while keeping internal details private.
 */
public class Diet {

    /**
     * feedAnimal()
     * -------------
     * Simulates feeding an animal according to medical guidelines.
     * Prints a message to the console.
     *
     * Since this class is in an exported package, other modules
     * can call this method directly. For example:
     *   new Diet().feedAnimal();
     *
     * This shows how the `exports` directive in module-info.java
     * makes selected functionality available across modules.
     */
    public void feedAnimal() {
        System.out.println("Animal has been fed according to medical plan.");
    }
}