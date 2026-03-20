package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

// Flow Scoping and else Branches
public class Page110 {
    public static void main(String[] args) {

//        If the last code sample confuses you, don’t worry: you’re not alone! Another
//        way to think about it is to rewrite the logic to something equivalent that
//        uses an else statement:
        Number number = new Random().nextInt();
        printOnlyIntegers(number);

//    We can now go one step further and reverse the if and else branches by inverting the
//    boolean expression:
        printOnlyIntegers2(number);

//    Our new code is equivalent to our original and better demonstrates how the
//    compiler was able to determine that data was in scope only when number is an Integer.


    }
    static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        else
            System.out.println(data.intValue());
    }

   static  void printOnlyIntegers2(Number number) {
        if (number instanceof Integer data)
            System.out.println(data.intValue());
        else
            return;
    }



}
