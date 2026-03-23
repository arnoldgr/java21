package chap10.terminaloperations;

import java.util.function.Predicate;
import java.util.stream.Stream;

// Page 564
// AllMatchInfiniteExample.java
// Demonstrates that allMatch() on some infinite streams never terminates.

public class AllMatchInfiniteExample {

    public static void main(String[] args) {

        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        // This never terminates because allMatch() has to check every element.
        // System.out.println(infinite.allMatch(pred)); // Never terminates
    }
}

/*
From the source:
- allMatch() may never terminate on an infinite stream.
*/