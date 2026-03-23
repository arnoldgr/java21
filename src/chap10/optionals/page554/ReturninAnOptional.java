package page554;

import java.util.Optional;

// Page 554
// ReturningAnOptional.java
// Demonstrates returning an Optional when a value may or may not exist.

public class ReturningAnOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average());        // Optional.empty
    }
}

/*
From the source:
- Optional.empty() is used when there is no value.
- Optional.of(value) wraps a value.
- Optional uses a factory pattern rather than public constructors.
*/