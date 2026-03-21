package chap5.AccessingStaticData.page257;

public class Koala {
    public static int count = 0;               // static variable

    public static void main(String []args) {   // static method
        System.out.print(count);
    }
}

//In addition to main() methods, static methods have two main purposes:
//
//For utility or helper methods that don’t require any object state.
// Since there is no need to access instance variables, having static methods
// eliminates the need for the caller to instantiate an object just to call the method.
//For state that is shared by all instances of a class,
// like a counter. All instances must share the same state.
// Methods that merely use that state should be static as well.
//
//In the following sections, we look at some examples covering other static concepts.
