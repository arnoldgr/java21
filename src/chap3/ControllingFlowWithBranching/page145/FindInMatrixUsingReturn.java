package chap3.ControllingFlowWithBranching.page145;

import java.util.ArrayList;
import java.util.List;

public class FindInMatrixUsingReturn {
    public static void main(String[] args) {
        int[][] list = {{1,13}, {5,21}, {21,2}};
        int val = 21;
        searchForValue(list,val);
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
