package chap10.terminaloperations;

import java.util.stream.Stream;

// Page 566
// CollectingWithStringBuilder.java
// Demonstrates collect() with supplier, accumulator, and combiner.

public class CollectingWithStringBuilder {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("w", "o", "l", "f");

        StringBuilder word = stream.collect(
                StringBuilder::new,
                StringBuilder::append,
                StringBuilder::append
        );

        System.out.println(word); // wolf
    }
}

/*
From the source:
- collect() can be written with:
  1) supplier
  2) accumulator
  3) combiner
*/