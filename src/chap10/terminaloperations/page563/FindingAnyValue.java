package chap10.terminaloperations;

import java.util.stream.Stream;

// Page 563
// FindingAnyValue.java
// Demonstrates findAny() on finite and infinite streams.

public class FindingAnyValue {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);        // monkey (usually)
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}

/*
From the source:
- findAny() returns an Optional.
- It can terminate on an infinite stream because only one element is needed.
*/