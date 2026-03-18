package UsingStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Page558 {

    public static void main(String[] args) {

        // Creating finite streams
        Stream<String> empty = Stream.empty();                // count = 0
        Stream<Integer> singleElement = Stream.of(1);         // count = 1
        Stream<Integer> fromArray = Stream.of(1, 2, 3);       // count = 3

        System.out.println(empty.count());         // 0
        System.out.println(singleElement.count()); // 1
        System.out.println(fromArray.count());     // 3

        // Create a stream from a Collection
        var list = List.of("a", "b", "c");
        Stream<String> fromList = list.stream();
        System.out.println(fromList.count()); // 3

        // Create a parallel stream from a Collection
        var list2 = List.of("a", "b", "c");
        Stream<String> fromListParallel = list2.parallelStream();
        System.out.println(fromListParallel.count()); // 3

        // Creating infinite streams
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);

        // limit() makes them safe to print
        randoms.limit(3).forEach(System.out::println);
        oddNumbers.limit(5).forEach(System.out::println);

        // Overloaded iterate() with a predicate
        Stream<Integer> oddNumberUnder100 = Stream.iterate(
                1,              // seed
                n -> n < 100,   // Predicate to specify when done
                n -> n + 2      // UnaryOperator to get next value
        );
        oddNumberUnder100.limit(10).forEach(System.out::println);

        // Printing a stream reference does NOT print contents
        Stream<String> streamRef = Stream.of("x", "y", "z");
        System.out.println(streamRef); // java.util.stream.ReferencePipeline...

        // count()
        Stream<String> s1 = Stream.of("monkey", "gorilla", "bonobo");
        System.out.println(s1.count()); // 3

        // min()
        Stream<String> s2 = Stream.of("monkey", "ape", "bonobo");
        Optional<String> min = s2.min((sA, sB) -> sA.length() - sB.length());
        min.ifPresent(System.out::println); // ape

        // empty stream with min()
        Optional<?> minEmpty = Stream.empty().min((a, b) -> 0);
        System.out.println(minEmpty.isPresent()); // false

        // findAny() and findFirst()
        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s3.findAny().ifPresent(System.out::println);      // monkey (usually)
        infinite.findAny().ifPresent(System.out::println); // chimp

        // Matching
        var list3 = List.of("monkey", "2", "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list3.stream().anyMatch(pred));  // true
        System.out.println(list3.stream().allMatch(pred));  // false
        System.out.println(list3.stream().noneMatch(pred)); // false

        Stream<String> infinite2 = Stream.generate(() -> "chimp");
        System.out.println(infinite2.anyMatch(pred)); // true

        // This never terminates because allMatch() checks every element.
        // Stream<String> infinite3 = Stream.generate(() -> "chimp");
        // System.out.println(infinite3.allMatch(pred)); // Never terminates

        // filter()
        Stream<String> s4 = Stream.of("monkey", "gorilla", "bonobo");
        s4.filter(x -> x.startsWith("m"))
                .forEach(System.out::print); // monkey
        System.out.println();

        // distinct()
        Stream<String> s5 = Stream.of("duck", "duck", "duck", "goose");
        s5.distinct().forEach(System.out::print); // duckgoose
        System.out.println();

        // skip() and limit()
        Stream<Integer> s6 = Stream.iterate(1, n -> n + 1);
        s6.skip(5)
                .limit(2)
                .forEach(System.out::print); // 67
        System.out.println();

        // map()
        Stream<String> s7 = Stream.of("monkey", "gorilla", "bonobo");
        s7.map(String::length)
                .forEach(System.out::print); // 676
        System.out.println();

        // flatMap()
        List<String> zero = List.of();
        var one = List.of("Bonobo");
        var two = List.of("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(m -> m.stream())
                .forEach(System.out::println);

        // concat()
        var first = Stream.of("Bonobo");
        var second = Stream.of("Mama Gorilla", "Baby Gorilla");

        Stream.concat(first, second)
                .forEach(System.out::println);

        // sorted()
        Stream<String> s8 = Stream.of("brown-", "bear-");
        s8.sorted().forEach(System.out::print); // bear-brown-
        System.out.println();

        // sorted() with reverse order
        Stream<String> s9 = Stream.of("brown bear-", "grizzly-");
        s9.sorted(java.util.Comparator.reverseOrder())
                .forEach(System.out::print); // grizzly-brown bear-
        System.out.println();

        // This does NOT compile.
        // Stream<String> s10 = Stream.of("brown bear-", "grizzly-");
        // s10.sorted(java.util.Comparator::reverseOrder); // DOES NOT COMPILE

        // peek()
        var stream = Stream.of("black bear", "brown bear", "grizzly");
        long count = stream.filter(s -> s.startsWith("g"))
                .peek(System.out::println) // grizzly
                .count();
        System.out.println(count); // 1

        // Without streams
        var names = List.of("Toby", "Anna", "Leroy", "Alex");
        List<String> filtered = new ArrayList<>();
        for (String name : names) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        var iter = filtered.iterator();
        if (iter.hasNext()) System.out.println(iter.next());
        if (iter.hasNext()) System.out.println(iter.next());

        // With streams
        var names2 = List.of("Toby", "Anna", "Leroy", "Alex");
        names2.stream()
                .filter(n -> n.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}

/*
Notes from the source, kept as comments:

- A stream pipeline has three parts:
  1) source
  2) intermediate operations
  3) terminal operation

- Streams use lazy evaluation.
- Intermediate operations do not run until a terminal operation runs.
- A stream can be used only once after a terminal operation.
- Infinite streams are often made safe with limit().
*/