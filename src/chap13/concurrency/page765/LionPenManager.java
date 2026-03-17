package chap13.concurrency.page765;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executors;

// Based on the chapter's LionPenManager example.

public class LionPenManager {

    private void removeLions() {
        System.out.println("Removing lions");
    }

    private void cleanPen() {
        System.out.println("Cleaning the pen");
    }

    private void addLions() {
        System.out.println("Adding lions");
    }

    public void performTask(CyclicBarrier c1, CyclicBarrier c2) {
        try {
            removeLions();
            c1.await();

            cleanPen();
            c2.await();

            addLions();
        } catch (InterruptedException | BrokenBarrierException e) {
            // Handle checked exceptions here
            System.out.println("Barrier problem: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(4)) {
            var manager = new LionPenManager();
            var c1 = new CyclicBarrier(4);
            var c2 = new CyclicBarrier(4, () -> System.out.println("*** Pen Cleaned!"));

            for (int i = 0; i < 4; i++) {
                service.submit(() -> manager.performTask(c1, c2));
            }
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page765/LionPenManager.java

// Run:
java -cp out chap13.concurrency.page765.LionPenManager
*/