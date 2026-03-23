package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 572
// PeekExample.java
// Demonstrates peek()

public class PeekExample {

    public static void main(String[] args) {

        var stream = Stream.of("black bear", "brown bear", "grizzly");

        long count = stream
                .filter(s -> s.startsWith("g"))
                .peek(System.out::println)
                .count(); // grizzly

        System.out.println(count); // 1
    }
}

/*
- peek() is used for debugging
- behaves like intermediate forEach()
- does not modify the stream
*/