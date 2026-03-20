package chap1.WritingAMainMethod.page7;

public class Zoo {

    //The main() method lets the JVM call our code.
    // The simplest possible class with a main() method looks like this:

    public static void main(String[] args) {
        System.out.println("Hello World");
    }


       /* This code prints Hello World.To compile and execute this code, type it into a file called Zoo.java and
        execute the following:
        javac Zoo.java
        java Zoo

        Meaning of key words in the main method:

        The keyword public is what’s called an access modifier.
        It declares this method’s level of exposure to potential callers in the program.
        Naturally, public means full access from anywhere in the program. You learn more about access modifiers in Chapter 5.

        The keyword public is what’s called an access modifier.
        It declares this method’s level of exposure to potential callers in the program.
        Naturally, public means full access from anywhere in the program.
        You learn more about access modifiers in Chapter 5.

        The keyword void represents the return type.
        A method that returns no data returns control to the caller silently.
        In general, it’s good practice to use void for methods that change an object’s state.
        In that sense, the main() method changes the program state from started to finished.
        We explore return types in Chapter 5 as well.

        Finally, we arrive at the main() method’s parameter list, represented as an array of java.lang.
        String objects. You can use any valid variable name along with any of these three formats:

String[] args
String options[]
String… friends

        The compiler accepts any of these.
        The variable name args is common because it hints that this list contains values that were read in (arguments)
        when the JVM started. The characters [] are brackets and represent an array.
        An array is a fixed-size list of items that are all of the same type.
        The characters … are called varargs (variable argument lists).
        You learn about String in this chapter. Arrays are in Chapter 4, “Core APIs,” and varargs are in Chapter 5.

While most modifiers, such as public and static, are required for main() methods, there are some optional modifiers allowed.



public final static void main(final String[] args) {}


In this example, both final modifiers are optional, and the main() method is a valid entry point with or without them. We cover the meaning of final methods and parameters in Chapter 6.
*/

}

