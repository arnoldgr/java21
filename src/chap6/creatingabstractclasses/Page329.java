// Page329.java
package creatingabstractclasses;

// Creating Abstract Classes

abstract class Animal {

    abstract void makeSound();

    public void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}

public class Page329 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.makeSound();
        dog.sleep();
    }
}

/*
Abstract class:

- Cannot be instantiated
- Can have abstract methods (no body)
- Subclass MUST implement them

abstract void makeSound();
*/