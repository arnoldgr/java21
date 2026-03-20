package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

public class Page105 {
    public static void main(String[] args) {
//        else if
//        Similarly, we can append additional if statements to an else block to arrive at a more refined example:
        Random random = new Random();
        int hourOfDay = random.nextInt();
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
        } else if (hourOfDay < 15) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

//        In this example, the Java process will continue execution until it encounters
//        an if statement that evaluates to true. If neither of the first two expressions is true,
//        it will execute the code of the final else block.


//        What is wrong in the next if statement?

        hourOfDay = 1;
//        if (hourOfDay) {  // DOES NOT COMPILE  hourOfDay in not a boolean
//
//        }

    }
}
