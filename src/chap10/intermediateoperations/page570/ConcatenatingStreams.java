package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 570
// ConcatenatingStreams.java
// Demonstrates Stream.concat()

public class ConcatenatingStreams {

    public static void main(String[] args) {

        var one = Stream.of("Bonobo");
        var two = Stream.of("Mama Gorilla", "Baby Gorilla");

        Stream.concat(one, two)
                .forEach(System.out::println);
    }
}

/*
- Stream.concat() combines two streams
*/