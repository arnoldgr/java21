package chap7.a1ImplementingInterfaces.page373;

//Private Interface Method Definition Rules

//A private interface method must be marked with the private modifier and include a method body.
//A private static interface method may be called by any method within the interface definition.
//A private interface method may only be called by default and other private non-static methods within the interface definition.

//Another way to think of it is that a private interface method is only accessible to non-static methods
// defined within the interface. A private static interface method, on the other hand,
// can be accessed by any method in the interface.
// For both types of private methods, a class inheriting the interface cannot directly invoke them.

//see table 7.2 in the book.
//here are some quick tips for the exam:

//Treat abstract, default, and non-static private methods as belonging to an instance of the interface.
//Treat static methods and variables as belonging to the interface class object.
//All private interface method types are only accessible within the interface declaration.

//Using these rules, which of the following methods do not compile?
interface ZooTrainTour {
    abstract int getTrainName();

    private static void ride() {
    }

    default void playHorn() {
        getTrainName();
        ride();
    }

//    public static void slowDown() {
//        playHorn();
//    }

    static void speedUp() {
        ride();
    }
}

//The ride() method is private and static, so it can be accessed by any default or static method within the
// interface declaration.
// The getTrainName() is abstract, so it can be accessed by a default method associated with the instance.
// The slowDown() method is static, though, and cannot call a default or private method,
// such as playHorn(), without an explicit reference object.
// Therefore, the slowDown() method does not compile.
//Give yourself a pat on the back! You just learned a lot about interfaces,
// probably more than you thought possible. Now take a deep breath. Ready?
// The next type we are going to cover is enums.
