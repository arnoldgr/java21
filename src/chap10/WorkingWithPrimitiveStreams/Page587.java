package chap10.WorkingWithPrimitiveStreams;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Page587 {

    // Used for teeing()
    record Separations(String spaceSeparated, String commaSeparated) {}

    // Helper for flatMap() on Optional
    public static Optional<Integer> calculator(String text) {
        if (text == null || text.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(text.length());
    }

    private static void threeDigit(Optional<Integer> optional) {
        if (optional.isPresent()) { // outer if
            var num = optional.get();
            var string = "" + num;
            if (string.length() == 3) // inner if
                System.out.println(string);
        }
    }

    private static void threeDigitFunctional(Optional<Integer> optional) {
        optional.map(n -> "" + n)              // part 1
                .filter(s -> s.length() == 3)  // part 2
                .ifPresent(System.out::println); // part 3
    }

    public static class ExceptionCaseStudy {
        private static List<String> create() throws IOException {
            throw new IOException();
        }

        public void good() throws IOException {
            ExceptionCaseStudy.create().stream().count();
        }

        public void bad() throws IOException {
            // DOES NOT COMPILE because Supplier does not allow checked exceptions.
            // Supplier<List<String>> s = ExceptionCaseStudy::create;
        }

        public void ugly() {
            Supplier<List<String>> s = () -> {
                try {
                    return ExceptionCaseStudy.create();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            };

            try {
                s.get();
            } catch (RuntimeException e) {
                System.out.println("Wrapped checked exception in RuntimeException");
            }
        }

        private static List<String> createSafe() {
            try {
                return ExceptionCaseStudy.create();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void wrapped() {
            Supplier<List<String>> s2 = ExceptionCaseStudy::createSafe;

            try {
                s2.get();
            } catch (RuntimeException e) {
                System.out.println("Safe wrapper used");
            }
        }
    }

    public static void main(String[] args) {

        // Linking streams to the underlying data
        var cats = new ArrayList<String>();
        cats.add("Annie");
        cats.add("Ripley");
        var stream = cats.stream();
        cats.add("KC");
        System.out.println(stream.count()); // 3

        // Chaining Optional examples
        threeDigit(Optional.of(4));    // no output
        threeDigit(Optional.of(123));  // 123

        threeDigitFunctional(Optional.of(4));    // no output
        threeDigitFunctional(Optional.of(123));  // 123

        Optional<String> optional = Optional.of("chimp");

        // map()
        Optional<Integer> result1 = optional.map(String::length);
        System.out.println(result1); // Optional[5]

        // flatMap()
        Optional<Integer> result2 = optional.flatMap(Page587::calculator);
        System.out.println(result2); // Optional[5]

        // This does NOT compile because map() would produce Optional<Optional<Integer>>
        // Optional<Integer> bad = optional.map(Page587::calculator); // DOES NOT COMPILE

        // Checked exceptions and functional interfaces
        ExceptionCaseStudy ecs = new ExceptionCaseStudy();
        ecs.ugly();
        ecs.wrapped();

        // Basic collectors
        var ohMy1 = Stream.of("lions", "tigers", "bears");
        String joined = ohMy1.collect(Collectors.joining(", "));
        System.out.println(joined); // lions, tigers, bears

        var ohMy2 = Stream.of("lions", "tigers", "bears");
        Double average = ohMy2.collect(Collectors.averagingInt(String::length));
        System.out.println(average); // 5.333333333333333

        var ohMy3 = Stream.of("lions", "tigers", "bears");
        TreeSet<String> result3 = ohMy3
                .filter(s -> s.startsWith("t"))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(result3); // [tigers]

        // partitioningBy()
        var ohMy4 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, List<String>> map1 = ohMy4.collect(
                Collectors.partitioningBy(s -> s.length() <= 7));
        System.out.println(map1);

        // partitioningBy() with downstream collector
        var ohMy5 = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map2 = ohMy5.collect(
                Collectors.partitioningBy(
                        s -> s.length() <= 7,
                        Collectors.toSet()));
        System.out.println(map2);

        // groupingBy() with counting()
        var ohMy6 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map3 = ohMy6.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.counting()));
        System.out.println(map3); // {5=2, 6=1}

        // groupingBy() with mapping() and minBy()
        var ohMy7 = Stream.of("lions", "tigers", "bears");
        Map<Integer, Optional<Character>> map4 = ohMy7.collect(
                Collectors.groupingBy(
                        String::length,
                        Collectors.mapping(
                                s -> s.charAt(0),
                                Collectors.minBy((a, b) -> a - b))));
        System.out.println(map4); // {5=Optional[b], 6=Optional[t]}

        // teeing()
        var list = List.of("x", "y", "z");
        Separations result = list.stream()
                .collect(Collectors.teeing(
                        Collectors.joining(" "),
                        Collectors.joining(","),
                        (s, c) -> new Separations(s, c)));
        System.out.println(result);
        // Separations[spaceSeparated=x y z, commaSeparated=x,y,z]

        // Spliterator
        List<String> animals = List.of("cat", "dog", "bird", "koala");
        Spliterator<String> originalBag = animals.spliterator();
        Spliterator<String> secondBag = originalBag.trySplit();

        if (secondBag != null) {
            System.out.println("Second bag:");
            secondBag.forEachRemaining(System.out::println);
        }

        System.out.println("Original bag:");
        originalBag.forEachRemaining(System.out::println);

        // Summary statistics example, still useful in advanced review
        IntSummaryStatistics stats = IntStream.of(3, 9, 6, 1).summaryStatistics();
        if (stats.getCount() > 0) {
            System.out.println(stats.getMax() - stats.getMin()); // 8
        }
    }
}

/*
Notes from the source, kept as comments:

- Streams are linked to the underlying data source lazily.
- Optional supports chaining with map(), filter(), and flatMap().
- flatMap() is used when the mapping function already returns an Optional.
- Functional interfaces usually do not declare checked exceptions.
- Common collectors include joining(), averagingInt(), toCollection(),
  partitioningBy(), groupingBy(), counting(), mapping(), and teeing().
- A Spliterator can split work into two parts with trySplit().
*/