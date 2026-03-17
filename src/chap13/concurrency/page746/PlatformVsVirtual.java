package chap13.concurrency.page746;

import java.util.stream.Stream;

// Based on the chapter's PlatformVsVirtual example.


public class PlatformVsVirtual {

    static void waitUp() {
        try {
            Thread.sleep(1_000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

       int count = 1_000;

        var threads = Stream.generate(() -> Thread.ofVirtual().unstarted(PlatformVsVirtual::waitUp))
                .limit(count)
                .toList();

        threads.forEach(Thread::start);

        for (var t : threads) {
            t.join();
        }

        System.out.println("Finished " + count + " virtual threads.");
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page746/PlatformVsVirtual.java

// Run:
java -cp out chap13.concurrency.page746.PlatformVsVirtual
*/