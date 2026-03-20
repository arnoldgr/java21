package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

public class Page108 {
    public static void main(String[] args) {
//reassigning pattern variables
//        While possible, it is a bad practice to reassign a pattern variable since
//        doing so can lead to ambiguity about what is and is not in scope.

        Number number = new Random().nextInt();
//        Number number = 100;

        if (number instanceof Integer data) {
            data = 10;
        }

//        The reassignment can be prevented with a final modifier, but it is
//        better not to reassign the variable at all.

        if (number instanceof final Integer data) {
            //   data = 10;  // DOES NOT COMPILE
        }

//        Pattern Variables and Expressions
//        Pattern matching supports an optional conditional clause, declared as a boolean expression.
//        This can be used to filter data out, such as in the following example:
        printIntegersGreaterThan5(number);

//        Pattern Matching with null
//        The instanceof operator always evaluates null references to false. The same holds for pattern matching.
        String noObjectHere = null;

        if (noObjectHere instanceof String)
            System.out.println("Not printed");

        if (noObjectHere instanceof String s)
            System.out.println("Still not printed");

        if (noObjectHere instanceof String s && s.length() > -1)
            System.out.println("Nope, not this one either");

//        As shown in the last example, this also helps avoid any potential NullPointerException,
//        as the conditional operator (&&) causes the s.length() call to be skipped.
//        Supported Types
//        The type of the pattern variable must be a compatible type, which includes the same type,
//        a subtype, or a supertype of the reference variable.
//        If the reference variable does not refer to a final class or type, then it can also include
//        an unrelated interface for reasons we’ll go into more detail about in Chapter 7, “Beyond Classes.”
//        Consider the following two examples, in which Integer is a subtype of Number:
        Number bearHeight = Integer.valueOf(123);

        if (bearHeight instanceof Integer i) {
        }
        if (bearHeight instanceof Number n) {
        }
//        if (bearHeight instanceof String s) {
//        } // DOES NOT COMPILE
        if (bearHeight instanceof Object o) {
        }

        //        The first example uses a subtype, while the second example uses the same type as the reference
        //        variable bearHeight. On line 15, the compiler recognizes that a Number cannot be
        //        cast to an unrelated type String and throws an error. Line 16 is permitted but not particularly useful,
        //        since every Object except null will return true.
    }

    static void printIntegersGreaterThan5(Number number) {
        if (number instanceof Integer data && data.compareTo(5) > 0)
            System.out.print(data);
    }

//    We can apply a number of filters, or patterns, so that the if statement
//    is executed only in specific circumstances.
//    Notice that we’re using the pattern variable in an expression in the same
//    line in which it is declared

}
