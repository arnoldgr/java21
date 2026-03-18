package WorkingWithAdvancedStreamPipelineConcepts;

import java.util.IntSummaryStatistics;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Page579 {

    private static int max(IntStream ints) {
        OptionalInt optional = ints.max();
        return optional.orElseThrow(RuntimeException::new);
    }

    private static int range(IntStream ints) {
        IntSummaryStatistics stats = ints.summaryStatistics();
        if (stats.getCount() == 0) throw new RuntimeException();
        return stats.getMax() - stats.getMin();
    }

    public static void main(String[] args) {

        // Using a regular Stream<Integer> with reduce()
        Stream<Integer> stream1 = Stream.of(1, 2, 3);
        System.out.println(stream1.reduce(0, (s, n) -> s + n)); // 6

        // Convert Stream<Integer> to IntStream and sum()
        Stream<Integer> stream2 = Stream.of(1, 2, 3);
        System.out.println(stream2.mapToInt(x -> x).sum()); // 6

        // average()
        IntStream intStream = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream.average();
        System.out.println(avg.getAsDouble()); // 2.0

        // empty()
        DoubleStream empty = DoubleStream.empty();
        System.out.println(empty.count()); // 0

        // of()
        DoubleStream oneValue = DoubleStream.of(3.14);
        oneValue.forEach(System.out::println);

        DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
        varargs.forEach(System.out::println);

        // generate() and iterate()
        var random = DoubleStream.generate(Math::random);
        var fractions = DoubleStream.iterate(.5, d -> d / 2);

        random.limit(3).forEach(System.out::println);
        fractions.limit(3).forEach(System.out::println);

        // Counting with iterate()
        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::print); // 12345
        System.out.println();

        // range()
        IntStream range1 = IntStream.range(1, 6);
        range1.forEach(System.out::print); // 12345
        System.out.println();

        // rangeClosed()
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::print); // 12345
        System.out.println();

        // Mapping from object stream to primitive stream
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream lengths = objStream.mapToInt(s -> s.length());
        lengths.forEach(System.out::println);

        // Primitive optional types example
        LongStream longs = LongStream.of(5, 10);
        long sum = longs.sum();
        System.out.println(sum); // 15

        // Infinite primitive stream example
        // DoubleStream doubles = DoubleStream.generate(() -> Math.PI);
        // OptionalDouble min = doubles.min(); // runs infinitely

        // max()
        System.out.println(max(IntStream.of(3, 9, 6, 1))); // 9

        // range() using summary statistics
        System.out.println(range(IntStream.of(3, 9, 6, 1))); // 8
    }
}

/*
Notes from the source, kept as comments:

- Primitive streams:
  IntStream    -> int, short, byte, char
  LongStream   -> long
  DoubleStream -> double, float

- Common primitive stream methods:
  average(), sum(), min(), max(), range(), rangeClosed(), summaryStatistics()

- Primitive streams have matching optional types:
  OptionalInt, OptionalLong, OptionalDouble

- summaryStatistics() is useful when you need multiple calculations
  from the same stream, since a stream cannot have two terminal operations.
*/