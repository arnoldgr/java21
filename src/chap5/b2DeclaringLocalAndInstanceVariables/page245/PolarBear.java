package chap5.b2DeclaringLocalAndInstanceVariables.page245;

//Instance Variable Modifiers
//Like methods, instance variables can have different access levels,
// such as private, package, protected, and public.
// Remember, package access is indicated by the lack of any modifiers.
// We cover each of the different access modifiers shortly in this chapter.
// Instance variables can also use optional specifiers as below:


//Optional specifiers for instance variables
//final: Specifies that the instance variable must be initialized with each instance of the class exactly once
//volatile:Instructs the JVM that the value in this variable may be modified by other threads
//transient: Used to indicate that an instance variable should not be serialized with the class

public class PolarBear {
    final int age = 10;
    final int fishEaten;
    final String name;

    { fishEaten = 10; }

    public PolarBear() {
        name = "Robert";
    }
}

//The age variable is given a value when it is declared,
// while the fishEaten variable is assigned a value in an instance initializer.
// The name variable is given a value in the no-argument constructor.
// Failing to initialize an instance variable (or assigning a value more than once)
// will lead to a compiler error.
// We talk about final variable initialization in more detail
// when we cover constructors in the next chapter.

