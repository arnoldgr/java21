// Page292.java
package understandinginheritance;

// Understanding Inheritance
// Demonstrates basic inheritance using extends

class Animal {

    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Dog inherits from Animal
class Dog extends Animal {

    public Dog(String name) {
        super(name); // calls parent constructor
    }

    public void bark() {
        System.out.println("Bark!");
    }
}

public class Page292 {

    public static void main(String[] args) {

        Dog dog = new Dog("Rex");

        dog.makeSound(); // inherited method
        dog.bark();      // child method
    }
}

/*
Key points:

- extends = inheritance
- Dog IS-A Animal
- super() calls parent constructor
- Child inherits methods + fields
*/