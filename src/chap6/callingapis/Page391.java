package chap6.callingapis;

import java.util.*;
import java.util.function.*;

// Calling APIs with Lambdas

public class Page391 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C");

        // forEach → Consumer
        list.forEach(s -> System.out.println(s));

        // removeIf → Predicate
        list.removeIf(s -> s.startsWith("P"));

        System.out.println(list);

        // sort → Comparator
        list.sort((a, b) -> a.length() - b.length());

        System.out.println(list);
    }
}

/*
API + Functional Interface mapping:

forEach()  → Consumer
removeIf() → Predicate
sort()     → Comparator

-------------------------------------

Example:
list.removeIf(s -> s.startsWith("P"));

Means:
remove elements where condition is TRUE
*/