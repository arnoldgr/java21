package chap3.ControllingFlowWithBranching.page145;

import java.util.ArrayList;
import java.util.List;

public class FindInMatrixUsingReturn {
    public static void main(String[] args) {

        //1st search
        int[][] list = { { 1, 13 }, { 5, 2 }, { 2, 2 } };
        int searchValue = 21;
        int[] results = searchForValue(list,searchValue);

        if (results == null) {
            System.out.println("Value " + searchValue + " not found");
        } else {
            System.out.println("Value " + searchValue + " found at: " +
                    "(" + results[0] + "," + results[1] + ")");
        }
//        This class is functionally the same as the first FindInMatrix class
//        we saw earlier using break. If you need finer-grained control of the
//        loop with multiple break and continue statements, the first class is
//        probably better. That said, we find code without labels and break statements
//        a lot easier to read and debug. Also, making the search logic an independent
//        function makes the code more reusable and the calling main() method a lot easier to read.
//        For the exam, you will need to know both forms. Just remember that return statements
//        can be used to exit loops quickly and can lead to more readable code in practice,
//        especially when used with nested loops.



    }
    private static int[] searchForValue(int[][] list, int v) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == v) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
