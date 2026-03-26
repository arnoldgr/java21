package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page455;

//Working with Built-in Functional Interfaces

//It would be inconvenient to write your own functional interface any time you want to write a lambda.
// Luckily, a large number of general-purpose functional interfaces are provided for you.
// We cover them in this section.
// We cover generics in the next chapter, but for now, you just need to know that <T> allows the interface to
// take an object of a specified type.
// If a second type parameter is needed, we use the next letter, U.
// If a distinct return type is needed, we choose R for return as the generic type.

// Let’s look at how to implement each of these interfaces.
// Since both lambdas and method references appear all over the exam,
// we show an implementation using both where possible. After introducing the interfaces,
// we also cover some convenience methods available on these interfaces.

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

// Implementing Supplier
// A Supplier is used when you want to generate or supply values without taking any input.
// The Supplier interface is defined as follows:
//@FunctionalInterface
//interface Supplier<T> {
//    T get();
//}

//You can create a LocalDate object using the factory method now().
// This example shows how to use a Supplier to call this factory:

public class Page455 {
    public static void main(String[] args) {
        Supplier<LocalDate> s1 = LocalDate::now;
        Supplier<LocalDate> s2 = () -> LocalDate.now();

        LocalDate d1 = s1.get();
        LocalDate d2 = s2.get();

        System.out.println(d1);  // 2025-02-20
        System.out.println(d2);  // 2025-02-20

//        This example prints a date twice.
//        It’s also a good opportunity to review static method references.
//        The LocalDate::now method reference is used to create a Supplier to assign to an
//        intermediate variable s1.
//        A Supplier is often used when constructing new objects.
//        For example, we can print two empty StringBuilder objects.

        Supplier<StringBuilder> s3 = StringBuilder::new;
        Supplier<StringBuilder> s4 = () -> new StringBuilder();

        System.out.println(s3.get());  // Empty string
        System.out.println(s4.get());  // Empty string

//        This time, we used a constructor reference to create the object.
//        We’ve been using generics to declare what type of Supplier we are using.
//        This can be a little long to read. Can you figure out what the following does?
//        Just take it one step at a time.
        Supplier<ArrayList<String>> s5 = ArrayList::new;
        ArrayList<String> a1 = s5.get();
        System.out.println(a1);  // []


//        We have a Supplier of a certain type.
//        That type happens to be ArrayList<String>.
//        Then calling get() creates a new instance of ArrayList<String>,
//        which is the generic type of the Supplier—in other words,
//        a generic that contains another generic.
//        Be sure to look at the code carefully when this type of thing comes up.
//        Notice how we called get() on the functional interface.
//        What would happen if we tried to print out s5 itself?
        System.out.println(s5);

//        The code prints something like this:
//        functionalinterface.BuiltIns$$Lambda$1/0x0000000800066840@4909b8da
//
//        That’s the result of calling toString() on a lambda. Yuck.
//        This actually does mean something. Our test class is named BuiltIns,
//        and it is in a package that we created named functionalinterface.
//        Then comes $$, which means the class doesn’t exist in a class file on the file system.
//        It exists only in memory. You don’t need to worry about the rest.

    }
}


