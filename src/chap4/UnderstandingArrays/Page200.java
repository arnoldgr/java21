package chap4.UnderstandingArrays;

public class Page200 {

    public static void main(String[] args) {
//        Consider this one:
        int[][] differentSizes = {{1, 4}, {3}, {9, 8, 7}};

//        We still start with an array of three elements.
//        However, this time the elements in the next level are all different sizes.
//        One is of length 2, the next length 1, and the last length 3.

//        An asymmetric array of arrays
//        Another way to create an asymmetric array is to initialize just an array’s
//        first dimension and define the size of each array component in a separate statement.
        int[][] args2 = new int[2][];
        args2[0] = new int[5];
        args2[1] = new int[3];

//        This technique reveals what you really get with Java:
//        arrays of arrays that, properly managed, could look like a matrix.
    }
}
