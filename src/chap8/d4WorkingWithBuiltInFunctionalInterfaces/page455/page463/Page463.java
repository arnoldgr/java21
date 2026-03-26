package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page463;

// Learning the Functional Interfaces for Primitives
// Remember when we told you to memorize Table 8.4 with the common functional interfaces?
// Did you? If you didn’t, go do it now. We’ll wait. We are about to make it more involved.
// There are also a large number of special functional interfaces for primitives.
// These are useful in Chapter 10 when we cover streams and optionals.
// Most of them are for the double, int, and long types. There is one exception, which is BooleanSupplier.
// We cover that before introducing the functional interfaces for double, int, and long.

// Functional Interfaces for boolean
// BooleanSupplier is a separate type. It has one method to implement.
// @FunctionalInterface
// public interface BooleanSupplier {
// boolean getAsBoolean();
// }

import java.util.function.BooleanSupplier;

//It works just as you’ve come to expect from functional interfaces. Here’s an example:
public class Page463 {
    public static void main(String[] args) {
        BooleanSupplier b1 = () -> true;
        BooleanSupplier b2 = () -> Math.random() > .5;
        System.out.println(b1.getAsBoolean());  // true
        System.out.println(b2.getAsBoolean());  // false

//      Lines 19 and 20 each create a BooleanSupplier,
//      which is the only functional interface for boolean.
//      Line 21 prints true, since it is the result of b1.
//      Line 22 prints true or false, depending on the random value generated.
    }
}
