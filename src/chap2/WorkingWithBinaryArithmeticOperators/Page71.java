package chap2.WorkingWithBinaryArithmeticOperators;

//changing order of precedence with parenthesis
public class Page71 {
    public static void main(String[] args) {
        //  Let’s return to the previous price example. The following code snippet contains the same values and operators, in the same order, but with two sets of parentheses added:
        int price = 2 * ((5 + 3) * 4 - 8);

        // This time you would evaluate the addition operator 5 + 3, which reduces the expression to the following:
        price =2*(8*4-8);

        //  You can further reduce this expression by multiplying the first two values within the parentheses.
        price =2*(32-8);

        //  Next, you subtract the values within the parentheses before applying terms outside the parentheses.
        price =2*24;

        //  Finally, you would multiply the result by 2, resulting in a value of 48 for price.

        //Verifying Parentheses Syntax
        //When working with parentheses, you need to make sure they are always valid and balanced. Consider the following examples:
//        long pigeon = 1 + ((3 * 5) / 3;       // DOES NOT COMPILE
//        int blueJay = (9 + 2) + 3) / (2 * 4;  // DOES NOT COMPILE

        // The first example does not compile because the parentheses are not balanced.
        // There is a left parenthesis with no matching right parenthesis.
        // The second example has an equal number of left and right parentheses, but they are not balanced properly.
        // When reading from left to right, a new right parenthesis must match a previous left parenthesis.
        // Likewise, all left parentheses must be closed by right parentheses before the end of the expression.

        // Let’s try another example:
        // short robin = 3 + [(4 * 2) + 4];      // DOES NOT COMPILE

        // This example does not compile because Java, unlike some other programming languages, does not allow brackets, []

    }

}
