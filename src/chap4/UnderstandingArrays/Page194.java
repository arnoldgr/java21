package chap4.UnderstandingArrays;

import java.util.Arrays;

public class Page194 {
    public static void main(String[] args) {
//        Sorting
//        Java makes it easy to sort an array by providing a sort method—or rather, a bunch of sort methods.
//        Just like StringBuilder allowed you to pass almost anything to append(), you can pass almost any array to
//        Arrays.sort().
//        Arrays requires an import. To use it, you must have either of the following two statements in your class:
//        import java.util.*;          // import whole package including Arrays
//        import java.util.Arrays;     // import just Arrays

//        There is one exception, although it doesn’t come up often on the exam.
//        You can write java.util.Arrays every time it is used in the class
//        instead of specifying it as an import.
//        Remember that if you are shown a code snippet, you can assume the necessary imports are there.
//        This simple example sorts three numbers:
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] +  " ");

//        The result is 1 6 9, as you should expect it to be. Notice that we looped through the output to
//        print the values in the array.
//        Just printing the array variable directly would give the annoying hash of [I@2bd9c3e7.
//        Alternatively, we could have printed Arrays.toString(numbers) instead of using the loop. That would have output [1, 6, 9].
//        Try this again with String types:
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String s : strings)
            System.out.print(s + " ");

//        This time the result might not be what you expect.
//        This code outputs 10 100 9.
//        The problem is that String sorts in alphabetic order, and 1 sorts before 9.
//        (Numbers sort before letters, and uppercase sorts before lowercase.)
//        In Chapter 9, “Collections and Generics,” you learn how to create custom sort orders
//        using something called a comparator.




//       You can use 7Up, the soda, to help remember the order.
//       Numbers (7) sort first, followed by uppercase (U), and then lowercase (p).

    }
}
