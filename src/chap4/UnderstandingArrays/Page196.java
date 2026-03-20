package chap4.UnderstandingArrays;

import java.util.Arrays;

public class Page196 {
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

//        Here’s an example:
        System.out.println(Arrays.compare(new int[] {1}, new int[] {2}));

//        This code prints a negative number. It should be pretty intuitive that 1 is smaller than 2,
//        making the first array smaller.
    }
}
