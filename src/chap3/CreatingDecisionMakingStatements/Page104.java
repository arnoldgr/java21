package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

//if statement
public class Page104 {
    public static void main(String[] args) {
        Random random = new Random();
        int hourOfDay = random.nextInt();
        int morningGreetingCount = 0;
//    Watch Indentation and Braces
//
//    One area where the exam writers will try to trip you up is if statements without braces ({}).
//    For example, take a look at this slightly modified form of our example:
        if (hourOfDay < 11)
            System.out.println("Good Morning");
        morningGreetingCount++;  // not part of the if statement, indentation is a trick in the exam

//        Based on the indentation, you might be inclined to think the variable
//        morningGreetingCount is only going to be incremented if hourOfDay is less than 11,
//        but that’s not what this code does.
//        It will execute the print statement only if the condition is met,
//        but it will always execute the increment operation. Remember that in Java, unlike some other programming languages,
//        tabs are just whitespace and are not evaluated as part of the execution.
//        When you see a control flow statement in a question, be sure to trace the
//        open and close braces of the block, ignoring any indentation you may come across.

//        The else statement
//        What if we want to display a different message if it is 11 a.m. or later? Can we do
//        it using only the tools we have? Of course we can!

        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        }
        if (hourOfDay >= 11) {
            System.out.println("Good Afternoon");
        }

//        This seems a bit redundant, though, since we’re performing an evaluation on hourOfDay twice.
//        Luckily, Java offers us a more useful approach in the form of an else statement
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else System.out.println("Good Afternoon");

//        Now our code is truly branching between one of the two possible options,
//        with the boolean evaluation happening only once. The else operator takes
//        a statement or block of statements, in the same manner as the if statement. Similarly, we can append additional if statements to an else block to arrive at a more refined example:
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }
//        In this example, the Java process will continue execution until it encounters an
//        if statement that evaluates to true. If neither of the first two expressions is true,
//        it will execute the code of the final else block.


    }
}
