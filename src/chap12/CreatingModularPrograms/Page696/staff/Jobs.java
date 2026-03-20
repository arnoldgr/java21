package chap12.CreatingModularPrograms.Page696.staff;

/**
 * Jobs class
 * ----------
 * Represents internal staff-related functionality for the zoo.
 * This class is part of the `zoo.staff` module, which does not
 * export any packages in its module declaration.
 *
 * ✅ Important:
 * - Since no packages are exported, classes in this module cannot
 *   be accessed by other modules (e.g., zoo.animal.feeding, care, talks).
 * - The module declaration only contains `requires` statements,
 *   meaning zoo.staff depends on other modules but does not expose
 *   its own code externally.
 * - This demonstrates how a module can consume functionality from
 *   other modules while keeping its own logic private.
 */
public class Jobs {

    /**
     * listJobs()
     * ----------
     * Prints a message to the console showing internal staff job
     * processing. This simulates functionality available only inside
     * the zoo.staff module.
     *
     * ⚠️ Note:
     * - Other modules cannot call this method directly because the
     *   package is not exported.
     * - This enforces encapsulation at the module level, ensuring
     *   staff details remain hidden from external modules.
     */
    public void listJobs() {
        // Prints a message to show internal processing
        System.out.println("Listing staff jobs internally.");

        // This simulates functionality available only inside this module
    }
}