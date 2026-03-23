package chap10.optionals;

import java.util.Optional;

// Page 556
// IfPresentExample.java
// Demonstrates running code only when an Optional contains a value.

public class IfPresentExample {

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
        opt.ifPresent(System.out::println); // 95.0
    }
}

/*
From the source:
- ifPresent() expresses the intent clearly:
  do something only if the value is present.
- It behaves like an if statement with no else.
*/