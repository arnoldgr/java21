package chap4.UnderstandingArrays;

import java.util.Arrays;

public class Page198 {
    public static void main(String[] args) {
        //Using Mismatch
//        If the arrays are equal, mismatch() returns -1.
//        Otherwise, it returns the first index where they differ.

//        Can you figure out what these print?
        System.out.println(Arrays.mismatch(new int[]{1}, new int[]{1}));
        System.out.println(Arrays.mismatch(new String[]{"a"},
                new String[]{"A"}));
        System.out.println(Arrays.mismatch(new int[]{1, 2}, new int[]{1}));

//        In the first example, the arrays are the same, so the result is - 1.
//        In the second example, the entries at
//        element 0 are not equal, so the result is 0.
//        In the third example, the entries at element 0 are equal, so
//        we keep looking.
//        The element at index 1 is not equal.Or, more specifically, one array has an element at index
//        1, and the other does not.Therefore, the result is 1.

        //Equality vs. comparison vs. mismatch
//        Equality vs. comparison vs. mismatch:

//        Arrays.equals()
//        When they contain the same data  -> true
//        When they contain different data  -> false

//        Arrays.compare()
//        When they contain the same data  -> 0
//        When they contain different data  -> positive or negative

//        Arrays.mismatch()
//        When they contain the same data  -> -1
//        When they contain different data  -> zreo or positive index


    }
}
