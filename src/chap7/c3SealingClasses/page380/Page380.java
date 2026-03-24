package chap7.c3SealingClasses.page380;
//Sealing Classes
//An enum with many constructors, fields, and methods may start to resemble a full-featured class.
// What if we could create a class but limit the direct subclasses to a fixed set of classes?
// Enter sealed classes! A sealed class is a class that restricts which other classes may extend it.

//Declaring a Sealed Class
//Let’s start with a simple example. A sealed class declares a list of classes that can extend it,
// while the subclasses declare that they extend the sealed class.
// Figure 7.5 declares a sealed class with two subclasses.

//figure 7.5
 sealed class Bear permits Kodiak,Panda{};
 final class Kodiak extends  Bear {};
 non-sealed class Panda extends Bear{}