package chap7.a1ImplementingInterfaces.page371b;

//Declaring static Interface Methods
//Interfaces can also include static methods.
// These methods are defined explicitly with the static keyword and, for the most part,
// behave just like static methods defined in classes.
//Static Interface Method Definition Rules

//A static method must be marked with the static keyword and include a method body.
//A static method without an access modifier is implicitly public.
//A static method cannot be marked abstract or final.
//A static method is not inherited and cannot be accessed in a class implementing the interface without
// a reference to the interface name.

//These rules should follow from what you know so far of classes, interfaces, and static methods.
//For example, you can’t declare static methods without a body in classes, either.
//Like default and abstract interface methods, static interface methods are implicitly public
// if they are declared without an access modifier. As you see shortly, you can use the private access modifier with static methods.
//Let’s take a look at a static interface method:
 interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}

//Since the method is defined without an access modifier, the compiler will automatically insert the public access modifier. The method getJumpHeight() works just like a static method as defined in a class. In other words, it can be accessed without an instance of a class.
  class Skip implements Hop {
    public int skip() {
        return Hop.getJumpHeight();
    }
}
//Notice we don’t have the same problem we did when we inherited two default interface methods with the same signature.
// Java “solved” the multiple inheritance problem of static interface methods by not allowing them to be inherited!