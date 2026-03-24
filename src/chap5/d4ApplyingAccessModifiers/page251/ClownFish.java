package chap5.d4ApplyingAccessModifiers.page251;

//The protected access modifier adds the ability to access members of a parent class.
// We cover creating subclasses in depth in Chapter 6.
// For now, we cover the simplest possible use of a subclass.
// In the following example, the “child” ClownFish class is a subclass of the “parent” Fish class,
// using the extends keyword to connect them:

public class ClownFish extends Fish{

}

//By extending a class, the subclass gains access to all protected and public members of the parent class,
// as if they were declared in the subclass.
// If the two classes are in the same package, then the subclass also gains access to all package members.


