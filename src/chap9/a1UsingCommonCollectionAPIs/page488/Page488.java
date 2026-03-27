package chap9.a1UsingCommonCollectionAPIs.page488;

import java.util.*;

public class Page488 {
    public static void main(String[] args) {
//        Other Iteration Approaches

//        There are other ways to iterate through a Collection.
//        For example, in Chapter 3, “Making Decisions,” you saw how to loop through a
//        list using an enhanced for loop.
        Collection<String> coll = new ArrayList<>();
        coll.add("Magician");
        coll.add("Assistant");
        for (String element : coll)
            System.out.println(element);

//        You may see another older approach used.

        Iterator<String> iter = coll.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

//        Pay attention to the difference between these techniques.
//        The hasNext() method checks whether there is a next value.
//        In other words, it tells you whether next() will execute without throwing an exception.
//        The next() method actually moves the Iterator to the next element.

//        Determining Equality
//        There is a custom implementation of equals() so you can compare two Collections
//        to compare the type and contents. The implementation will vary.
//        For example, ArrayList checks order, while HashSet does not.
//        boolean equals (Object object)

//        The following shows an example:
        var list1 = List.of(1, 2);
        var list2 = List.of(2, 1);
        var set1 = Set.of(1, 2);
        var set2 = Set.of(2, 1);

        System.out.println(list1.equals(list2));  // false
        System.out.println(set1.equals(set2));    // true
        System.out.println(list1.equals(set1));   // false

//        Line 43 prints false because the elements are in a different order, and a List cares about order.
//        By contrast, line 44 prints true because a Set is not sensitive to order.
//        Finally, line 45 prints false because the types are different.

//                Unboxing nulls

//        Java protects us from many problems with Collections.
//        However, it is still possible to write a NullPointerException.

        var heights = new ArrayList<Integer>();
        heights.add(null);
        int h = heights.get(0);  // NullPointerException

//        On line 57, we add a null to the list.
//        This is legal because a null reference can be assigned to any reference variable.
//        On line 5, we try to unbox that null to an int primitive.
//        This is a problem. Java tries to get the int value of null. Since calling any method on null gives a NullPointerException, that is just what we get. Be careful when you see null in relation to autoboxing.
    }
}
