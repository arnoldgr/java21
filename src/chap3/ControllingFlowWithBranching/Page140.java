package chap3.ControllingFlowWithBranching;

public class Page140 {
    public static void main(String[] args) {
//        if statements, switch statements, and loops is that they can all have optional labels.
//        A label is an optional pointer to the head of a statement that allows the application
//        flow to jump to it or break from it. It is a single identifier that is followed by a colon (:).
//        For example, we can add optional labels to one of the previous examples:

        int[][] myComplexArray = {{5,2,1,3}, {3,9,8,9}, {5,7,12,7}};

        OUTER_LOOP:  for (int[] mySimpleArray : myComplexArray) {
            INNER_LOOP:  for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }

//        Labels follow the same rules for formatting as identifiers.
//        For readability, we show them in snake_case, with uppercase letters
//        and underscores between words. When dealing with only one loop, labels
//        do not add any value
    }

}
