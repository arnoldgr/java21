package chap6.variables;

// Working with Variables in Lambdas

public class Page386 {

    public static void main(String[] args) {

        int x = 10;

        // Allowed: x is effectively final
        Runnable r = () -> {
            System.out.println(x);
        };

        r.run();

        // x = 20; // DOES NOT COMPILE
    }
}

/*
IMPORTANT RULE:

Variables used inside lambda must be:
- final OR
- effectively final (never changed)

This WILL NOT compile:

int x = 10;
x = 20;
Runnable r = () -> System.out.println(x);

-------------------------------------

Allowed inside lambda:
- instance variables
- static variables

Only local variables must be effectively final
*/