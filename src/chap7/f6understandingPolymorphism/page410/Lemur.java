package chap7.f6understandingPolymorphism.page410;

// Understanding Polymorphism
// We conclude this chapter with a discussion of polymorphism, the property of an object
// to take on many different forms. To put this more precisely,
// a Java object may be accessed using the following:
//
// A reference with the same type as the object
// A reference that is a superclass of the object
// A reference of an interface the object implements or inherits

// Furthermore, a cast is not required if the object is being
// reassigned to a supertype or interface of the object.
// Phew, that’s a lot!
// Don’t worry; it’ll make sense shortly.
// Let’s illustrate this polymorphism property with the following example:

class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);
        System.out.println(lemur.hasHair());

        HasTail hasTail = lemur;
        System.out.println(hasTail.isTailStriped());

        Primate primate = lemur;
        System.out.println(primate.hasHair());
    }
}

//This code compiles and prints the following output:
//        10
//        false
//        true
//
// The most important thing to note about this example is that only one object,
// Lemur, is created.
// Polymorphism enables an instance of Lemur to be reassigned or passed
// to a method using one of its supertypes, such as Primate or HasTail.
// Once the object has been assigned to a new reference type,
// only the methods and variables available to that reference type are
// callable on the object without an explicit cast.
// For example, the following snippets of code will not compile:

//HasTail hasTail = new Lemur();
//System.out.println(hasTail.age);             // DOES NOT COMPILE
//
//Primate primate = new Lemur();
//System.out.println(primate.isTailStriped()); // DOES NOT COMPILE
//
//In this example, the reference hasTail has direct access only to methods defined with the HasTail interface;
// therefore, it doesn’t know that the variable age is part of the object.
// Likewise, the reference primate has access only to methods defined in the Primate class,
// and it doesn’t have direct access to the isTailStriped() method.

