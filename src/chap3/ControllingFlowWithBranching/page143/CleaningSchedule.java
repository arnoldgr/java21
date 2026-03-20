package chap3.ControllingFlowWithBranching.page143;

public class CleaningSchedule {
    public static void main(String[] args) {
//        You may notice that the syntax of the continue statement mirrors that of the break statement.
//        In fact, the statements are identical in how they are used, but with different results.
//        While the break statement transfers control to the enclosing statement, the continue statement
//        transfers control to the boolean expression that determines if the loop should continue.
//        In other words, it ends the current iteration of the loop. Also, like the break statement,
//        the continue statement is applied to the nearest inner loop under execution, using optional
//        label statements to override this behavior.
//        Let’s take a look at an example. Imagine we have a zookeeper who is supposed to clean the
//        first leopard in each of four stables but skip stable b entirely.

        CLEANING:
        for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard <= 3; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue CLEANING;
                    //continue;
                }
                System.out.println("Cleaning: " + stables + "," + leopard);
            }
        }

//        With the structure as defined, the loop will return control to the parent loop
//        any time the first value is b or the second value is 2.
//        On the first, third, and fourth executions of the outer loop,
//        the inner loop prints a statement exactly once and then exits on the next inner
//        loop when leopard is 2. On the second execution of the outer loop, the inner loop
//        immediately exits without printing anything since b is encountered right away.

//        Now, imagine we remove the CLEANING label in the continue statement so that control is returned to the inner loop instead of the outer. Line 6 becomes the following:
//        6:                continue;
//
//        This corresponds to the zookeeper cleaning all leopards except those labeled 2 or in stable b. The output is then the following:
//        Cleaning: a,1
//        Cleaning: a,3
//        Cleaning: c,1
//        Cleaning: c,3
//        Cleaning: d,1
//        Cleaning: d,3

//        Finally, if we remove the continue statement and the associated if statement altogether by removing lines 5–7, we arrive at a structure that outputs all the values, such as this:
//        Cleaning: a,1
//        Cleaning: a,2
//        Cleaning: a,3
//        Cleaning: b,1
//        Cleaning: b,2
//        Cleaning: b,3
//        Cleaning: c,1
//        Cleaning: c,2
//        Cleaning: c,3
//        Cleaning: d,1
//        Cleaning: d,2
//        Cleaning: d,3
    }
}
