package chap9.b2UsingTheListInterface.page492b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Page492b {
    public static void main(String[] args) {
//        Working with List Methods
//        The methods in the List interface are for working with indexes.
//        In addition to the inherited Collection methods, you should also know the methods in Table 9.2
//        or the exam.

//        The following statements demonstrate most of these methods for working with a List:
        List<String> list = new ArrayList<>();
        list.add("SD");                  // [SD]
        list.add(0, "NY");               // [NY,SD]
        list.set(1, "FL");               // [NY,FL]
        System.out.println(list.get(0)); // NY
        list.remove("NY");               // [FL]
        list.remove(0);                  // []
        list.set(0, "?");                // IndexOutOfBoundsException


//        On line 15, list starts out empty.
//        Line 16 adds an element to the end of the list.
//        Line 17 adds an element at index 0 that bumps the original index 0 to index 1.
//        Notice how the ArrayList is now automatically one larger.
//        Line 18 replaces the element at index 1 with a new value.
//        Line 19 uses the get() method to print the element at a specific index.
//        Line 20 removes the element matching NY. Finally,
//        line 21 removes the element at index 0,
//        and list is empty again.
//        The output would be the same if you tried these examples with LinkedList.
//        Although the code would be less efficient, it wouldn’t be noticeable until you had very large lists.

//        Now let’s take a look at the replaceAll() method.
//        It uses a UnaryOperator that takes one parameter and returns a value of the same type.
        var numbers = Arrays.asList(1, 2, 3);
        numbers.replaceAll(x -> x * 2);
        System.out.println(numbers);   // [2, 4, 6]

//        This lambda doubles the value of each element in the list.
//        The replaceAll () method calls the lambda on each
//        element of the list and replaces the value at that index.

    }
}
