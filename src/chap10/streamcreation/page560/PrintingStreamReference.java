package chap10.streamcreation;

import java.util.stream.Stream;

// Page 560
// PrintingStreamReference.java
// Demonstrates that printing a stream object does not print its contents.

public class PrintingStreamReference {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("a", "b", "c");

        System.out.println(stream);
        // Example output:
        // java.util.stream.ReferencePipeline$Head@...
    }
}

/*
From the source:
- Printing a Stream reference prints the object reference,
  not the contents like a Collection would.
- This is mentioned as practice behavior, not an exam focus.
*/