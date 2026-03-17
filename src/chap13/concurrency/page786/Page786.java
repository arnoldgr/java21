package chap13.concurrency.page786;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Chapter 13 - Working with Parallel Streams
// Page-style file.
// This file shows:
// - creating parallel streams
// - stateful vs stateless stream operations
// - collect() with a concurrent collection

public class Page786 {

    public List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());

        source.filter(s -> s % 2 == 0)
                .forEach(i -> data.add(i)); // STATEFUL: DON'T DO THIS!

        return data;
    }

    public List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        CollectionHelper helper = new CollectionHelper();

        // Create parallel streams
        var collection = List.of(1, 2);
        var p1 = collection.stream().parallel();
        var p2 = collection.parallelStream();

        System.out.println("p1 is parallel: " + p1.isParallel());
        System.out.println("p2 is parallel: " + p2.isParallel());

        // Stateful example
        var badList = helper.addValues(IntStream.range(1, 11).parallel());
        System.out.println("Stateful result: " + badList);

        // Stateless example
        var goodList = helper.addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.println("Stateless result: " + goodList);

        // collect() with concurrent collection
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(
                ConcurrentSkipListSet::new,
                SortedSet::add,
                SortedSet::addAll
        );

        System.out.println(set); // [f, l, o, w]
    }

    // Helper inner class so the main method stays simple.
    static class CollectionHelper {
        public List<Integer> addValues(IntStream source) {
            var data = Collections.synchronizedList(new ArrayList<Integer>());

            source.filter(s -> s % 2 == 0)
                    .forEach(i -> data.add(i)); // STATEFUL: DON'T DO THIS!

            return data;
        }

        public List<Integer> addValuesBetter(IntStream source) {
            return source.filter(s -> s % 2 == 0)
                    .boxed()
                    .collect(Collectors.toList());
        }
    }
}

/*
command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page786/Page786.java

// Run:
java -cp out chap13.concurrency.page786.Page786
*/