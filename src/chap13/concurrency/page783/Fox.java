package chap13.concurrency.page783;

import java.util.concurrent.Executors;

// Based directly on the chapter's fox deadlock example.

class Food {
}

class Water {
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

        // Create participants and resources
        var foxy = new Fox("Foxy");
        var tails = new Fox("Tails");
        var food = new Food();
        var water = new Water();

        // Process data
        try (var service = Executors.newScheduledThreadPool(10)) {
            service.submit(() -> foxy.eatAndDrink(food, water));
            service.submit(() -> tails.drinkAndEat(food, water));
        }
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page783/Fox.java

// Run:
java -cp out chap13.concurrency.page783.Fox
*/