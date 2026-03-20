// Page312.java
package initializingobjects;

// Initializing Objects

public class Page312 {

    static int count = 0;

    {
        // instance initializer
        count++;
        System.out.println("Instance initializer");
    }

    static {
        // static initializer
        System.out.println("Static initializer");
    }

    public Page312() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {

        new Page312();
        new Page312();
    }
}

/*
Order of execution:

1. Static initializer (once)
2. Instance initializer
3. Constructor

Runs for each object created
*/