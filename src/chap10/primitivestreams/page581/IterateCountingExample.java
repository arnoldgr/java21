package chap10.primitivestreams;

import java.util.stream.IntStream;

// Page 581
// IterateCountingExample.java
// Demonstrates counting using iterate()

public class IterateCountingExample {

    public static void main(String[] args) {

        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);

        count.forEach(System.out::print); // 12345
    }
}

/*
- iterate() can be used to generate sequences
*/