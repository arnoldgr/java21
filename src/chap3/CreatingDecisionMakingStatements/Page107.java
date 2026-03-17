package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

// Pattern matching with if
public class Page107 {
    public static void main(String[] args) {
//        The variable data in this example is referred to as the pattern variable.
//        Notice that this code also avoids any potential ClassCastException because the cast operation
//        is executed only if the instanceof operator returns true.
//        Tne following code shows the anatomy of pattern matching using the instanceof operator and if statements.
//        Adding a variable after the type is what instructs the compiler to treat it as pattern matching.
//        It also shows an optional conditional clause, which is a useful feature that we will cover in the next section.
        Number num = new Random().nextInt();
        Double d  = 2.00;
        printMessage(num);
        printMessage(d);
    }

    static void printMessage(Number tickets) {
        if (tickets instanceof Integer i) {
            System.out.println("Tickets sold: " + i);
        } else if (tickets instanceof Double d && d < 10) {
            System.out.println("Tickets credited: " + d);
        }
    }
}
