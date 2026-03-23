package chap6.creatingclasses;// Page297.java


// Creating Classes
// Demonstrates class structure, fields, and methods

public class Page297 {

    String name;
    int age;

    public void setName(String newName) {
        name = newName;
    }

    public void setAge(int newAge) {
        age = newAge;
    }

    public void printInfo() {
        System.out.println(name + " is " + age + " years old");
    }

    public static void main(String[] args) {

        Page297 person = new Page297();
        person.setName("John");
        person.setAge(25);

        person.printInfo();
    }
}

/*
Class structure:

- Fields (variables)
- Methods (behavior)
- main() for execution

Objects are instances of classes
*/