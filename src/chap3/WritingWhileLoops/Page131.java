package chap3.WritingWhileLoops;

public class Page131 {
    public static void main(String[] args) {
//        One thing to remember is that a while loop may terminate after its first
//        evaluation of the boolean expression. For example, how many times is Not full!
//        printed in the following example?
        int full = 5;
        while (full < 5) {
            System.out.println("Not full!");
            full++;
        }

//        The answer? Zero! On the first iteration of the loop, the condition is reached,
//        and the loop exits. This is why while loops are often used in places where you
//        expect zero or more executions of the loop. Simply put, the body of the loop may
//        not execute at all.

    }
}
