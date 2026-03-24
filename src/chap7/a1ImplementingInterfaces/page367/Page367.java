package chap7.a1ImplementingInterfaces.page367;

//Differences between Interfaces and Abstract Classes
//Even though abstract classes and interfaces are both considered abstract types,
// only interfaces make use of implicit modifiers.
// How do the play() methods differ in the following two definitions?
abstract class Husky {    // abstract modifier required
    abstract void play();  // abstract modifier required
}

interface Poodle {        // abstract modifier optional
    void play();           // abstract modifier optional
}
//
//Both of these method definitions are considered abstract.
// That said, the Husky class will not compile if the play() method is not marked abstract,
// whereas the method in the Poodle interface will compile with or without the abstract modifier.
//What about the access level of the play() method?

// Can you spot anything wrong with the following class definitions that use our abstract types?
class Webby extends Husky {
    void play() {}      // play() is declared with package access in Husky
}

//public class Georgette implements Poodle {
//    void play() {}      // DOES NOT COMPILE - play() is public in Poodle
//}

//The Webby class compiles, but the Georgette class does not.
// Even though the two method implementations are identical, the method in the Georgette class reduces
// the access modifier on the method from public to package access.

//    Declaring Concrete Interface Methods
//    Table 7.1 lists the six interface member types that you need to know for the exam. We’ve already covered abstract methods and constants, so we focus on the remaining four concrete methods in this section.
//    In Table 7.1, the membership type determines how it is able to be accessed. A method with a membership type of class is shared among all instances of the interface, whereas a method with a membership type of instance is associated with a particular instance of the interface.
////
//    TABLE 7.1 Interface member types

//Constant variable : Class variable, implicitly public,static,final, has value
//abstract method   : Instance method, implicitly public,abstract, no body
//default method    :  Instance method , implicitly public with body
//static method     : Class method, static,implicitly public, has a body
//private method    : instance method,with body
//private, static method : Class method  with body

//What About protected or Package Interface Members?

//Interfaces do not support protected members, as a class cannot extend an interface.
// They also do not support package access members, although more likely for syntax reasons and backward compatibility.
// Since interface methods without an access modifier have been considered implicitly public, changing this behavior
// to package access would break many existing programs!

