package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page468;

import java.util.function.Consumer;

//Lambda bodies are allowed to reference some variables from the surrounding code. The following code is legal:

class Crow {
    private String color;

    public void caw(String name) {
        String volume = "loudly";
        Consumer<String> consumer = s ->
                System.out.println(name + " says "
                        + volume + " that she is " + color);
    }
}

//This shows that a lambda can access an instance variable, method parameter,
// or local variable under certain conditions. Instance variables (and class variables) are always allowed.
//The only thing lambdas cannot access are variables that are not final or effectively final.
// If you need a refresher on effectively final, see Chapter 5, “Methods.”
//It gets even more interesting when you look at where the compiler errors occur when the variables are
// not effectively final.
//
//        public class Crow {
//            private String color;
//
//            public void caw(String name) {
//                String volume = "loudly";
//                name = "Caty";
//                color = "black";
//
//                Consumer<String> consumer = s ->
//                        System.out.println(name + " says "       // DOES NOT COMPILE
//                      +volume + " that she is " + color);  // DOES NOT COMPILE
//                volume = "softly";
//            }
//        }

//In this example, the method parameter name is not effectively final because it is set on line 6.
// However, the compiler error occurs on line 10. It’s not a problem to assign a value to a non-final variable.
// However, once the lambda tries to use it, we do have a problem.
// The variable is no longer effectively final, so the lambda is not allowed to use the variable.
//The variable volume is not effectively final either since it is updated on line 12. In this case,
// the compiler error is on line 11. That’s before the reassignment!
// Again, the act of assigning a value is only a problem from the point of view of the lambda.
// Therefore, the lambda has to be the one to generate the compiler error.

//Rules for accessing a variable from a lambda body inside a method

//Instance variable   : Allowed
//Static variable     : Allowed
//Local Variable      : Allowed only if final or effectively final
//Method parameter    : Allowed only if final or effectively final
//Lambda parameter    : Allowed