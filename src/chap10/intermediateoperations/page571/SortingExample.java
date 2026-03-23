package chap10.intermediateoperations;

import java.util.Comparator;
import java.util.stream.Stream;

// Page 571
// SortingExample.java
// Demonstrates sorted()

public class SortingExample {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("brown-", "bear-");

        s1.sorted()
                .forEach(System.out::print); // bear-brown-

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");

        s2.sorted(Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-
    }
}

/*
- sorted() uses natural order
- sorted(comparator) uses custom order
*/