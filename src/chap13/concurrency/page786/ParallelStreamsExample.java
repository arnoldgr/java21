package chap13.concurrency.page786;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Combined source-style examples from the parallel streams section.

public class ParallelStreamsExample {

    public List<Integer> addValues(IntStream source) {
        var data = Collections.synchronizedList(new ArrayList<Integer>());

        source.filter(s -> s % 2 == 0)
                .forEach(i -> {
                    data.add(i);
                }); // STATEFUL: DON'T DO THIS!

        return data;
    }

    public List<Integer> addValuesBetter(IntStream source) {
        return source.filter(s -> s % 2 == 0)
                .boxed()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        var example = new ParallelStreamsExample();

        // Creating parallel streams
        Collection<Integer> collection = List.of(1, 2);
        Stream<Integer> p1 = collection.stream().parallel();
        Stream<Integer> p2 = collection.parallelStream();

        System.out.println("p1 parallel? " + p1.isParallel());
        System.out.println("p2 parallel? " + p2.isParallel());

        // Stateful vs stateless
        var list1 = example.addValues(IntStream.range(1, 11));
        System.out.println(list1); // [2, 4, 6, 8, 10]

        var list2 = example.addValues(IntStream.range(1, 11).parallel());
        System.out.println(list2); // Order may differ

        var list3 = example.addValuesBetter(IntStream.range(1, 11).parallel());
        System.out.println(list3); // Ordered result

        // Parallel reduction with collect()
        Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();
        SortedSet<String> set = stream.collect(
                ConcurrentSkipListSet::new,
                SortedSet::add,
                SortedSet::addAll
        );
        System.out.println(set); // [f, l, o, w]

        // groupingByConcurrent example
        var ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map =
                ohMy.collect(Collectors.groupingByConcurrent(String::length));

        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/chap13.concurrency/page786/ParallelStreamsExample.java

// Run:
java -cp out chap13.chap13.concurrency.page786.ParallelStreamsExample
*/