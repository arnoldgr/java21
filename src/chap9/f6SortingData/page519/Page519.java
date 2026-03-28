package chap9.f6SortingData.page519;

import java.util.ArrayList;
import java.util.List;

public class Page519 {
    static void main() {


//    Sorting a List
//    While you can call Collections.sort(list), you can also sort directly on the list object.
        List<String> bunnies = new ArrayList<>();
        bunnies.add("long ear");
        bunnies.add("floppy");
        bunnies.add("hoppy");
        System.out.println(bunnies);     // [long ear, floppy, hoppy]
        bunnies.sort((b1, b2) -> b1.compareTo(b2));
        System.out.println(bunnies);     // [floppy, hoppy, long ear]

//    On line 16, we sort the list alphabetically.
//    The sort() method takes a Comparator that provides the sort order.
//    Remember that Comparator takes two parameters and returns an int.
//    If you need a review of what the return value of a compare() operation means,
//    check the Comparator section in this chapter or the “Comparing” section in Chapter 4.
//    This is really important to memorize!

    }
}
