package chap10.terminaloperations;

import java.util.stream.Stream;

// Page 564
// ForEachExample.java
// Demonstrates the forEach() terminal operation.

public class ForEachExample {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print); // MonkeyGorillaBonobo
    }
}

/*
From the source:
- forEach() takes a Consumer.
- It is the only terminal operation here with a void return type.
*/