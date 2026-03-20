package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

public class Page102 {
    //The if statement
    public static void main(String[] args) {

//        These statements can be applied to single expressions as well as a block of Java code.
        int patrons = 0;
        Random random = new Random();
        int ticketsTaken = random.nextInt();
// Single statement
        if (ticketsTaken> 1)
            patrons++;

// Statement inside a block
        if (ticketsTaken> 1) {
            patrons++;
        }

        int morningGreetingCount = 0;
        int hourOfDay = random.nextInt();
        if (hourOfDay < 11) {
            System.out.println("Good Morning");
            morningGreetingCount++;
        }


    }
}
