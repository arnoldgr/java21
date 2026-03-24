package chap5.DesigningMethods.page239;

public class Measurement {
    int getHeight1() {
        int temp = 9;
        return temp;
    }
//    int getHeight2() {
//        int temp = 9L;  // DOES NOT COMPILE
//        return temp;
//    }
//    int getHeight3() {
//        long temp = 9L;
//        return temp;    // DOES NOT COMPILE
//    }
}
//The getHeight2() method doesn’t compile because you can’t assign a long to an int.
// The getHeight3() method doesn’t compile because you can’t return a long value as an int.
// If this wasn’t clear to you, you should go back to Chapter 2, “Operators,” and reread
// the sections about numeric types and casting.
