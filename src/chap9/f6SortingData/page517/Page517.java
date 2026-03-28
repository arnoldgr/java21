package chap9.f6SortingData.page517;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Page517 {
    static void main() {

//Reviewing binarySearch()

//The binarySearch() method requires a sorted List.

        List<Integer> list = Arrays.asList(6, 9, 1, 8);
        Collections.sort(list); // [1, 6, 8, 9]
        System.out.println(Collections.binarySearch(list, 6)); // 1
        System.out.println(Collections.binarySearch(list, 3)); // -2


//Line 12 sorts the List so we can call binary search properly.
// Line 13 prints the index at which a match is found.
// Line 14 prints one less than the negated index of where the requested value would need to be inserted.
// The number 3 would need to be inserted at index 1 (after the number 1 but before the number 6).
// Negating that gives us −1, and subtracting 1 gives us −2.


//There is a trick in working with binarySearch(). What do you think the following outputs?
        var names = Arrays.asList("Fluffy", "Hoppy");
        Comparator<String> c = Comparator.reverseOrder();
        var index = Collections.binarySearch(names, "Hoppy", c);
        System.out.println(index);

// The answer happens to be -1. Before you panic, you don’t need to know that the answer is -1.
// You do need to know that the answer is not defined. Line 3 creates a list, [Fluffy, Hoppy].
// This list happens to be sorted in ascending order. Line 4 creates a Comparator that reverses the natural order.
// Line 5 requests a binary search in descending order.
// Since the list is not in that order, we don’t meet the precondition for doing a search.
// While the result of calling binarySearch() on an improperly sorted list is undefined,
// sometimes you can get lucky. For example, search starts in the middle of an odd-numbered list.
// If you happen to ask for the middle element, the index returned will be what you expect.
// Earlier in the chapter, we talked about collections that require classes to implement Comparable.
// Unlike sorting, they don’t check that you have implemented Comparable at compile time.

    }
}
