package chap6.declaringconstructors.page304;

//Let’s take a quick look at how to call these constructors:
public class RabbitsMultiply {
    public static void main(String[] args) {
        var r1 = new Rabbit3();
        var r2 = new Rabbit4();
        var r3 = new Rabbit5(true);
//        var r4 = new Rabbit6();  // DOES NOT COMPILE constructor is private
    }
}

//Line 6 calls the generated default no-argument constructor.
// Lines 7 and 8 call the user-provided constructors.
// Line 9 does not compile. Rabbit4 made the constructor private so that other classes could not call it.
//Having only private constructors in a class tells the compiler not to provide a default no-argument constructor.
// It also prevents other classes from instantiating the class.
// This is useful when a class has only static methods or the developer wants to
// have full control of all calls to create new instances of the class.




