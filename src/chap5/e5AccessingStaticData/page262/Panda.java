package chap5.AccessingStaticData.page262;

//The rules for static final variables are similar to instance final variables,
// except they do not use static constructors (there is no such thing!)
// and use static initializers instead of instance initializers.
public class Panda {
    final static String name = "Ronda";
    static final int bamboo;
//    static final double height; // DOES NOT COMPILE
    static { bamboo = 5;}
}

//The name variable is assigned a value when it is declared,
// while the bamboo variable is assigned a value in a static initializer.
// The height variable is not assigned a value anywhere in the class definition,
// so that line does not compile. Remember, final variables must be initialized with a value.
// Next, we cover static initializers.
