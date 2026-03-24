package chap6.inheritingmembers.page334;

//Creating Constructors in Abstract Classes
//Even though abstract classes cannot be instantiated, they are still initialized through constructors
// by their subclasses. For example, consider the following program:
abstract class Mammal {
    abstract CharSequence chew();
    public Mammal() {
        System.out.println(chew());  // Does this line compile?
    }
}

public class Platypus extends Mammal {
    String chew() { return "yummy!"; }
    public static void main(String[] args) {
//        new Platypus();
    }
}

//Using the constructor rules you learned about earlier in this chapter, the compiler
// inserts a default no-argument constructor into the Platypus class,
// which first calls super() in the Mammal class.
// The Mammal constructor is only called when the abstract class is being initialized
// through a subclass; therefore, there is an implementation of chew() at the time the
// constructor is called. This code compiles and prints yummy! at runtime.
//For the exam, remember that abstract classes are initialized with constructors
// in the same way as non-abstract classes. For example, if an abstract class does not provide
// a constructor, the compiler will automatically insert a default no-argument constructor.
//The primary difference between a constructor in an abstract class and a
// non-abstract class is that a constructor in an abstract class can be called only when it is
// being initialized by a non-abstract subclass. This makes sense, as abstract classes cannot be instantiated.

