package chap10.terminaloperations;

import java.util.stream.Stream;

// Page 561
// CountingElements.java
// Demonstrates the count() terminal operation.

public class CountingElements {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s.count()); // 3
    }
}

/*
From the source:
- count() returns the number of elements in a finite stream.
- On an infinite stream, it does not terminate.
*/