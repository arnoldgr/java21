package chap2.ComparingValues;

//Comparing values
public class Page84 {
    // Invalid instanceof
    // One area the exam might try to trip you up on is using instanceof with incompatible types.
    // For example, Number cannot possibly hold a String value,
    // so the following causes a compilation error:
    public void openZoo(Number time) {
        //if(time instanceof String) // DOES NOT COMPILE, cannot use instanceof with incompatible types
        System.out.print(time);
        //If the compiler can determine that a variable cannot possibly be cast to a specific class,
        //it reports an error.
    }

    public static void main(String[] args) {
//        null and the instanceof operator
//        What happens if you call instanceof on a null variable? For the exam,
//        you should know that calling instanceof on the null literal or a null
//        reference always returns false.
        System.out.print(null instanceof Object);          // false

        String noObjectHere = null;
        System.out.print(noObjectHere instanceof String);  // false

//        The preceding examples both print false.It almost doesn’t matter what the right side of the expression is.We say “
//        almost”because there are exceptions.This example does not compile, since null is used on the right side of the instanceof
//        operator:
//        System.out.print(null instanceof null);  // DOES NOT COMPILE
    }
}

