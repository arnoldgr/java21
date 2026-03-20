package chap4.CreatingAndManipulatingStrings;

public class Page180 {
    public static void main(String[] args) {
//        Method Chaining
//        Ready to put together everything you just learned about?
//        It is common to call multiple methods, as shown here:
        var start = "AniMaL   ";
        var trimmed = start.trim();                 // "AniMaL"
        var lowercase = trimmed.toLowerCase();      // "animal"
        var result = lowercase.replace('a', 'A');   // "AnimAl"
        System.out.println(result);

//      This is just a series of String methods. Each time one is called, the returned value is put in a new variable. There are four String values along the way, and AnimAl is output.
//      However, on the exam, there is a tendency to cram as much code as possible into a small space. You’ll see code using a technique called method chaining. Here’s an example:
        result = "AniMaL   ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);

//        This code is equivalent to the previous example.
//        It also creates four String objects and outputs AnimAl.
//        To read code that uses method chaining, start at the left and evaluate the first method.
//        Then call the next method on the returned value of the first method.
//        Keep going until you get to the semicolon.
//        What do you think the result of this code is?
        String a = "abc";
        String b = a.toUpperCase();
        b = b.replace("B", "2").replace('C', '3');
        System.out.println("a=" + a);
        System.out.println("b=" + b);

//        On line 5, we set a to point to "abc" and never pointed a to anything else.
//        Since none of the code on lines 6 and
//        7 changes a, the value remains "abc".
//        However, b is a little trickier.Line 6 has b pointing to "ABC",
//        which is straightforward.On line 7, we have method chaining.
//        First, "ABC".replace("B", "2") is called.
//        This returns "A2C".Next, "A2C".replace(’C’, ’3’)
//        is called.This returns "A23".Finally, b changes to point to
//        this returned String.When line 9 executes, b is
//        "A23".

    }
}
