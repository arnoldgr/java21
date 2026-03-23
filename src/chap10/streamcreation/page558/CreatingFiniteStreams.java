package chap10.streamcreation;

import java.util.List;
import java.util.stream.Stream;

// Page 558
// CreatingFiniteStreams.java
// Demonstrates creating finite streams.

public class CreatingFiniteStreams {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);

        System.out.println(empty.count());         // 0
        System.out.println(singleElement.count()); // 1
        System.out.println(fromArray.count());     // 3

        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        System.out.println(fromList.count());      // 3
    }
}

/*
From the source:
- Stream.empty() creates a finite stream with zero elements.
- Stream.of(...) creates a finite stream from listed elements.
- Collection.stream() creates a stream from a collection.
*/