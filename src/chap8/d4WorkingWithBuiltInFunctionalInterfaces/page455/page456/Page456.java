package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page456;

// mplementing Consumer and BiConsumer

// You use a Consumer when you want to do something with a parameter but not return anything.
// BiConsumer does the same thing, except that it takes two parameters.

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

// The interfaces are defined as follows:
//@FunctionalInterface
//interface Consumer<T> {
//    void accept(T t);
//    // omitted default method
//}
//
//@FunctionalInterface
//interface BiConsumer<T, U> {
//    void accept(T t, U u);
//    // omitted default method
//}

public class Page456 {
    public static void main(String[] args) {
//        You’ll notice this pattern. Bi means two. It comes from Latin,
//        but you can remember it from English words like binary (0 or 1) or bicycle (two wheels).
//        The interface method will always take two inputs when you see Bi.

//        Printing is a common use of the Consumer interface.

        Consumer<String> c1 = System.out::println;
        Consumer<String> c2 = x -> System.out.println(x);

        c1.accept("Annie");  // Annie
        c2.accept("Annie");  // Annie


//        BiConsumer is called with two parameters.
//        They don’t have to be the same type.
//        For example, we can put a key and a value in a map using this interface:
        var map = new HashMap<String, Integer>();
        BiConsumer<String, Integer> b1 = map::put;
        BiConsumer<String, Integer> b2 = (k, v) -> map.put(k, v);

        b1.accept("chicken", 7);
        b2.accept("chick", 1);

        System.out.println(map);  // {chicken=7, chick=1}

//        The output is {chicken=7, chick=1}, which shows that both BiConsumer implementations were called.
//        When declaring b1, we used an instance method reference on an object since we
//        want to call a method on the local variable map.
//        The code to instantiate b1 is a good bit shorter than the code for b2.
//        This is probably why the exam is so fond of method references.

//        As another example, we use the same type for both generic parameters:
        var map2 = new HashMap<String, String>();
        BiConsumer<String, String> b3 = map2::put;
        BiConsumer<String, String> b4 = (k, v) -> map2.put(k, v);

        b3.accept("chicken", "Cluck");
        b4.accept("chick", "Tweep");

        System.out.println(map2);  // {chicken=Cluck, chick=Tweep}

//        This shows that a BiConsumer can use the same type for both the T and U generic parameters.

    }
}