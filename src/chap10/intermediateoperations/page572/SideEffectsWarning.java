package chap10.intermediateoperations;

import java.util.ArrayList;
import java.util.List;

// Page 572
// SideEffectsWarning.java
// Demonstrates bad practice with side effects

public class SideEffectsWarning {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        // BAD PRACTICE: modifying external state in stream
        list.stream().forEach(s -> {
            // avoid modifying external variables here
            System.out.println(s);
        });
    }
}

/*
- Avoid side effects in streams
- Prefer returning results instead of modifying external state
*/