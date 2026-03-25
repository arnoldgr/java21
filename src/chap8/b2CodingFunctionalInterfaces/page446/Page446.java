package chap8.b2CodingFunctionalInterfaces.page446;

//The @FunctionalInterface Annotation
//
//The @FunctionalInterface annotation tells the compiler that you intend for the code
// to be a functional interface.
// If the interface does not follow the rules for a functional interface, the compiler will give you an error.


//@FunctionalInterface  // DOES NOT COMPILE
interface Dance {
    void move();

    void rest();
}

// Java includes @FunctionalInterface on some, but not all, functional interfaces.
// This annotation means the authors of the interface promise it will be safe to use in a
// lambda in the future.
// However, just because you don’t see the annotation doesn’t mean it’s not a functional interface.
// Remember that having exactly one abstract method is what makes it a functional interface, not the annotation.
@FunctionalInterface
interface Sprint {
    public void sprint(int speed);
}

//Consider the following four interfaces.
// Given our previous Sprint functional interface, which of the following are functional interfaces?
interface Dash extends Sprint {
}

interface Skip extends Sprint {
    void skip();
}

interface Sleep {
    private void snore() {
    }

    default int getZzz() {
        return 1;
    }
}

interface Climb {
    void reach();

    default void fall() {
    }

    static int getBackUp() {
        return 100;
    }

    private static boolean checkHeight() {
        return true;
    }
}


//All four of these are valid interfaces, but not all of them are functional interfaces.
// The Dash interface is a functional interface because it extends the Sprint interface and
// inherits the single abstract method sprint().

// The Skip interface is not a valid functional interface because it has two abstract methods:
// the inherited sprint() method and the declared skip() method.

//The Sleep interface is also not a valid functional interface.
// Neither snore() nor getZzz() meets the criteria of a single abstract method.
// Even though default methods function like abstract methods,
// in that they can be overridden in a class implementing the interface,
// they are insufficient for satisfying the single abstract method requirement.

//Finally, the Climb interface is a functional interface.
// Despite defining a slew of static, private, and default methods,
// it contains only one abstract method: reach().
