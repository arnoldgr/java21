package chap10.primitivestreams;

import java.util.stream.DoubleStream;

// Page 580
// InfinitePrimitiveStreams.java
// Demonstrates generate() and iterate()

public class InfinitePrimitiveStreams {

    public static void main(String[] args) {

        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);

        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);
    }
}

/*
- generate() creates infinite stream
- iterate() creates sequence
- limit() required to avoid infinite output
*/