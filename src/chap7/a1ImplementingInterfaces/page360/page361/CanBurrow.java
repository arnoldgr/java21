package chap7.a1ImplementingInterfaces.page360.page361;
//In Chapter 6, you learned about abstract classes, specifically how to create and extend one.
// Since classes can only extend one class, they had limited use for inheritance.
// On the other hand, a class may implement any number of interfaces.
// An interface is an abstract data type that declares a list of abstract methods that any class
// implementing the interface must provide.
// Over time, the precise definition of an interface has changed, as additional method types are now supported.
// In this chapter, we start with a basic definition of an interface and expand it to cover all of the supported members.
//
//Declaring and Using an Interface
//In Java, an interface is defined with the interface keyword, analogous to the class keyword used when defining a class.
// Refer to Figure 7.1 for a proper interface declaration.

public abstract interface CanBurrow {
    public abstract Float getSpeed (int age);
    public static final int MINIMUM_DEPTH = 2;
}

//In Figure 7.1, our interface declaration includes a single abstract method and a constant variable.
//Interface variables are referred to as constants because they are assumed to be public, static, and final.
// They are initialized with a constant value when they are declared.
// Since they are public and static, they can be used outside the interface declaration without requiring an instance of the interface.
// It includes an abstract method that, like an interface variable, is assumed to be public.

// For brevity, we often say “an instance of an interface” in this chapter to mean an instance of a class that implements the interface.

//What does it mean for a variable or method to be assumed to be something?
// One aspect of an interface declaration that differs from an abstract class is that it contains
// implicit modifiers. An implicit modifier is a modifier that the compiler automatically inserts into the code.
// For example, an interface is always considered to be abstract, even if it is not marked so!
// We cover rules and examples for implicit modifiers in more detail shortly.

