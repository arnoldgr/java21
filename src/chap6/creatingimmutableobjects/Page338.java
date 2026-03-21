// Page338.java
package creatingimmutableobjects;

// Creating Immutable Objects

final class Person {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Page338 {

    public static void main(String[] args) {

        Person p = new Person("John");

        System.out.println(p.getName());

        // p.name = "Mike"; // DOES NOT COMPILE
    }
}

/*
Immutable object rules:

- Class is final (optional but recommended)
- Fields are private
- Fields are final
- No setters
- Only getters

Object cannot change after creation
*/