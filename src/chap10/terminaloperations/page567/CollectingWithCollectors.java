package chap10.terminaloperations;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Page 567
// CollectingWithCollectors.java
// Demonstrates predefined collectors.

public class CollectingWithCollectors {

    public static void main(String[] args) {

        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 =
                stream1.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set1); // [f, l, o, w]

        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        Set<String> set2 = stream2.collect(Collectors.toSet());
        System.out.println(set2);
    }
}

/*
From the source:
- Collectors provides common predefined collectors.
- toCollection(TreeSet::new) creates a TreeSet.
- toSet() returns some Set implementation, but the exact type is not guaranteed.
*/