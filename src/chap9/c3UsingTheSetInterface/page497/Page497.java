package chap9.c3UsingTheSetInterface.page497;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Page497 {
    public static void main(String[] args) {
//    Working with Set Methods
//    Like a List, you can create an immutable Set in one line or make a copy of an existing one.
        Set<Character> letters = Set.of('c', 'a', 't');
        Set<Character> copy = Set.copyOf(letters);

//    Those are the only extra methods you need to know for the Set interface for the exam!
//    You do have to know how sets behave with respect to the traditional Collection methods.
//    You also have to know the differences between the types of sets. Let’s start with HashSet.
        Set<Integer> set = new HashSet<>();
        boolean b1 = set.add(66);  // true
        boolean b2 = set.add(10);  // true
        boolean b3 = set.add(66);  // false
        boolean b4 = set.add(8);   // true
        for (Integer value : set)
            System.out.print(value + ","); // 66,8,10,


//    The add() methods should be straightforward.
//    They return true unless the Integer is already in the set.
//    Line 21 returns false, because we already have 66 in the set, and a set must preserve uniqueness.
//    Line 24 prints the elements of the set in an arbitrary order. In this case, it happens not to be sorted order or the order in which we added the elements.
//    Remember that the equals() method is used to determine equality.
//    The hashCode() method is used to know which bucket to look in so that
//    Java doesn’t have to look through the whole set to find out whether an object is there.
//    The best case is that hash codes are unique and Java has to call equals() on only one object.
//    The worst case is that all implementations return the same hashCode() and Java has to
//    call equals() on every element of the set anyway.
//    Let’s replace line 16 with a LinkedHashSet and see how the output changes.

        Set<Integer> set2 = new LinkedHashSet<>();
        boolean c1 = set2.add(66);  // true
        boolean c2 = set2.add(10);  // true
        boolean c3 = set2.add(66);  // false
        boolean c4 = set2.add(8);   // true
        for (Integer value : set2)
            System.out.print(value + ","); // 66,10,8

//        This time, the code prints the elements in the order they were inserted.
//        66, 10, 8,

//                Finally, we can use a TreeSet on line 16.

        Set<Integer> set3 = new TreeSet<>();
        boolean d1 = set3.add(66);  // true
        boolean d2 = set3.add(10);  // true
        boolean d3 = set3.add(66);  // false
        boolean d4 = set3.add(8);   // true
        for (Integer value : set3)
            System.out.println(value + ",");

//        The elements are now printed out in their natural sorted order.
//        8, 10, 66,

//    Number wrapper types implement the Comparable interface in Java, which is used for sorting. Later in the chapter, you learn how to create your own Comparable objects.


    }
}
