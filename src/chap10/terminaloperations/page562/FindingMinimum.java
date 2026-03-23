package chap10.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

// Page 562
// FindingMinimum.java
// Demonstrates the min() terminal operation.

public class FindingMinimum {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s.min((s1, s2) -> s1.length() - s2.length());

        min.ifPresent(System.out::println); // ape
    }
}

/*
From the source:
- min() takes a Comparator.
- It returns Optional<T> because the stream might be empty.
*/