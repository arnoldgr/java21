package chap13.concurrency.page765;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

// Chapter 13 - Writing Thread-Safe Code

public class Page765 {

    private int unsafeCount = 0;
    private final AtomicInteger safeCount = new AtomicInteger(0);

    private void incrementUnsafe() {
        System.out.print((++unsafeCount) + " ");
    }

    private void incrementSafe() {
        System.out.print(safeCount.incrementAndGet() + " ");
    }

    private synchronized void incrementOrdered() {
        System.out.print((++unsafeCount) + " ");
    }

    public static void main(String[] args) {
        var manager = new Page765();

        System.out.println("Unsafe version:");
        try (var service = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementUnsafe);
            }
        }

        System.out.println();
        System.out.println("Atomic version:");
        try (var service = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementSafe);
            }
        }

        manager.unsafeCount = 0;

        System.out.println();
        System.out.println("Synchronized ordered version:");
        try (var service = Executors.newFixedThreadPool(10)) {
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementOrdered);
            }
        }

        System.out.println();
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page765/Page765.java

// Run:
java -cp out chap13.concurrency.page765.Page765
*/