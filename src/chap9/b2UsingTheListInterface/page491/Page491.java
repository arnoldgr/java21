package chap9.b2UsingTheListInterface.page491;

import java.util.Arrays;
import java.util.List;

public class Page491 {
    public static void main(String[] args) {
//        Creating a List with a Factory
//        When you create a List of type ArrayList or LinkedList, you know the type.
//        There are a few special methods where you get a List back but don’t know the type.
//        These methods let you create a List including data in one line using a factory method.
//        This is convenient, especially when testing.
//        Some of these methods return an immutable object.
//        As we saw in Chapter 6, “Class Design,” an immutable object cannot be changed or modified.
//        Table 9.1 summarizes these three methods to create a list.


//        SEE BOOK TABLE 9.1 Factory methods to create a List

//        Let’s take a look at an example of these three methods:

        String[] array = new String[]{"a", "b", "c"};
        List<String> asList = Arrays.asList(array); // [a, b, c]
        List<String> of = List.of(array);           // [a, b, c]
        List<String> copy = List.copyOf(asList);    // [a, b, c]

        array[0] = "z";

        System.out.println(asList);                 // [z, b, c]
        System.out.println(of);                     // [a, b, c]
        System.out.println(copy);                   // [a, b, c]

        asList.set(0, "x");
        System.out.println(Arrays.toString(array)); // [x, b, c]

//        Line 23 creates a List that is backed by an array.
//        Line 27 changes the array, and line 29 reflects that change.
//        Lines 33 and 34 show the other direction where changing the List
//        updates the underlying array. Lines 29 and 30 each create an immutable List.

//        When run independently, the following shows both types are immutable by throwing
//        an exception when trying to set a value.
        of.set(0, "y");    // UnsupportedOperationException
        copy.set(0, "y");  // UnsupportedOperationException

//        Similarly, each of the following lines throws an exception when adding or removing a value:
        asList.add("z");   // UnsupportedOperationException
        of.remove(0);      // UnsupportedOperationException
        copy.remove(0);    // UnsupportedOperationException

    }
}
