package chap7.c3SealingClasses.page386;

//Applying Pattern Matching to a Sealed Class
//Remember from Chapter 3, switch now supports pattern matching.
// Imagine if we could treat a sealed class like an enum in a switch by applying pattern matching.
// Well, we can! Given a sealed class Fish with two direct subclasses:
  abstract sealed class Fish permits Trout, Bass {
    String getType(Fish fish) {
        return switch (fish) {
            case Trout t -> "Trout!";
            case Bass b -> "Bass!";

        };
    }


}
final class Trout extends Fish {}
final class Bass extends Fish {
    public static void main(String[] args) {
        Fish f  = new Bass();
        System.out.println(f.getType(f));

    }
}


//We can define a switch expression that does not require a default clause:


//This only works because Fish is abstract and sealed, and all possible subclasses are handled.
// If we remove the abstract modifier in the Fish declaration, then the switch expression would not compile.
// As an exercise to the reader, see if you can figure out how many different ways there are to change
// the switch expression that would allow it to compile again.
// Like enums, make sure that if a switch uses a sealed class with pattern matching that
// all possible types are covered or a default clause is included.


//Reviewing Sealed Class Rules
//Any time you see a sealed class on the exam, pay close attention to the subclass declaration and modifiers.
//Sealed Class Rules
//
//Sealed classes are declared with the sealed and permits modifiers.
//Sealed classes must be declared in the same package or named module as their direct subclasses.
//        Direct subclasses of sealed classes must be marked final, sealed, or non-sealed. For interfaces that extend a sealed interface, only sealed and non-sealed modifiers are permitted.
//        The permits clause is optional if the sealed class and its direct subclasses are declared within the same file or the subclasses are nested within the sealed class.
//        Interfaces can be sealed to limit the classes that implement them or the interfaces that extend them.
