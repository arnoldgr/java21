package chap6.initializingobjects.page318;

//Ready for a more difficult example, the kind you might see on the exam? What does the following output?
class GiraffeFamily {
    static {
        System.out.print("A");
    }

    {
        System.out.print("B");
    }

    public GiraffeFamily(String name) {
        this(1);
        System.out.print("C");
    }

    public GiraffeFamily() {
        System.out.print("D");
    }

    public GiraffeFamily(int stripes) {
        System.out.print("E");
    }
}

public class Okapi extends GiraffeFamily {
    static {
        System.out.print("F");
    }

    public Okapi(int stripes) {
        super("sugar");
        System.out.print("G");
    }

    {
        System.out.print("H");
    }

    public static void main(String[] grass) {
        new Okapi(1);
        System.out.println();
        new Okapi(2);
    }
}


//The program prints the following:
//AFBECHG
//BECHG

//Let’s walk through it. Start with initializing the Okapi class.
// Since it has a superclass GiraffeFamily, initialize it first, printing A on line 6.
// Next, initialize the Okapi class, printing F on line 29.
//After the classes are initialized, execute the main() method on line 41.
// The first line of the main() method creates a new Okapi object, triggering the instance initialization process.
// Per the second rule, the superclass instance of GiraffeFamily is initialized first.
// Per our fourth rule, the instance initializer in the superclass GiraffeFamily is called, and B is printed on line 10.
// Per the fifth rule, we initialize the constructors. In this case, this involves calling the constructor on line 13,
// which in turn calls the overloaded constructor on line 22.
// The result is that EC is printed, as the constructor bodies are unwound in the reverse order that they were called.
//The process then continues with the initialization of the Okapi instance itself.
// Per the fourth and fifth rules, H is printed on line 38, and G is printed on line 34, respectively.
// The process is a lot simpler when you don’t have to call any overloaded constructors.
// Line 43 then inserts a line break in the output.
// Finally, line 44 initializes a new Okapi object. The order and initialization are the same as line 42,
// sans the class initialization, so BECHG is printed again.
// Notice that D is never printed, as only two of the three constructors in the superclass GiraffeFamily are called.
//This example is tricky for a few reasons.
// There are multiple overloaded constructors, lots of initializers, and a complex constructor pathway to keep track of.
// Luckily, questions like this are uncommon on the exam. If you see one,
// just write down what is going on as you read the code.

//We conclude this section by listing important rules you should know for the exam:

//A class is initialized at most once by the JVM before it is referenced or used.
//All static final variables must be assigned a value exactly once, either when they are declared or in a static initializer.
//All final fields must be assigned a value exactly once, either when they are declared, in an instance initializer, or in a constructor.
//Non-final static and instance variables defined without a value are assigned a default value based on their type.
//The order of initialization is as follows: variable declarations, then initializers, and finally constructors.
