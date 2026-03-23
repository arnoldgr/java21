package chap10.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

// Page 562
// EmptyStreamMinimum.java
// Demonstrates min() on an empty stream.

public class EmptyStreamMinimum {

    public static void main(String[] args) {

        Optional<?> minEmpty = Stream.empty().min((s1, s2) -> 0);
        System.out.println(minEmpty.isPresent()); // false
    }
}

/*
From the source:
- If the stream is empty, min() returns an empty Optional.
- The comparator is never called in this case.
*/