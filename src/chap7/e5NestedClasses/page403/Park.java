package chap7.e5NestedClasses.page403;

// Creating a static Nested Class
// A static nested class is a static type defined at the member level.
// Unlike an inner class, a static nested class can be instantiated without an instance of the enclosing class.
// The trade-off, though, is that it can’t access instance variables or methods declared in the outer class.
// In other words, it is like a top-level class except for the following:

//The nesting creates a namespace because the enclosing class name must be used to refer to it.
//It can additionally be marked private or protected.
//The enclosing class can refer to the fields and methods of the static nested class.

//Let’s take a look at an example:
public class Park {
    static class Ride {
        private int price = 6;
    }

    public static void main(String[] args) {
        var ride = new Ride();
        System.out.println(ride.price);
    }
}


//Line 6 instantiates the nested class.
// Since the class is static, you do not need an instance of Park to use it.
// You are allowed to access private instance variables, as shown on line 7.

