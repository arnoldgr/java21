package chap6.inheritingmembers.page321;

public class Page321 {
//    Method Overriding Infinite Calls
//
//    You might be wondering whether the use of super in the previous example was required.
//    For example, what would the following code output if we removed the super keyword?
//
//
//    public double getAverageWeight() {
//        return getAverageWeight()+20;  // StackOverflowError IT'S CALLING ITSELF//    }
//
//
//    In this example, the compiler would not call the parent Marsupial method; it would call the current Kangaroo method. The application will attempt to call itself infinitely and produce a StackOverflowError at runtime.
////
//
//    To override a method, you must follow a number of rules. The compiler performs the following checks when you override a method:
//
//    The method in the child class must have the same signature as the method in the parent class.
//    The method in the child class must be at least as accessible as the method in the parent class.
//    The method in the child class may not declare a checked exception that is new or broader than the class
//    of any exception declared in the parent class method.
//    If the method returns a value, it must be the same or a subtype of the method in the parent class,
//    known as covariant return types.
//
//    While these rules may seem confusing or arbitrary at first, they are needed for consistency.
//    Without these rules in place, it is possible to create contradictions within the Java language.
//
//    Rule #1: Method Signatures
//    The first rule of overriding a method is somewhat self-explanatory.
//    If two methods have the same name but different signatures, the methods are overloaded, not overridden.
//    Overloaded methods are considered independent and do not share the same polymorphic properties as overridden methods.
////
//    We covered overloading a method in Chapter 5, and it is similar to overriding a method,
//    as both involve defining a method using the same name.
//    Overloading differs from overriding in that overloaded methods use a different parameter list.
//    For the exam, it is important that you understand this distinction and that overridden methods
//    have the same signature and a lot more rules than overloaded methods
//
}
