package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page457;

// Implementing Predicate and BiPredicate
// Predicate is often used when filtering or matching.
// Both are common operations.
// A BiPredicate is just like a Predicate, except that it takes two parameters instead of one.
// The interfaces are defined as follows:
//@FunctionalInterface
//interface Predicate<T> {
//    boolean test(T t);
//    // omitted default and static methods
//}
//
//@FunctionalInterface
//interface BiPredicate<T, U> {
//    boolean test(T t, U u);
//    // omitted default methods
//}

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Page457 {
    public static void main(String[] args) {
//        You can use a Predicate to test a condition.
        Predicate<String> p1 = String::isEmpty;
        Predicate<String> p2 = x -> x.isEmpty();

        System.out.println(p1.test(""));  // true
        System.out.println(p2.test(""));  // true

//        This prints true twice. More interesting is a BiPredicate.

//        This example also prints true twice:
        BiPredicate<String, String> b1 = String::startsWith;
        BiPredicate<String, String> b2 =
                (string, prefix) -> string.startsWith(prefix);

        System.out.println(b1.test("chicken", "chick"));  // true
        System.out.println(b2.test("chicken", "chick"));  // true

//        The method reference includes both the instance variable and parameter for startsWith().
//        This is a good example of how method references save quite a lot of typing.
//        The downside is that they are less explicit, and you really have to understand what is going on!

    }
}

