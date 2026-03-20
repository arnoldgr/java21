package chap3.ConstructingForLoops;

public class Page134 {
    public static void main(String[] args) {
//        Printing Elements in Reverse
//        Let’s say you wanted to print the same first five numbers from zero as
//        we did in the previous section, but this time in reverse order.
//        The goal then is to print 4 3 2 1 0.
//        How would you do that? An initial implementation might look like the following:
        for (var counter = 5; counter > 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();

//        While this snippet does output five distinct values, and it resembles our first
//        for loop example, it does not output the same five values. Instead, this is the output:
//        5 4 3 2 1

//        Wait, that’s not what we wanted! We wanted 4 3 2 1 0.
//        It starts with 5, because that is the first value assigned to it.
//        Let’s fix that by starting with 4 instead:
        for (var counter = 4; counter> 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
//
//        What does this print now? It prints the following:
//        4 3 2 1

//        So close! The problem is that it ends with 1, not 0,
//        because we told it to exit as soon as the value was not strictly greater than 0.
//        If we want to print the same 0 through 4 as our first example, we need to update the termination condition, like this:
        for (var counter = 4; counter >= 0; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
        //Finally! We have code that now prints 4 3 2 1 0 and matches the reverse
        // of our for loop example in the previous section.
        // We could have instead used counter > -1 as the loop termination condition
        // in this example, although counter >= 0 tends to be more readable.

    }
}
