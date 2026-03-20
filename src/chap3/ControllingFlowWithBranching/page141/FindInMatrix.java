package chap3.ControllingFlowWithBranching.page141;

//The break Statement
//As you saw when working with switch statements, a break statement transfers
// the flow of control out to the enclosing statement.
// The same holds true for a break statement that appears inside of a while, do/while,
// or for loop, as it will end the loop early,

public class FindInMatrix {
    public static void main(String[] args) {
//        the break statement can take an optional label parameter.
//        Without a label parameter, the break statement will terminate the
//        nearest inner loop it is currently in the process of executing.
//        The optional label parameter allows us to break out of a higher-level outer loop.
//        In the following example, we search for the first (x, y) array index position
//        of a number within an unsorted two-dimensional array:

        int[][] list = {{1, 13}, {5, 2}, {2, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break PARENT_LOOP;
                    //break;
                }
            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.print("Value " + searchValue + " not found");
        } else {
            System.out.print("Value " + searchValue + " found at: " +
                    "(" + positionX + "," + positionY + ")");
        }
    }
}
