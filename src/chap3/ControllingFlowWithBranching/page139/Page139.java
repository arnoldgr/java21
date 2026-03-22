package chap3.ControllingFlowWithBranching.page139;

public class Page139 {
    public static void main(String[] args) {
//        Nested Loops
//        Before we move into branching statements, we need to introduce the concept of
//        nested loops. A nested loop is a loop that contains another loop, including while,
//        do/while, for, and for-each loops. For example, consider the following code that iterates
//        over a two-dimensional array, which is an array that contains other arrays as its members.
//        We cover arrays in detail in Chapter 4, “Core APIs,” but for now, assume the following is
//        how you would declare an array of arrays:

        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i] + "\t");
            }
            System.out.println();
        }

//        Notice that we intentionally mix a for loop and a for -each loop in this example.
//        The outer loop will execute a
//        total of three times.Each time the outer loop executes, the inner loop is executed four times.

//        Nested loops can include while and do/while, as shown in this example.
//        See whether you can determine what this code will output:
        int hungryHippopotamus = 8;
        while (hungryHippopotamus > 0) {
            do {
                hungryHippopotamus -= 2;
            } while (hungryHippopotamus > 5);
            hungryHippopotamus--;
            System.out.print(hungryHippopotamus + ", ");
        }

//        The first time this loop executes, the inner loop repeats until the value of hungryHippopotamus is 4.
//        The value will then be decremented to 3, and that will be the output at the end
//        of the first iteration of the outer loop.
//        On the second iteration of the outer loop, the inner do/while will be executed once,
//        even though hungryHippopotamus is already not greater than 5. As you may recall,
//        do/while statements always execute the body at least once.
//        This will reduce the value to 1, which will be further lowered by the
//        decrement operator in the outer loop to 0. Once the value reaches 0, the outer loop will terminate.


    }
}
