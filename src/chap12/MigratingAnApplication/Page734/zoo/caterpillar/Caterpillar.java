package chap12.MigratingAnApplication.Page734.zoo.caterpillar;

import chap12.MigratingAnApplication.Page734.zoo.butterfly.Butterfly;

/**
 * Caterpillar class
 * -----------------
 * Represents a caterpillar that eventually emerges as a butterfly.
 * This example demonstrates how one module (zoo.caterpillar) can
 * depend on another module (zoo.butterfly).
 *
 * Important: If zoo.butterfly also requires zoo.caterpillar, this
 * creates a circular dependency, which Java’s module system forbids.
 * To avoid compilation errors, dependencies must flow in one direction.
 *
 * ⚠️ Note: If both modules declare `requires` on each other in their
 * module-info.java files, the compiler will throw an error:
 *   "error: cyclic dependence involving zoo.caterpillar and zoo.butterfly"
 */
public class Caterpillar {

    /**
     * emergeCocoon()
     * ---------------
     * Simulates the caterpillar emerging from its cocoon.
     * Returns a new Butterfly instance, showing how classes
     * in one module can construct and return objects from another.
     *
     * This method demonstrates cross-module interaction:
     * - Caterpillar depends on Butterfly.
     * - If Butterfly also depended on Caterpillar, we’d have a cycle
     *   and compilation would fail.
     */
    public Butterfly emergeCocoon() {
        System.out.println("Caterpillar emerges from cocoon...");
        return new Butterfly();
    }

    /**
     * main()
     * -------
     * Simple test harness to verify the Caterpillar-to-Butterfly
     * transformation works. Creates a Caterpillar, calls emergeCocoon(),
     * and then invokes flutter() on the resulting Butterfly.
     *
     * This is a standalone demo, not intended for production use.
     */
    public static void main(String[] args) {
        Caterpillar cat = new Caterpillar();
        Butterfly bfly = cat.emergeCocoon();
        bfly.flutter(); // test that it works
    }
}