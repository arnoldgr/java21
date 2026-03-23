package chap10.primitivestreams;

import java.util.stream.DoubleStream;

// Page 580
// CreatingPrimitiveStreams.java
// Demonstrates creating primitive streams

public class CreatingPrimitiveStreams {

    public static void main(String[] args) {

        DoubleStream empty = DoubleStream.empty();

        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);
    }
}

/*
Primitive stream types:
- IntStream
- LongStream
- DoubleStream
*/