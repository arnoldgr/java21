package chap10.streamcreation;

import java.util.List;
import java.util.stream.Stream;

// Page 559
// CreatingParallelStream.java
// Demonstrates creating a parallel stream from a collection.

public class CreatingParallelStream {

    public static void main(String[] args) {

        var list = List.of("a", "b", "c");
        Stream<String> fromListParallel = list.parallelStream();

        System.out.println(fromListParallel.count()); // 3
    }
}

/*
From the source:
- parallelStream() creates a stream from a collection
  where the work can run in parallel.
*/