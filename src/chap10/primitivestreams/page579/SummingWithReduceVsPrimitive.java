package chap10.primitivestreams;

import java.util.stream.Stream;

// Page 579
// SummingWithReduceVsPrimitive.java
// Demonstrates difference between reduce() and primitive streams

public class SummingWithReduceVsPrimitive {

    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);

        System.out.println(stream.reduce(0, (s, n) -> s + n)); // 6

        Stream<Integer> stream2 = Stream.of(1, 2, 3);

        System.out.println(stream2.mapToInt(x -> x).sum()); // 6
    }
}

/*
- reduce() works but is manual
- primitive streams provide built-in operations like sum()
*/