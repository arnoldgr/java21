package chap10.optionals;

import java.util.Optional;

// Page 557
// OptionalWithExistingValue.java
// Demonstrates that the "or else" logic is ignored when a value exists.

public class OptionalWithExistingValue {

    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) return Optional.empty();

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> opt = average(90, 100);

        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        System.out.println(opt.orElseThrow());
    }
}

/*
From the source:
- When the Optional contains a value,
  the fallback logic is not used.
- This prints 95.0 three times.
*/