package chap13.concurrency.page756;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Chapter 13 - Creating Threads with the Concurrency API

public class Page756 {

    public static void main(String[] args) throws Exception {

        Runnable printInventory = () -> System.out.println("Printing zoo inventory");

        Runnable printRecords = () -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("Printing record: " + i);
            }
        };

        Callable<Integer> dataTask = () -> 30 + 11;

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            System.out.println("begin");

            service.execute(printInventory);
            service.execute(printRecords);
            service.execute(printInventory);

            Future<Integer> result = service.submit(dataTask);

            System.out.println("Callable result: " + result.get());
            System.out.println("end");
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page756/Page756.java

// Run:
java -cp out chap13.concurrency.page756.Page756
*/