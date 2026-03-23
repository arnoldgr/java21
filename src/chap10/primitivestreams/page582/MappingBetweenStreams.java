package chap10.primitivestreams;

import java.util.stream.Stream;

// Page 582
// MappingBetweenStreams.java
// Demonstrates mapping between stream types

public class MappingBetweenStreams {

    public static void main(String[] args) {

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");

        s.mapToInt(String::length)
                .forEach(System.out::print); // 676
    }
}

/*
Mapping methods:
- mapToInt()
- mapToDouble()
- mapToLong()
- mapToObj()
*/