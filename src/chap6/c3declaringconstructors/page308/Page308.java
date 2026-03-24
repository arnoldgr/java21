package chap6.declaringconstructors.page308;

//super vs. super()
//
//Like this and this(), super and super() are unrelated in Java.
// The first, super, is used to reference members of the parent class, while the second, super(),
// calls a parent constructor. Anytime you see the keyword super on the exam, make sure it is being used properly.
//
//Like calling this(), calling super() can only be used as the first statement of the constructor.
// For example, the following two class definitions will not compile:
class Zoo {
    public Zoo() {
        System.out.println("Zoo created");
//        super();     // DOES NOT COMPILE
    }
}

class Zoo2 {
    public Zoo2() {
        super();
        System.out.println("Zoo created");
//        super();     // DOES NOT COMPILE
    }
}

//The first class will not compile because the call to the parent constructor must be the first
// statement of the constructor.
// In the second code snippet, super() is the first statement of the constructor,
// but it is also used as the third statement. Since super() can only be called once as the first statement
// of the constructor, the code will not compile.


//If the parent class has more than one constructor, the child class may use any valid and
// accessible parent constructor in its definition, as shown in the following example:
class Animal {
    private int age;
    private String name;
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public Animal(int age) {
        super();
        this.age = age;
        this.name = null;
    }
}

class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age, "Gorilla");  // Calls the first Animal constructor
    }
    public Gorilla() {
        super(5);              // Calls the second Animal constructor
    }
}


//In this example, the first child constructor takes one argument, age,
// and calls the parent constructor, which takes two arguments, age and name.
// The second child constructor takes no arguments, and it calls the parent constructor,
// which takes one argument, age.
// In this example, notice that the child constructors are not required to call matching
// parent constructors. Any valid parent constructor is acceptable as long as it is accessible
// and the appropriate input parameters to the parent constructor are provided.
