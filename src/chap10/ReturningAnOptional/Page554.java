package ReturningAnOptional;

import java.util.Optional;

public class Page554 {

    // Here’s how to code our average method:
    public static Optional<Double> average(int... scores) {
        // Return an empty Optional when we can’t calculate an average.
        if (scores.length == 0) return Optional.empty();

        int sum = 0;

        // Add up the scores.
        for (int score : scores) {
            sum += score;
        }

        // Create an Optional to wrap the average.
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        // Calling the method shows what is in our two boxes:
        System.out.println(average(90, 100)); // Optional[95.0]
        System.out.println(average());        // Optional.empty

        // First we check whether the Optional contains a value.
        // Then we print it out.
        Optional<Double> opt1 = average(90, 100);
        if (opt1.isPresent()) {
            System.out.println(opt1.get()); // 95.0
        }

        // If we do not check and the Optional is empty,
        // get() would throw NoSuchElementException.
        // Optional<Double> opt2 = average();
        // System.out.println(opt2.get()); // NoSuchElementException

        // This is a common pattern when the value may be null.
        String value = null;
        Optional<String> o1 = (value == null) ? Optional.empty() : Optional.of(value);
        System.out.println(o1); // Optional.empty

        // Java provides a shortcut for the same thing.
        Optional<String> o2 = Optional.ofNullable(value);
        System.out.println(o2); // Optional.empty

        // Using ifPresent() expresses the intent better.
        Optional<Double> opt3 = average(90, 100);
        opt3.ifPresent(System.out::println); // 95.0

        // Dealing with an empty Optional
        Optional<Double> opt4 = average();
        System.out.println(opt4.orElse(Double.NaN));               // NaN
        System.out.println(opt4.orElseGet(() -> Math.random()));  // random value

        // Throw NoSuchElementException if empty
        // System.out.println(opt4.orElseThrow());

        // Throw a custom exception if empty
        // System.out.println(opt4.orElseThrow(() -> new IllegalStateException()));

        // This does NOT compile because opt4 is Optional<Double>,
        // so the Supplier must return a Double, not an exception.
        // System.out.println(opt4.orElseGet(
        //         () -> new IllegalStateException())); // DOES NOT COMPILE

        // If the Optional does contain a value,
        // the "or else" logic is ignored.
        Optional<Double> opt5 = average(90, 100);
        System.out.println(opt5.orElse(Double.NaN));              // 95.0
        System.out.println(opt5.orElseGet(() -> Math.random()));  // 95.0
        System.out.println(opt5.orElseThrow());                   // 95.0
    }
}

/*
Notes from the source, kept as comments:

- Optional is used when there might not be a value.
- Optional.empty() creates an empty Optional.
- Optional.of(value) wraps a non-null value.
- Optional.ofNullable(value) is used when the value might be null.
- get() throws an exception if the Optional is empty.
- ifPresent() runs code only when a value exists.
- orElse(), orElseGet(), and orElseThrow() specify what to do when empty.
*/