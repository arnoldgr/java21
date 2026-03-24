package chap5.g8OverloadingMethods.page273;

//Let’s try another. What does this print?

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Parrot {
    public static void print(List<Integer> i) {
        System.out.print("I");
    }

    public static void print(CharSequence c) {
        System.out.print("C");
    }

    public static void print(Object o) {
        System.out.print("O");
    }

    public static void main(String[] args) {
        print("abc");
        print(Arrays.asList(3));
        print(LocalDate.of(2019, Month.JULY, 4));
    }
}

//The answer is CIO. The code is due for a promotion! The first call to print() passes a String.
// As you learned in Chapter 4, String and StringBuilder implement the CharSequence interface.
// You also learned that Arrays.asList() can be used to create a List<Integer> object, which explains the second output.
// The final call to print() passes a LocalDate. This is a class you might not know, but that’s OK.
// It clearly isn’t a sequence of characters or a list. That means the Object method signature is used.


