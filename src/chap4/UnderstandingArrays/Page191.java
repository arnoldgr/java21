package chap4.UnderstandingArrays;

import java.util.Arrays;

public class Page191 {
    public static void main(String[] args) {
//        Multiple “Arrays” in Declarations

//        What types of reference variables do you think the following code creates?


        int[] ids, types;


//        The correct answer is two variables of type int[]. This seems logical enough.
//        After all, int a, b; created two int variables. What about this example?


        int ids2[], types2;


//        All we did was move the brackets, but it changed the behavior.
//        This time we get one variable of type int[] and one variable of type int.
//        Java sees this line of code and thinks something like this:
//        “They want two variables of type int. The first one is called ids[].
//        This one is an int[] called ids. The second one is just called types.
//        No brackets, so it is a regular integer.”
//        Needless to say, you shouldn’t write code that looks like this.
//        But you do need to understand it for the exam.

//        Creating an Array with Reference Variables
//        You can choose any Java type to be the type of the array.
//        This includes classes you create yourself.

//        Let’s take a look at a built-in type with String:
        String[] bugs = { "cricket", "beetle", "ladybug" };
        String[] alias = bugs;
        String[] anotherArray = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.equals(alias));        // true
        System.out.println(bugs.equals(anotherArray)); // false
        System.out.println(bugs.toString());           // [Ljava.lang.String;@160bc7c0

//        We can call equals() because an array is an object.
//        The first test with alias returns true because of reference equality.
//        Why does the second equality test return false?
//        The equals() method on arrays does not look at the elements of the array.
//        The second print statement is even more interesting.
//        What on Earth is [Ljava.lang.String;@160bc7c0?
//        You don’t have to know this for the exam,
//        but [L means it is an array, java.lang.String is the reference type,
//        and 160bc7c0 is the hash code. You’ll get different numbers and letters
//        each time you run it since this is a reference.

//        Java provides a method that prints an array nicely:
        Arrays.toString(bugs);

//        would print
//        [cricket, beetle, ladybug].

        System.out.println(Arrays.toString(bugs).equals(Arrays.toString(anotherArray)));
    }
}
