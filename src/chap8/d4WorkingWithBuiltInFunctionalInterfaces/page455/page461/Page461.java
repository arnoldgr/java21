package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page461;

//Using Convenience Methods on Functional Interfaces
// By definition, all functional interfaces have a single abstract method.
// This doesn’t mean they can have only one method, though.
// Several of the common functional interfaces provide a number of helpful default interface methods.

//Table 8.5 shows the convenience methods on the built-in functional interfaces that you need to know for the exam. All of these facilitate modifying or combining functional interfaces of the same type. Note that Table 8.5 shows only the main interfaces. The BiConsumer, BiFunction, and BiPredicate interfaces have similar methods available.
//SEE TABLE 8.5 IN THE BOOK

//Consumer:   andThen(0),
//Function:   andThen(), compose()
//Predicate:  and(), negate(), or()

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Page461 {
    public static void main(String[] args) {

//    Let’s start with these two Predicate variables:
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

//    Now we want a Predicate for brown eggs and another for all other colors of eggs. We could write this by hand, as shown here:
        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
        Predicate<String> otherEggs = s -> s.contains("egg") && !s.contains("brown");

//    This works, but it’s not great. It’s a bit long to read, and it contains duplication.
//    What if we decide the letter e should be capitalized in egg?
//    We’d have to change it in three variables: egg, brownEggs, and otherEggs.
//    A better way to deal with this situation is to use two of the default methods on Predicate.

        brownEggs = egg.and(brown);
        otherEggs = egg.and(brown.negate());

//    Neat! Now we are reusing the logic in the original Predicate variables to build two new ones.
//    It’s shorter and clearer what the relationship is between variables.
//    We can also change the spelling of egg in one place, and the other
//    two objects will have new logic because they reference it.
//    Moving on to Consumer, let’s take a look at the andThen() method,
//    which runs two functional interfaces in sequence.

        Consumer<String> c1 = x -> System.out.print("1: " + x);
        Consumer<String> c2 = x -> System.out.print(",2: " + x);

        Consumer<String> combined = c1.andThen(c2);
        combined.accept("Annie");  // 1: Annie,2: Annie

//    Notice how the same parameter is passed to both c1 and c2.
//    This shows that the Consumer instances are run in sequence and are independent of each other.
//    By contrast, the compose() method on Function chains functional interfaces.
//    However, it passes along the output of one to the input of another.

        Function<Integer, Integer> before = x -> x + 1;
        Function<Integer, Integer> after = x -> x * 2;

        Function<Integer, Integer> combined2 = after.compose(before);
        System.out.println(combined2.apply(3));   // 8

//    This time, the before runs first, turning the 3 into 4. Then the after runs, doubling the 4 to 8.
//    All of the methods in this section are helpful for simplifying your code as you work with functional interfaces.

    }
}
