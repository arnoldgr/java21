package chap10.streamcreation;

import java.util.List;
import java.util.stream.Stream;

// Page 560
// ReviewingStreamCreationMethods.java
// Demonstrates the common ways of creating a stream source in one file.

public class ReviewingStreamCreationMethods {

    public static void main(String[] args) {

        // Stream.empty()
        Stream<String> empty = Stream.empty();
        System.out.println(empty.count()); // 0

        // Stream.of(varargs)
        Stream<String> ofValues = Stream.of("x", "y", "z");
        System.out.println(ofValues.count()); // 3

        // Collection.stream()
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        System.out.println(fromList.count()); // 3

        // Collection.parallelStream()
        Stream<String> parallel = list.parallelStream();
        System.out.println(parallel.count()); // 3

        // Stream.generate()
        Stream<Double> randoms = Stream.generate(Math::random);
        randoms.limit(2).forEach(System.out::println);

        // Stream.iterate(seed, unaryOperator)
        Stream<Integer> odds = Stream.iterate(1, n -> n + 2);
        odds.limit(5).forEach(System.out::println);

        // Stream.iterate(seed, predicate, unaryOperator)
        Stream<Integer> underTen = Stream.iterate(1, n -> n < 10, n -> n + 2);
        underTen.forEach(System.out::println);
    }
}

/*
This file is a study-style consolidation of the source table:

- Stream.empty()
- Stream.of(varargs)
- coll.stream()
- coll.parallelStream()
- Stream.generate(supplier)
- Stream.iterate(seed, unaryOperator)
- Stream.iterate(seed, predicate, unaryOperator)
*/