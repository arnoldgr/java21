package chap10.primitivestreams;

import java.util.stream.IntStream;

// Page 582
// BoxingExample.java
// Demonstrates boxed()

public class BoxingExample {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(1, 2, 3);

        intStream.boxed()
                .forEach(System.out::print); // 123
    }
}

/*
- boxed() converts primitive stream to Stream<T>
*/