package chap6.understandinginheritance.page294;

public class Page294 {
//    Class Modifiers
//    Like methods and variables, a class declaration can have various modifiers.
//    final:      The class may not be extended
//    abstract:   The class is abstract, may contain abstract methods,
//                and requires a concrete subclass to instantiate.
//    sealed:     The class may only be extended by a specific list of classes.
//    non-sealed: A subclass of a sealed class permits potentially unnamed subclasses.
//    static:     Used for static nested classes defined within a class.


}
class Mammal {}

final class Rhinoceros extends Mammal {}

//class Clara extends Rhinoceros {}  // DOES NOT COMPILE

//On the exam, pay attention to any class marked final.
// If you see another class extending it, you know immediately the code does not compile.
