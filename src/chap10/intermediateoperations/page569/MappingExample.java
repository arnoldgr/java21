package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 569
// MappingExample.java
// Demonstrates map()

public class MappingExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

        s.map(String::length)
                .forEach(System.out::print); // 676
    }
}

/*
- map() transforms each element
- String::length == x -> x.length()
*/