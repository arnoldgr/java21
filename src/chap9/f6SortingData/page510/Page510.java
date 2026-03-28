package chap9.f6SortingData.page510;

//Designing a compareTo() method
//In the previous example, we relied on the built-in String compareTo() method, but often you need to create your own. When writing a compareTo() method, the most important part is the return value. The following rules should apply to the return type of your compareTo() method:

//The number 0 is returned when the current object is equivalent to the argument to compareTo().
//A negative number (less than 0) is returned when the current object is smaller than the argument to compareTo().
//A positive number (greater than 0) is returned when the current object is larger than the argument to compareTo().

//Let’s look at an implementation of compareTo() that compares numbers instead of String objects:

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

record ZooDuck(int id, String name) implements Comparable<ZooDuck> {
    public int compareTo(ZooDuck d) {
        return id - d.id;  // Sorts ascendingly by id
    }
}


public class Page510 {
    public static void main(String[] args) {
        //Line 4 shows one way to compare two int values. We could have used Integer.compare(id, d.id), but we wanted to show you how to create your own. Be sure you can recognize both approaches. Remember that id - d.id sorts in ascending order, and d.id - id sorts in descending order.
//        Let’s try this new method out in some code:
        var d1 = new ZooDuck(5, "Daffy");
        var d2 = new ZooDuck(7, "Donald");
        System.out.println(d1.compareTo(d2));   // -2
        System.out.println(d1.compareTo(d1));   // 0
        System.out.println(d2.compareTo(d1));   // 2

//Line 25 compares a smaller id to a larger one, and therefore it prints a negative number.
// Line 26 compares animals with the same id, and therefore it prints 0.
// Line 27 compares a larger id to a smaller one, and therefore it returns a positive number.
        var zd = new ArrayList<ZooDuck>();
        zd.add(new ZooDuck(5, "Lazy"));
        zd.add(new ZooDuck(10, "Grumpy"));
        zd.add(new ZooDuck(1, "Smiley"));
        System.out.println(zd);
        Collections.sort(zd);
        System.out.println(zd);

        //Casting the compareTo() Argument see LegacyDuck below
//        List ld = new ArrayList();
//        ld.add(new LegacyDuck( "Droopy"));
//        ld.add(new ZooDuck(8, "Clever"));
//        Collections.sort(ld);   //exception error different types

        List ld2 = new ArrayList();
        ld2.add(new LegacyDuck( "Droopy"));
        ld2.add(new LegacyDuck( "Clever"));
        Collections.sort(ld2);
        System.out.println(ld2);


    }
}

//Casting the compareTo() Argument
//When dealing with legacy code or code that does not use generics, the compareTo() method requires a cast since it is passed an Object. We can accomplish this using pattern-matching that you saw in Chapter 3.
record LegacyDuck(String name) implements Comparable {
    public int compareTo(Object obj) {
        if (obj instanceof LegacyDuck d)
            return name.compareTo(d.name);
        throw new UnsupportedOperationException("Not a duck");
    }
}

//Since we don’t specify a generic type for Comparable, Java assumes that we want an Object.
