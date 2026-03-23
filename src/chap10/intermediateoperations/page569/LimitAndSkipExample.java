package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 569
// LimitAndSkipExample.java
// Demonstrates limit() and skip()

public class LimitAndSkipExample {

    public static void main(String[] args) {

        Stream<Integer> s = Stream.iterate(1, n -> n + 1);

        s.skip(5)
                .limit(2)
                .forEach(System.out::print); // 67
    }
}

/*
- skip(n) skips first n elements
- limit(n) limits to n elements
- often used with infinite streams
*/