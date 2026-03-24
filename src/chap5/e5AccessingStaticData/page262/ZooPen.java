package chap5.e5AccessingStaticData.page262;

//Static Variable Modifiers
//Referring back to Table 5.3, static variables can be declared with the same modifiers
// as instance variables, such as final, transient, and volatile.
// While some static variables are meant to change as the program runs,
// like our count example, others are meant to never change.
// This type of static variable is known as a constant.
// It uses the final modifier to ensure the variable never changes.
//Constants use the modifier static final and a different naming convention than other variables.
// They use all uppercase letters with underscores between “words.” Here’s an example:
public class ZooPen {
    private static final int NUM_BUCKETS = 45;

    public static void main(String[] args) {
//        NUM_BUCKETS = 5;  // DOES NOT COMPILE
    }
}
//The compiler will make sure that you do not accidentally try to update a final variable.


