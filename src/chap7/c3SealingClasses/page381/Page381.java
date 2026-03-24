package chap7.c3SealingClasses.page381;

//Sealed Class Keywords

//sealed: Indicates that a class or interface may only be extended/implemented by named classes or interfaces
//permits: Used with the sealed keyword to list the classes and interfaces allowed
//non-sealed: Applied to a class or interface that extends a sealed class,
// indicating that it can be extended by unspecified classes

//Pretty easy so far, right? The exam is just as likely to test you on what sealed classes cannot be used for.
// For example, can you see why each of these two sets of declarations do not compile?
//class sealed Frog permits GlassFrog {
//}  // DOES NOT COMPILE
//
//final class GlassFrog extends Frog {
//}

abstract sealed class Mammal permits Wolf {
}

final class Wolf extends Mammal {
}

//final class Tiger extends Mammal {
//}  // DOES NOT COMPILE

// The first example does not compile because the class and sealed modifiers are in the wrong order.
// The modifier has to be before the class type.
//
// The second example does not compile because
// Tiger isn’t listed in the declaration of Mammal.

// Sealed classes are commonly declared with the abstract modifier, although this is certainly not required.

// Declaring a sealed class with the sealed modifier is the easy part.
// Most of the time, if you see a question on the exam about sealed classes,
// they are testing your knowledge of whether the subclass extends the sealed class properly.
// There are a number of important rules you need to know for the exam, so read the next sections carefully.
