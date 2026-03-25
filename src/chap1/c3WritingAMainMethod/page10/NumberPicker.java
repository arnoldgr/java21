package chap1.c3WritingAMainMethod.page10;

import java.util.Random;
public class NumberPicker {
    public static void main(String[] args) {
        Random r = new Random();   // DOES NOT COMPILE
        System.out.println(r.nextInt(10));
    }
}

/*Java comes with thousands of built-in classes, and there are countless more from developers like you.
 With all those classes, Java needs a way to organize them.
 It handles this in a way similar to a file cabinet.
 You put all your pieces of paper in folders. Java puts classes in packages. These are logical groupings for classes.

  A statement is an instruction, and import statements tell Java which packages to look in for classes.
  Since you didn’t tell Java where to look for Random, it has no clue.

 */
