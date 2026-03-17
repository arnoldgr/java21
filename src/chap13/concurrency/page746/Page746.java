package chap13.concurrency.page746;

// Chapter 13 - Introducing Threads
// Page-style class for the "Introducing Threads" section.
//
// This file is based on the chapter discussion of platform threads,
// virtual threads, and creating thread tasks with Runnable.
// The book also shows related examples like Zoo and PlatformVsVirtual.
//
// This page-style file keeps things simple and runnable in IntelliJ.

public class Page746 {

    // A small task for a thread to run.
    static void pauseTask() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted while pausing!");
        }

        System.out.println("Thread task finished!");
    }

    public static void main(String[] args) throws InterruptedException {

        // Example 1: Start a platform thread.
        var platformThread = Thread.ofPlatform().start(Page746::pauseTask);

        // Example 2: Start a virtual thread.
        var virtualThread = Thread.ofVirtual().start(() -> {
            System.out.println("Virtual thread is running!");
        });

        // Example 3: Interrupt a waiting thread.
        var interruptExample = Thread.ofPlatform().start(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        });

        interruptExample.interrupt();

        // Wait for threads to finish so output is easier to see.
        platformThread.join();
        virtualThread.join();
        interruptExample.join();

        System.out.println("Main method finished!");
    }
}

/*
Commented command-line snippets from the chapter style:

// Compile:
javac -d out src/chap13/concurrency/page746/Page746.java

// Run:
java -cp out chap13.concurrency.page746.Page746
*/