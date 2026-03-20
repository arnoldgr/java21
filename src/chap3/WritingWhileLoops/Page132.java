package chap3.WritingWhileLoops;

public class Page132 {
    public static void main(String[] args) {
//        do/while loop
//        Unlike a while loop, though, a do/while loop guarantees that the statement or
//        block will be executed at least once.
//        For example, what is the output of the following statements?
        int lizard = 0;
        do {
            lizard++;
        } while (false);
        System.out.println(lizard);

//        Java will execute the statement block first and then check the loop condition. Even though the loop exits right away, the statement block is still executed once, and the program prints 1.

//        Infinite Loops

        int pen = 2;
        int pigs = 5;
        while (pen < 10)
            pigs++;

//        You may notice one glaring problem with this statement: it will never end. T
//        he variable pen is never modified, so the expression (pen < 10) will always evaluate to true.
//        The result is that the loop will never end, creating what is commonly
//        referred to as an infinite loop.
//        An infinite loop is a loop whose termination condition is never reached during runtime
//        NB: REMEMBER TO TERMINATE
//        As you learn in the last section of this chapter, a loop may also exit under other conditions,
//        such as a break or return statement.


    }
}
