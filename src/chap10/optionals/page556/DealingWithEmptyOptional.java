package chap10.optionals;

import java.util.Optional;

// Page 556
// DealingWithEmptyOptional.java
// Demonstrates orElse(), orElseGet(), and orElseThrow() with an empty Optional.

public class DealingWithEmptyOptional {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> opt = average();

        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));

        try {
            System.out.println(opt.orElseThrow());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
From the source:
- orElse(value) returns a direct fallback value.
- orElseGet(supplier) returns a generated fallback value.
- orElseThrow() throws NoSuchElementException when empty.
*/