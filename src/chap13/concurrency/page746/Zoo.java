package chap13.concurrency.page746;

// Based on the chapter's Zoo example.
//
// The point of this example is:
// - the main() method can finish
// - but the JVM may keep running if a non-daemon platform thread is still alive
//
// The chapter shows that platform threads are non-daemon by default,
// while virtual threads are always daemon threads.

public class Zoo {

    // Defines the thread task.
    public static void pause() {
        try {
            Thread.sleep(10_000); // Wait for 10 seconds
        } catch (InterruptedException e) {

        }

        System.out.println("Thread finished!");
    }

    public static void main(String[] unused) {

        // Non-daemon platform thread by default
        var job = Thread.ofPlatform().start(Zoo::pause);

        // Try this instead if you want to see daemon behavior:
        // var job = Thread.ofPlatform().daemon(true).start(Zoo::pause);

        System.out.println("Main method finished!");
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page746/Zoo.java

// Run:
java -cp out chap13.concurrency.page746.Zoo
*/