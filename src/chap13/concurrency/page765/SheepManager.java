package chap13.concurrency.page765;

import java.util.concurrent.Executors;

// Based on the corrected SheepManager example from the chapter.
public class SheepManager {

    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }

    public static void main(String[] args) {
        try (var service = Executors.newFixedThreadPool(20)) {
            var manager = new SheepManager();

            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page765/SheepManager.java

// Run:
java -cp out chap13.concurrency.page765.SheepManager
*/