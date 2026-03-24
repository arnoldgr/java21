package chap6.understandinginheritance.page292;

//Understanding Inheritance
//When creating a new class in Java, you can define the class as inheriting from an existing class.
// Inheritance is the process by which a subclass automatically includes certain members of the class,
// including primitives, objects, or methods, defined in the parent class.
//For illustrative purposes, we refer to any class that inherits from another class as a subclass or child class,
// as it is considered a descendant of that class. Alternatively, we refer to the class that the child inherits
// from as the superclass or parent class, as it is considered an ancestor of the class.

//We indicate a class is a subclass by declaring it with the extends keyword.
// We don’t need to declare anything in the superclass other than making sure it is not marked final.
// More on that shortly.
//One key aspect of inheritance is that it is transitive. Given three classes [X, Y, Z], if X extends Y, and Y extends Z,
// then X is considered a subclass or descendant of Z.
// Likewise, Z is a superclass or ancestor of X. We sometimes use the term direct subclass
// or descendant to indicate the class directly extends the parent class.
// For example, X is a direct descendant only of class Y, not Z.
//In the previous chapter, you learned that there are four access levels:
// public, protected, package, and private.
// When one class inherits from a parent class, all public and protected members are automatically
// available as part of the child class.
// If the two classes are in the same package, then package members are available to the child class.
// Last but not least, private members are restricted to the class they are defined in and
// are never available via inheritance. This doesn’t mean the parent class can’t have private members
// that can hold data or modify an object; it just means the subclass doesn’t have direct access to them.



public class Jaguar extends BigCat {
    public Jaguar() {
        size = 10.2;
    }

    public void printDetails() {
        System.out.print(size);
    }
}

//Jaguar is a subclass or child of BigCat, making BigCat a superclass or parent of Jaguar. I
// n the Jaguar class, size is accessible because it is marked protected.
//Via inheritance, the Jaguar subclass can read or write size as if it were its own member.
