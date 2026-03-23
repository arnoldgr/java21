package chap10.intermediateoperations;

import java.util.List;
import java.util.stream.Stream;

// Page 570
// FlatMapExample.java
// Demonstrates flatMap()

public class FlatMapExample {

    public static void main(String[] args) {

        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");

        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);
    }
}

/*
- flatMap() flattens nested structures
- removes empty collections
*/