package chap4.UnderstandingArrays;

public class Page201 {
    public static void main(String[] args) {
//        Using an Array of Arrays
//        The most common operation on an array of arrays is to loop through it.
//
//        This example prints out a 2D array:
        var twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++)
                System.out.print(twoD[i][j] + " "); // print element
            System.out.println();                  // time for a new row
        }

//        We have two loops here. The first uses index i and goes through the top-level array for twoD. The second uses a different loop variable, j. It is important that these be different variable names so the loops don’t get mixed up. The inner loop looks at how many elements are in the second-level array. The inner loop prints the element and leaves a space for readability. When the inner loop completes, the outer loop goes to a new line and repeats the process for the next element.
//        This entire exercise would be easier to read with the enhanced for loop.

        for (int[] inner : twoD) {
            for (int num : inner)
                System.out.print(num + " ");
            System.out.println();
        }

//        We’ll grant you that it isn’t fewer lines, but each line is less complex, and there aren’t any loop variables or terminating conditions to mix up.
    }
}
