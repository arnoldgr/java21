package chap10.streamcreation;

import java.util.stream.Stream;

// Page 559
// CreatingInfiniteStreams.java
// Demonstrates creating infinite streams with generate() and iterate().

public class CreatingInfiniteStreams {

    public static void main(String[] args) {

        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        randoms.limit(3).forEach(System.out::println);
        oddNumbers.limit(5).forEach(System.out::println);
    }
}

/*
From the source:
- Stream.generate(supplier) creates an infinite stream.
- Stream.iterate(seed, unaryOperator) creates an infinite stream.
- limit() is commonly used to make infinite streams safe to print.
*/