package chap13.concurrency.page756;

import java.util.concurrent.Executors;

public class MissingClose {

    public static void main(String[] args) {

        // ORIGINAL IDEA FROM THE CHAPTER - left commented so it does not hang:
        /*
        var service = Executors.newSingleThreadExecutor();
        service.submit(() -> System.out.println("Never stops"));
        */

        // Safe fixed version:
        try (var service = Executors.newSingleThreadExecutor()) {
            service.submit(() -> System.out.println("Now it shuts down correctly"));
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page756/MissingClose.java

// Run:
java -cp out chap13.concurrency.page756.MissingClose
*/