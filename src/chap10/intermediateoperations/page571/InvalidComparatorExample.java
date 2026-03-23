package chap10.intermediateoperations;

import java.util.Comparator;
import java.util.stream.Stream;

// Page 571
// InvalidComparatorExample.java
// Demonstrates a method reference that DOES NOT COMPILE

public class InvalidComparatorExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("brown bear-", "grizzly-");

        // DOES NOT COMPILE
        // s.sorted(Comparator::reverseOrder);

        // Correct:
        s.sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}

/*
- Comparator::reverseOrder is NOT valid here
- It becomes Supplier<Comparator>, not Comparator
*/