package chap12.MigratingAnApplication.Page734.zoo.butterfly;

/**
 * Butterfly class
 * ----------------
 * Represents a butterfly in the zoo application.
 * This class is deliberately simple, with no external dependencies,
 * to avoid cyclic module issues. It demonstrates how a module can
 * export functionality without requiring another module in return.
 *
 * ⚠️ Note: If this module (zoo.butterfly) were to declare a `requires`
 * on zoo.caterpillar, while zoo.caterpillar also declares a `requires`
 * on zoo.butterfly, the compiler would throw a cyclic dependency error:
 *   "error: cyclic dependence involving zoo.butterfly and zoo.caterpillar"
 * One-way dependencies are fine, but two-way dependencies are forbidden.
 */
public class Butterfly {

    /**
     * flutter()
     * ---------
     * Prints a message to the console indicating that the butterfly
     * is fluttering its wings. This is a stand‑alone behavior that
     * does not depend on other classes or modules.
     *
     * By keeping this method independent, we avoid introducing
     * circular dependencies between modules (e.g., butterfly ↔ caterpillar).
     */
    public void flutter() {
        System.out.println("The butterfly flutters its wings!");
    }
}