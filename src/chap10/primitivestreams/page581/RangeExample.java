package chap10.primitivestreams;

import java.util.stream.IntStream;

// Page 581
// RangeExample.java
// Demonstrates range() and rangeClosed()

public class RangeExample {

    public static void main(String[] args) {

        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::print); // 12345

        System.out.println();

        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
    }
}

/*
- range(start, end) → end exclusive
- rangeClosed(start, end) → end inclusive
*/