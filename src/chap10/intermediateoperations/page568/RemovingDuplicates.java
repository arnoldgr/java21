package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 568
// RemovingDuplicates.java
// Demonstrates distinct()

public class RemovingDuplicates {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");

        s.distinct()
                .forEach(System.out::print); // duckgoose
    }
}

/*
- distinct() removes duplicates
- uses equals() internally
*/