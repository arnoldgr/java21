package chap4.UnderstandingArrays;

import java.util.Arrays;

import static java.lang.System.*;

public class Page197 {
    public static void main(String[] args) {
//        Using compare()
//        There are a bunch of rules you need to know before calling compare().
//        Luckily, these are the same rules you need to know in Chapter 9 when writing a Comparator.
//        First you need to learn what the return value means.
//        You do not need to know the exact return values, but you do need to know the following:
//
//        A negative number means the first array is smaller than the second.
//        A zero means the arrays are equal.
//        A positive number means the first array is larger than the second.
//
//        Here’s an example:
        out.println(Arrays.compare(new int[]{1}, new int[]{2}));


//        This code prints a negative number. It should be pretty intuitive that 1 is smaller than 2, making the first array smaller.
//        Now that you know how to compare a single value,
//
//        let’s look at how to compare arrays of different lengths:
//
//        If both arrays are the same length and have the same values in each spot in the same order, return zero.
//        If all the elements are the same but the second array has extra elements at the end, return a negative number.
//        If all the elements are the same, but the first array has extra elements at the end, return a positive number.
//        If the first element that differs is smaller in the first array, return a negative number.
//        If the first element that differs is larger in the first array, return a positive number.
//
//        Finally, what does smaller mean? Here are some more rules that apply here and to compareTo(),
//        which you see in Chapter 8, “Lambdas and Functional Interfaces”:
//
//        null is smaller than any other value.
//        For numbers, normal numeric order applies.
//                For strings, one is smaller if it is a prefix of another.
//        For strings/characters, numbers are smaller than letters.
//        For strings/characters, uppercase is smaller than lowercase.
//
//        Lets see examples of these rules in action.

        out.println(Arrays.compare(new int[]{1, 2}, new int[]{1})); // POSITIVE The first element is the same,
                                                                    // but the first array is longer.
        out.println(Arrays.compare(new int[]{1, 2}, new int[]{1, 2})); // zero exact match
        out.println(Arrays.compare(new String[]{"a"}, new String[]{"aa"})); // NEGATIVE The first element
        // is a substring of the second.
        out.println(Arrays.compare(new String[]{"a"}, new String[]{"A"}));//POSITIVE Uppercase is smaller than lowercase.
        System.out.println(Arrays.compare(new String[]{"a"}, new String[]{null}));//POSITIVE null is smaller than a letter
    }
}