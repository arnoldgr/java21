package chap10.primitivestreams;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

// Page 583
// SummaryStatisticsExample.java
// Demonstrates summaryStatistics()

public class SummaryStatisticsExample {

    public static void main(String[] args) {

        IntStream stream = IntStream.of(1, 2, 3);

        IntSummaryStatistics stats = stream.summaryStatistics();

        System.out.println(stats.getAverage());
        System.out.println(stats.getMax());
        System.out.println(stats.getMin());
        System.out.println(stats.getSum());
    }
}

/*
- summaryStatistics() returns stats object
- contains avg, min, max, sum, count
*/