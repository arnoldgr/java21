package chap6.functionalinterfaces;

import java.util.function.*;

// Introducing Functional Interfaces
// These are built-in interfaces used with lambdas

public class Page381 {

    public static void main(String[] args) {

        // Predicate<T> → takes T, returns boolean
        Predicate<String> pred = s -> s.length() > 3;
        System.out.println(pred.test("Java")); // true

        // Consumer<T> → takes T, returns void
        Consumer<String> con = s -> System.out.println(s);
        con.accept("Hello");

        // Supplier<T> → takes nothing, returns T
        Supplier<Double> sup = () -> Math.random();
        System.out.println(sup.get());

        // Comparator<T> → takes 2 values, returns int
        Comparator<Integer> comp = (a, b) -> a - b;
        System.out.println(comp.compare(5, 3)); // positive
    }
}

/*
Functional Interfaces Summary:

Predicate<T>  -> (T) -> boolean
Consumer<T>   -> (T) -> void
Supplier<T>   -> () -> T
Comparator<T> -> (T, T) -> int

Only ONE abstract method allowed → functional interface
*/