package chap5.g8OverloadingMethods.page272;

//Overloading Methods
//Now that you are familiar with the rules for declaring and using methods,
// it is time to look at creating methods with the same name in the same class.
// Method overloading occurs when methods in the same class have the same name
// but different method signatures, which means they use different parameter lists.
// (Overloading differs from overriding, which you learn about in Chapter 6.)
//We’ve been showing how to call overloaded methods for a while.
// System.out.println() and StringBuilder’s append() methods provide many overloaded versions,
// so you can pass just about anything to them without having to think about it.
// In both of these examples, the only change was the type of the parameter.
// Overloading also allows different numbers of parameters.
//Everything other than the method name can vary for overloading methods.
// This means there can be different access modifiers, optional specifiers
// (like static), return types, and exception lists.
//The following shows five overloaded versions of the fly() method:
public class Falcon {
    public void fly(int numMiles) {}
    public void fly(short numFeet) {}
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) {}
    public void fly(short numFeet, int numMiles) throws Exception {}
}

//As you can see, we can overload by changing anything in the parameter list.
// We can have a different type, more types, or the same types in a different order.
// Also notice that the return type, access modifier, and exception list are irrelevant to overloading.
// Only the method name and parameter list matter.
