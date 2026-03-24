package chap7.c3SealingClasses.page385;

//Referencing Nested Subclasses

//While it makes the code easier to read if you omit the permits clause for nested subclasses,
// you are welcome to name them. However, the syntax might be different than you expect.
//sealed class Snake permits Cobra {  // DOES NOT COMPILE
//    final class Cobra extends Snake {}
//}
//This code does not compile because Cobra requires a reference to the Snake namespace. The following fixes this issue:
sealed class Snake permits Snake.Cobra {
    final class Cobra extends Snake {}
}

//When all of your subclasses are nested, we strongly recommend omitting the permits class.


