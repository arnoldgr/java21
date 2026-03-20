package chap2.UnderstandingJavaOperators;

public class Page64 {
    //Java operators are not necessarily evaluated from left-to-right order.
    // In this following example, the second expression is actually evaluated from right to left,
    // given the specific operators involved:

    public static void main(String[] args) {
        int cookies = 4;
        double reward = 3 + 2 * --cookies;
        System.out.print("Zoo animal receives: "+reward+" reward points");
    }
}
