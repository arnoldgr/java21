package chap13.concurrency.page783;

import java.util.concurrent.Executors;

// Chapter 13 - Identifying Threading Problems

public class Page783 {

    static class Food {
    }

    static class Water {
    }

    public record Fox(String name) {

        public void eatAndDrink(Food food, Water water) {
            synchronized (food) {
                System.out.println(name() + " Got Food!");
                move();

                synchronized (water) {
                    System.out.println(name() + " Got Water!");
                }
            }
        }

        public void drinkAndEat(Food food, Water water) {
            synchronized (water) {
                System.out.println(name() + " Got Water!");
                move();

                synchronized (food) {
                    System.out.println(name() + " Got Food!");
                }
            }
        }

        public void move() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {

            }
        }

        public static void main(String[] args) {

            var foxy = new Fox("Foxy");
            var tails = new Fox("Tails");
            var food = new Food();
            var water = new Water();

            try (var service = Executors.newScheduledThreadPool(10)) {
                service.submit(() -> foxy.eatAndDrink(food, water));
                service.submit(() -> tails.drinkAndEat(food, water));
            }

            // Notes:
            // Deadlock:
            // Both threads may wait forever for the other resource.
            //
            // Starvation:
            // One thread keeps losing access to a shared resource.
            //
            // Livelock:
            // Threads stay active but keep reacting to each other without progress.
            //
            // Race condition:
            // Two tasks run at the same time and create invalid or unexpected data.
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page783/Page783.java

// Run:
java -cp out chap13.concurrency.page783.Page783
*/