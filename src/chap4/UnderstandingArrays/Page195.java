package chap4.UnderstandingArrays;

import java.util.Arrays;

public class Page195 {
    public static void main(String[] args) {
//        Searching rules
//        Array must be sorted
//        Target element found in sorted array        ---- Index of match
//        Target element not found in sorted array    ---- Negative value showing one smaller
//                                                         than the negative of the index,
//                                                         where a match needs to be inserted to
//                                                         preserve sorted order
//        Unsorted array                              ---- A surprise; this result is undefined


//        Let’s try these rules with an example:
        int[] numbers = {2, 4, 6, 8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

//        Take note of the fact that line 8 is a sorted array.
//        If it wasn’t, we couldn’t apply either of the other rules.
//        Line 9 searches for the index of 2.
//        The answer is index 0. Line 10 searches for the index of 4, which is 1.
//        Line 11 searches for the index of 1.
//        Although 1 isn’t in the list, the search can determine that it should be
//        inserted at element 0 to preserve the sorted order. Since 0 already
//        means something for array indexes, Java needs to subtract 1 to give us the answer of –1.
//        Line 12 is similar. Although 3 isn’t in the list, it would need to be inserted
//        at element 1 to preserve the sorted order. We negate and subtract 1 for consistency,
//        getting –1 –1, also known as –2. Finally, line 13 wants to tell us that 9 should be
//        inserted at index 4.
//        We again negate and subtract 1, getting –4 –1, also known as –5.

//        What do you think happens in this example?
        numbers = new int[]{3, 2, 1};
        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 3));

//        Note that on line 40, the array isn’t sorted.This means the output will not be defined.When testing this
//        example, line 41 correctly gave 1 as the output.However, line 42 gave the wrong answer.The exam creators will
//        not expect you to know what incorrect values come out.As soon as you see the array isn’t sorted, look for
//        an answer choice about unpredictable output.
//        On the exam, you need to know what a binary search returns in various scenarios.Oddly, you don’t need to know
//        why “binary”is in the name.In
//        case you are
//        curious, a binary search splits the array into two equal pieces(remember, 2is binary) and determines which half
//        the target is in.It repeats this process until only one element is left.
    }
}
