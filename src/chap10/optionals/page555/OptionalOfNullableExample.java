package chap10.optionals;

import java.util.Optional;

// Page 555
// OptionalOfNullableExample.java
// Demonstrates creating an Optional from a value that might be null.

public class OptionalOfNullableExample {

    public static void main(String[] args) {
        String value = null;

        Optional<String> opt1 =
                (value == null) ? Optional.empty() : Optional.of(value);

        Optional<String> opt2 = Optional.ofNullable(value);

        System.out.println(opt1); // Optional.empty
        System.out.println(opt2); // Optional.empty
    }
}

/*
From the source:
- A common pattern is to use Optional.empty() when a value is null.
- Optional.ofNullable(value) is the shortcut for that pattern.
*/