package chap3.ConstructingForLoops;

public class Page136 {
    public static void main(String[] args) {
//        Using Incompatible Data Types in the Initialization Block
//        int x = 0;
//        for (long y = 0, int z = 4; x < 5; x++)  // DOES NOT COMPILE
//        System.out.print(y + " ");

//        Like the third example, this code will not compile, although this time for a different reason.
//        The variables in the initialization block must all be of the same type.

//        In the multiple-terms example, y and z were both long, so the code compiled without issue;
//        but in this example, they have different types, so the code will not compile.

//      Using Loop Variables Outside the Loop
        for (long y = 0, x = 4; x < 5 && y < 10; x++, y++)
            System.out.print(y + " ");
       // System.out.print(x);  // DOES NOT COMPILE

//        We covered this already at the start of this section, but it is so important
//        for passing the exam that
//        we discuss it again here.If you notice, x is defined in the initialization block
//        of the loop and then used
//        after the loop terminates.Since x was scoped only for the loop, using it outside
//        the loop will cause a compiler
//        error.

    }
}
