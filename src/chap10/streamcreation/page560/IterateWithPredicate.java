package chap10.streamcreation;

import java.util.stream.Stream;

// Page 560
// IterateWithPredicate.java
// Demonstrates the overloaded iterate() method with a stopping condition.

public class IterateWithPredicate {

    public static void main(String[] args) {

        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1,          // seed
                n -> n < 100, // Predicate to specify when done
                n -> n + 2    // UnaryOperator to get next value
        );

        oddNumberUnder100.limit(10).forEach(System.out::println);
    }
}

/*
From the source:
- The overloaded iterate() method takes:
  1) seed
  2) predicate
  3) unary operator
- Commas are used between parameters, not semicolons.
*/