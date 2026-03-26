package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page458;

import java.util.function.BiFunction;
import java.util.function.Function;


//Implementing Function and BiFunction
//A Function is responsible for turning one parameter into a value of a potentially different type and returning it.
// Similarly, a BiFunction is responsible for turning two parameters into a value and returning it.
// The interfaces are defined as follows:
//@FunctionalInterface
//interface Function<T, R> {
//    R apply(T t);
//}
//
//@FunctionalInterface
//interface BiFunction<T, U, R> {
//    R apply(T t, U u);
//}

public class Page458 {
    public static void main(String[] args) {
//        For example, this function converts a String to the length of the String:
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(f1.apply("cluck"));  // 5
        System.out.println(f2.apply("cluck"));  // 5

//        This function turns a String into an Integer. Well, technically, it turns the String into an int,
//        which is autoboxed into an Integer.
//        The types don’t have to be different.
//        The following combines two String objects and produces another String:

        BiFunction<String, String, String> b1 = String::concat;
        BiFunction<String, String, String> b2 =
                (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));  // baby chick
        System.out.println(b2.apply("baby ", "chick"));  // baby chick

//        The first two types in the BiFunction are the input types.
//        The third is the result type. For the method reference,
//        the first parameter is the instance that concat() is called on,
//        and the second is passed to concat().

    }
}
