package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page459;

//Implementing UnaryOperator and BinaryOperator
//UnaryOperator and BinaryOperator are special cases of a Function.
// They require all type parameters to be the same type.
// A UnaryOperator transforms its value into one of the same type.
// For example, incrementing by one is a unary operation.
// In fact, UnaryOperator extends Function.
// A BinaryOperator merges two values into one of the same type.
// Adding two numbers is a binary operation.
// Similarly, BinaryOperator extends BiFunction. The interfaces are defined as follows:


import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

//@FunctionalInterface
//interface UnaryOperator<T> extends Function<T, T> {
//    T apply (T t);
//    // omitted static method
//}
//
//@FunctionalInterface
//interface BinaryOperator<T> extends BiFunction<T, T, T> {
//    // omitted static methods
//    T apply (T t1, T t2);
//}

public class Page459 {
    public static void main(String[] args) {
//        This means the method signatures look like this:
//        T apply (T t);         // UnaryOperator
//
//        T apply (T t1, T t2);  // BinaryOperator

//        In the Javadoc, you’ll notice that these methods are inherited from the Function/BiFunction superclass.
//        The generic declarations on the subclass are what force the type to be the same.
//        For the unary example, notice how the return type is the same type as the parameter.
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toUpperCase();

        System.out.println(u1.apply("chirp"));  // CHIRP
        System.out.println(u2.apply("chirp"));  // CHIRP

//        This prints CHIRP twice.
//        We don’t need to specify the return type in the generics because UnaryOperator requires it
//        to be the same as the parameter.

//        And now here’s the binary example:
        BinaryOperator<String> b1 = String::concat;
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd);

        System.out.println(b1.apply("baby ", "chick"));  // baby chick
        System.out.println(b2.apply("baby ", "chick"));  // baby chick

//        Notice that this does the same thing as the BiFunction example.
//        The code is more succinct, which shows the importance of using the best functional interface.
//        It’s nice to have one generic type specified instead of three.


    }
}
