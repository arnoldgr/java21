package chap10.terminaloperations;

import java.util.Optional;
import java.util.stream.Stream;

// Page 565
// ReducingAStream.java
// Demonstrates common reduce() examples.

public class ReducingAStream {

    public static void main(String[] args) {

        Stream<String> s1 = Stream.of("w", "o", "l", "f");
        String word = s1.reduce("", (c, s) -> c + s);
        System.out.println(word); // wolf

        Stream<Integer> s2 = Stream.of(3, 5, 6);
        System.out.println(s2.reduce(1, (a, b) -> a * b)); // 90

        Stream<Integer> s3 = Stream.empty();
        Optional<Integer> result = s3.reduce((a, b) -> a + b);
        System.out.println(result.isPresent()); // false
    }
}

/*
From the source:
- reduce() combines stream elements into one result.
- Some overloads return a value directly.
- Another overload returns Optional<T>.
*/