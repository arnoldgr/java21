package chap5.e5AccessingStaticData.page263;

public class Page263 {
//    In Chapter 1, we covered instance initializers that looked like unnamed methods—just code inside braces.
//    Now we introduce static initializers, which look similar.
//    We just add the static keyword to specify that they should be run when the class is first loaded.
//    Here’s an example:

    private static final int NUM_SECONDS_PER_MINUTE;
    private static final int NUM_MINUTES_PER_HOUR;
    private static final int NUM_SECONDS_PER_HOUR;

    static {
        NUM_SECONDS_PER_MINUTE = 60;
        NUM_MINUTES_PER_HOUR = 60;
    }

    static {
        NUM_SECONDS_PER_HOUR
                = NUM_SECONDS_PER_MINUTE * NUM_MINUTES_PER_HOUR;
    }
//    All static initializers run when the class is first used, in the order they are defined.
//    The statements in them run and assign any static variables as needed.
//    There is something interesting about this example.
//    We just got through saying that final variables aren’t allowed to be reassigned.
//    The key here is that the static initializer is the first assignment. And since it occurs up front, it is OK.
//    Let’s try another example to make sure you understand the distinction:

    private static int one;
    private static final int two;
    private static final int three = 3;
//    private static final int four;    // DOES NOT COMPILE
    static {
        one = 1;
        two = 2;
//        three = 3;                     // DOES NOT COMPILE
//        two = 4;                       // DOES NOT COMPILE
    }

//    Line 29 declares a static variable that is not final.
//    It can be assigned as many times as we like.
//    Line 30 declares a final variable without initializing it.
//    This means we can initialize it exactly once in a static block.
//    Line 37 doesn’t compile because this is the second attempt.
//    Line 31 declares a final variable and initializes it at the same time.
//    We are not allowed to assign it again,
//    so line 36 doesn’t compile.
//    Line 32 declares a final variable that never gets initialized.
//    The compiler gives a compiler error because it knows that the static blocks
//    are the only place the variable could possibly be initialized.
//    Since the programmer forgot, this is clearly an error.

//    Real World Scenario
//
//    Try to Avoid static and Instance Initializers
//
//    Using static and instance initializers can make your code much harder to read.
//    Everything that could be done in an instance initializer could be done in a constructor instead.
//    Many people find the constructor approach easier to read.
//    There is a common case to use a static initializer:
//    when you need to initialize a static field and the code to do so requires more than one line.
//    This often occurs when you want to initialize a collection like an ArrayList or a HashMap.
//    When you do need to use a static initializer, put all the static initialization in the same block.
//    That way, the order is obvious.

}
