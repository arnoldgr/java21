package chap9.b2UsingTheListInterface.page495;

import java.util.ArrayList;
import java.util.List;

public class Page495 {
    public static void main(String[] args) {
//        Searching a List
//        From Table 9.2, the List interface includes two methods for searching for elements, indexOf() and lastIndexOf(). They work similarly to the methods of the same name in the String class:
        var list = List.of("peacock", "chicken", "peacock", "turkey");

        System.out.println(list.indexOf("peacock"));      // 0
        System.out.println(list.lastIndexOf("peacock"));  // 2
        System.out.println(list.indexOf("penguin"));      // -1

//        Later in this chapter, we’ll show you how to perform a more efficient search by first sorting the list and then using the Collections.binarySearch() method.


//                Converting from List to an Array
//        Since an array can be passed as a vararg, Table 9.1 covered how to convert an array to a List. You should also know how to do the reverse. Let’s start with turning a List into an array.
        List<String> list2 = new ArrayList<>();
        list2.add("hawk");
        list2.add("robin");
        Object[] objectArray = list2.toArray();
        String[] stringArray = list2.toArray(new String[0]);
        list2.clear();
        System.out.println(objectArray.length);     // 2
        System.out.println(stringArray.length);     // 2

//        Line 16 shows that a List knows how to convert itself to an array. The only problem is that it defaults to an array of class Object. This isn’t usually what you want. Line 17 specifies the type of the array and does what we want. The advantage of specifying a size of 0 for the parameter is that Java will create a new array of the proper size for the return value. If you like, you can suggest a larger array to be used instead. If the List fits in that array, it will be returned. Otherwise, a new array will be created.
//                Also, notice that line 18 clears the original List. This does not affect either array. The array is a newly created object with no relationship to the original List. It is simply a copy.

    }
}
