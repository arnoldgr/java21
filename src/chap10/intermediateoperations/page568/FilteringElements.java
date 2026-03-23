package chap10.intermediateoperations;

import java.util.stream.Stream;

// Page 568
// FilteringElements.java
// Demonstrates filter()

public class FilteringElements {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

        s.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); // monkey
    }
}

/*
- filter() takes a Predicate
- returns only elements that match the condition
*/