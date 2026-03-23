package chap10.terminaloperations;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

// Page 563
// MatchingOperations.java
// Demonstrates anyMatch(), allMatch(), and noneMatch().

public class MatchingOperations {

    public static void main(String[] args) {

        var list = List.of("monkey", "2", "chimp");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));  // true
        System.out.println(list.stream().allMatch(pred));  // false
        System.out.println(list.stream().noneMatch(pred)); // false
        System.out.println(infinite.anyMatch(pred));       // true
    }
}

/*
From the source:
- anyMatch(), allMatch(), and noneMatch() return boolean.
- Whether they terminate on an infinite stream depends on the data.
*/