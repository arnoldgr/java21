package zoo.animal.talks.media;

/**
 * Announcement class
 * ------------------
 * Represents public announcements for zoo talks.
 * This class is part of the `zoo.animal.talks.media` package,
 * which is explicitly exported in the module declaration.
 *
 * ✅ Important:
 * - Because the package is exported in `module-info.java`, other
 *   modules can access this class.
 * - This demonstrates how the `exports` directive makes selected
 *   functionality available outside the module.
 * - The presence of a `main()` method means this class can be run
 *   directly from the command line, serving as an entry point.
 */
public class Announcement {

    /**
     * main()
     * -------
     * Entry point to run the module directly.
     * Prints a message to the console announcing that zoo talks
     * will be held.
     *
     * Example usage:
     *   java zoo.animal.talks.media.Announcement
     *
     * Output:
     *   "We will be having talks"
     *
     * This demonstrates how classes in exported packages can be
     * executed independently or referenced by other modules.
     */
    public static void main(String[] args) {
        // Entry point to run the module directly
        System.out.println("We will be having talks");
    }
}