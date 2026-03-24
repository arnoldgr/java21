package chap7.c3SealingClasses.page384;

//Omitting the permits Clause
//Up until now, all of the examples you’ve seen have required a permits clause when declaring a sealed class,
// but this is not always the case.
// Imagine that you have a Snake.java file with two top-level classes defined inside it:
// Snake.java
public sealed class Snake permits Cobra {
}

final class Cobra extends Snake {
}

//In this case, the permits clause is optional and can be omitted. The extends keyword is still required in the subclass, though:
// Snake.java
//public sealed class Snake {}
//final class Cobra extends Snake {}

//If these classes were in separate files, this code would not compile! To omit the permits clause,
// the declarations must be in the same file.
//The permits clause can also be omitted if the subclasses are nested.
//public sealed class Snake {
//    final class Cobra extends Snake {}


//We cover nested classes shortly. For now, you just need to know that a nested class is a class defined inside another class and that the omit rule also applies to nested classes. Table 7.3 is a handy reference to these cases.

//Usage of the permits clause in sealed classes

//location of direct subclasses                 permits clause
//In a different file from the sealed class ->   required
//In the same file as the sealed class      ->   permitted but not required
//Nested inside of the sealed class         ->   permitted but not required