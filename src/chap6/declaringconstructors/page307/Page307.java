package chap6.declaringconstructors.page307;

//Congratulations, you’re well on your way to becoming an expert in using constructors!
// There’s one more set of rules we need to cover, though, for calling constructors in the parent class.
// After all, how do instance members of the parent class get initialized?
//The first statement of every constructor is a call to a parent constructor using super() or another constructor
// in the class using this().
// Read the previous sentence twice to make sure you remember it. It’s really important!

//For simplicity in this section, we often refer to super() and this() to refer to any parent or
// overloaded constructor call, even those that take arguments.
//Let’s take a look at the Animal class and its subclass Zebra and see how their constructors can be properly written to call one another:
class Animal {
    private int age;

    public Animal(int age) {
        super();     // Refers to constructor in java.lang.Object
        this.age = age;
    }
}

class Zebra extends chap6.declaringconstructors.page308.Animal {
    public Zebra(int age) {
        super(age);  // Refers to constructor in Animal
    }

    public Zebra() {
        this(4);     // Refers to constructor in Zebra with int argument
    }
}

//In the Animal class, the first statement of the constructor is a call to the
// parent constructor defined in java.lang.Object, which takes no arguments.
// In the second class, Zebra, the first statement of the first constructor is a
// call to Animal’s constructor, which takes a single argument.
// The Zebra class also includes a second no-argument constructor that doesn’t call super()
// but instead calls the other constructor within the Zebra class using this(4).



