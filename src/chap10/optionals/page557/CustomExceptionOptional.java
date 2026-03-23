package chap10.optionals;

import java.util.Optional;

// Page 557
// CustomExceptionOptional.java
// Demonstrates throwing a custom exception with orElseThrow().

public class CustomExceptionOptional {

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

        try {
            System.out.println(opt.orElseThrow(
                    () -> new IllegalStateException()));
        } catch (Exception e) {
            System.out.println(e);
        }

        // This does not compile because opt is Optional<Double>,
        // so the Supplier must return a Double, not an exception.
        //
        // System.out.println(opt.orElseGet(
        //         () -> new IllegalStateException())); // DOES NOT COMPILE
    }
}

/*
From the source:
- orElseThrow(() -> new IllegalStateException()) is valid.
- orElseGet(() -> new IllegalStateException()) does NOT compile,
  because orElseGet() expects a Supplier of the Optional's value type.
*/