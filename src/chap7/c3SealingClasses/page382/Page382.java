package chap7.c3SealingClasses.page382;

//import chap7.c3SealingClasses.page382.zoo.Emperor;//Compiling Sealed Classes
//Let’s say we create a Penguin class and compile it in a new package without any other source code.
// With that in mind, does the following compile?
// Penguin.java

// sealed class Penguin permits Emperor {}  // DOES NOT COMPILE

// No, it does not! Why? The answer is that a sealed class needs to be declared (and compiled) in the same package
// as its direct subclasses. But what about the subclasses themselves?
// They must each extend the sealed class. For example, the following two declarations do not compile:

// Penguin.java
//package zoo;
//sealed class Penguin permits Emperor {}    // DOES NOT COMPILE
//final class Emperor extends Penguin {}

//Even though the Emperor class is declared, it does not extend the Penguin class.

//But wait, there’s more! In Chapter 12, “Modules,” you learn about named modules, which allow sealed classes and
// their direct subclasses in different packages, provided they are in the same named module.

//Specifying the Subclass Modifier
//While some types, like interfaces, have a certain number of implicit modifiers,
// sealed classes do not. Every class that directly extends a sealed class must specify exactly one of
// the following three modifiers: final, sealed, or non-sealed. Remember this rule for the exam!

//Creating final Subclasses
//The first modifier we’re going to look at that can be applied to a direct subclass
// of a sealed class is the final modifier. A sealed class with only final subclasses
// has a fixed set of types, which is similar to an enum with a fixed set of values.

sealed class Antelope permits Gazelle {}

final class Gazelle extends Antelope {}

//public class DamaGazelle extends Gazelle {}  // DOES NOT COMPILE

//Just as with a regular class, the final modifier prevents the subclass Gazelle from being extended further.


//Creating sealed Subclasses
//Next, let’s look at an example using the sealed modifier:
sealed class Fish permits ClownFish {}

sealed class ClownFish extends Fish permits OrangeClownFish {}

 final class OrangeClownFish extends ClownFish {}

//The sealed modifier applied to the subclass ClownFish means the same kind of rules that we applied to
// the parent class Fish must be present. Namely, ClownFish defines its own list of permitted subclasses.
// Notice in this example that OrangeClownFish is an indirect subclass of Fish but is not named in the Fish class.
//Despite allowing indirect subclasses not named in Fish,
// the list of classes that can inherit Fish is still fixed at compile time.
// If you have a reference to a Fish object, it must be a Fish, ClownFish, or OrangeClownFish.

