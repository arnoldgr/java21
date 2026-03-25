package chap7.e5NestedClasses.page406;

// Writing a Local Class
// A local class is a nested class defined within a method.
// Like local variables, a local class declaration does not exist until the method is invoked,
// and it goes out of scope when the method returns.
// This means you can create instances only from within the method.
// Those instances can still be returned from the method. This is just how local variables work.

//Local classes are not limited to being declared only inside methods.
// For example, they can be declared inside constructors and initializers.
// For simplicity, we limit our discussion to methods in this chapter.

//Local classes have the following properties:

//Do not have an access modifier.
//Can be declared final or abstract.
//Can include instance and static members.
//Have access to all fields and methods of the enclosing class (when defined in an instance method).
//Can access final and effectively final local variables.

//Remember when we presented effectively final in Chapter 5? Well,
// we said it would come in handy later, and it’s later!
// If you need a refresher on final and effectively final,
// turn back to Chapter 5 now.
// Don’t worry; we’ll wait!

//Ready for an example? Here’s a complicated way to multiply two numbers:

public class PrintNumbers {
    private int length = 5;

    public void calculate() {
        final int width = 20;
        class Calculator {
            public void multiply() {
                System.out.print(length * width);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }

    public static void main(String[] args) {
        var printer = new PrintNumbers();
        printer.calculate();  // 100
    }

    //    Earlier, we made the statement that local variable references are allowed
//    if they are final or effectively final. As an illustrative example, consider the following:
    public void processData() {
        final int length = 5;
        int width = 10;
        int height = 2;
        class VolumeCalculator {
//            public int multiply() {
//               return length * width * height; // DOES NOT COMPILE NB; comment out line 59
//            }
        }
        width = 2;
    }

//    The length and height variables are final and effectively final, respectively,
//    so neither causes a compilation issue.
//    On the other hand, the width variable is reassigned during the method,
//    so it cannot be effectively final. For this reason, the local class declaration does not compile.

}

//Lines 35–39 are the local class.
// That class’s scope ends on line 42, where the method ends.
// Line 37 refers to an instance variable and a final local variable,
// so both variable references are allowed from within the local class.

