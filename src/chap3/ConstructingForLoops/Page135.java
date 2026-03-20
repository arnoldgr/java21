package chap3.ConstructingForLoops;

public class Page135 {
    public static void main(String[] args) {
//    Creating an Infinite Loop
//        for (; ; )
//            System.out.println("Hello World");
//        Although this for loop may look like it does not compile, it will in fact
//        compile and run without issue. It is actually an infinite loop that will
//        print the same statement repeatedly. This example reinforces the fact that
//        the components of the for loop are each optional. Note that the semicolons
//        separating the three sections are required, as for() without any semicolons will not compile.

//    Adding Multiple Terms to the for Statement
        int x = 0;
        for (long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x + " ");

//        This code demonstrates three variations of the for loop you may not have seen.
//        First, you can declare a variable, such as x in this example, before the loop begins
//        and use it after it completes. Second, your initialization block, boolean expression,
//        and update statements can include extra variables that may or may not reference each
//        other. For example, z is defined in the initialization block and is never used.
//        Finally, the update statement can modify multiple variables.
//        This code will print the following when executed:
//        0 1 2 3 4 5

//        Redeclaring a Variable in the Initialization Bloc

//        x = 0;
//        for (x = 4; x < 5; x++)   // DOES NOT COMPILE
//            System.out.print(x + " ");
//        x = 0;

//        This example looks similar to the previous one, but it does not compile because of the
//        initialization block.
//        The difference is that the declaration of x is repeated in the initialization block after
//        already being declared before the loop, resulting in the compiler stopping because of a
//        duplicate variable declaration. We can fix this loop by removing the declaration of x
//        from the for loop as follows:
        System.out.println();
        x = 0;
        for (; x < 5; x++)
            System.out.print(x + " ");
    }
}
