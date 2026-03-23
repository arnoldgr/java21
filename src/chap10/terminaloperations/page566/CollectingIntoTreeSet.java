package chap10.terminaloperations;

import java.util.TreeSet;
import java.util.stream.Stream;

// Page 566
// CollectingIntoTreeSet.java
// Demonstrates collect() into a TreeSet.

public class CollectingIntoTreeSet {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");

        TreeSet<String> set = stream.collect(
                TreeSet::new,
                TreeSet::add,
                TreeSet::addAll
        );

        System.out.println(set); // [f, l, o, w]
    }
}

/*
From the source:
- The accumulator adds one element.
- The combiner merges partial results.
*/