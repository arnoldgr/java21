package chap6.declaringconstructors.page310;

//Understanding Compiler Enhancements
//Wait a second: we said the first line of every constructor is a call to either this() or super(),
// but we’ve been creating classes and constructors throughout this book, and we’ve rarely done either.
// How did these classes compile?
//The answer is that the Java compiler automatically inserts a call to the no-argument
// constructor super() if you do not explicitly call this() or super() as the first line of a constructor.
// For example, the following three class and constructor definitions are equivalent,
// because the compiler will automatically convert them all to the last example:
class Donkey {}

//class Donkey {
//    public Donkey() {}
//}
//
//class Donkey {
//    public Donkey() {
//        super();
//    }
//}


//Make sure you understand the differences between these three Donkey class definitions and
// why Java will automatically convert them all to the last definition.
// While reading the next section, keep in mind the process the Java compiler performs.