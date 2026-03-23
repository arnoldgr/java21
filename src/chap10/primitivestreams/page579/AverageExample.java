package chap10.primitivestreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

// Page 579
// AverageExample.java
// Demonstrates average() on primitive streams

public class AverageExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3);

        OptionalDouble avg = intStream.average();

        System.out.println(avg.getAsDouble()); // 2.0
    }
}

/*
- average() returns OptionalDouble
- use getAsDouble() to retrieve value
*/