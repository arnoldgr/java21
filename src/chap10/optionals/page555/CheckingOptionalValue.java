package chap10.optionals;

import java.util.Optional;

// Page 555
// CheckingOptionalValue.java
// Demonstrates checking whether an Optional contains a value before calling get().

public class CheckingOptionalValue {

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

        if (opt.isPresent()) {
            System.out.println(opt.get()); // 95.0
        }

        Optional<Double> empty = average();

        // This would throw NoSuchElementException if uncommented.
        // System.out.println(empty.get()); // NoSuchElementException
    }
}

/*
From the source:
- isPresent() checks whether a value exists.
- get() returns the value if present.
- Calling get() on an empty Optional throws NoSuchElementException.
*/