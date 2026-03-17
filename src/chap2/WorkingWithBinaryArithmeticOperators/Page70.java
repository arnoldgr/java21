package chap2.WorkingWithBinaryArithmeticOperators;
//Arithmetic operators
public class Page70 {
    public static void main(String[] args) {
        int price = 2 * 5 + 3 * 4 - 8; //
        System.out.println(price);
    }
}
/*First, you evaluate the 2 * 5 and 3 * 4, which reduces the expression to this:
int price = 10 + 12 - 8;
Then, you evaluate the remaining terms in left-to-right order, resulting in a value of price being 14.
Make sure you understand why the result is 14 because you will likely see this kind of operator precedence
question on the exam.
 */




