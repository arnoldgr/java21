package chap5.PassingDataAmongMethods.page269;

public class Page269 {
    public static void main(String[] args) {
//        Autoboxing and Unboxing Variables
//        Java supports some helpful features around passing primitive and wrapper data types,
//        such as int and Integer.
//        Remember from Chapter 1 that we can explicitly convert between primitives
//        and wrapper classes using built-in methods.
        int quack = 5;
        Integer quackquack = Integer.valueOf(quack);  // Convert int to Integer
        int quackquackquack = quackquack.intValue();  // Convert Integer to int

//        Useful, but a bit verbose.
//        Luckily, Java has handlers built into the Java language that automatically convert
//        between primitives and wrapper classes and back again.
//        Autoboxing is the process of converting a primitive into its equivalent
//        wrapper class, while unboxing is the process of converting a
//        wrapper class into its equivalent primitive.
        quack = 5;
        quackquack = quack;        // Autoboxing
        quackquackquack = quackquack;  // Unboxing

//        The new code is equivalent to the previous code, as the compiler
//        is “doing the work” of converting the types automatically for you.
//        Autoboxing applies to all primitives and their associated wrapper types,
//        such as the following:
        Short tail = 8;                        // Autoboxing
        Character p = Character.valueOf('p');
        char paw = p;                          // Unboxing
        Boolean nose = true;                   // Autoboxing
        Integer e = Integer.valueOf(9);
        long ears = e;                         // Unboxing, then implicit casting
        Character n = 'n';
//        Each of these examples compiles without issue.
//        In the last line, e is unboxed to an int value. Since an int value can be
//        stored in a long variable via implicit casting, the compiler allows the assignment.

//        Limits of Autoboxing and Numeric Promotion

//        While Java will implicitly cast a smaller primitive to a larger type, as well as autobox, it will not do both at the same time. Do you see why the following does not compile?


//       Long badGorilla = 8;  // DOES NOT COMPILE


//        The compiler will automatically cast or autobox the int value to long or Integer, respectively. Neither of these types can be assigned to a Long reference variable, though, so the code does not compile. Compare this behavior to the previous example with ears, where the unboxed primitive value could be implicitly cast to a larger primitive type.


//                What do you think happens if you try to unbox a null?
        Character elephant = null;
        char badElephant = elephant;   // NullPointerException

//        On line 51, we store null in a Character reference.
//        This is legal because a null reference can be assigned to any reference variable.
//        On line 52, we try to unbox that null to a char primitive.
//        This is a problem.
//        Java tries to get the char value of null. Since calling any method on null gives a NullPointerException,
//        that is just what we get. Be careful when you see null in relation to autoboxing and unboxing.

    }
}
