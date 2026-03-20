package chap2.WorkingWithBinaryArithmeticOperators;

//division and modulus with negative numbers
public class Page73 {
    public static void main(String[] args) {
        System.out.println(2 % 5);   // 2
        System.out.println(7 % 5);   // 2
        System.out.println(2 % -5);  // 2
        System.out.println(7 % -5);  // 2

        System.out.println(-2 % 5);  // -2
        System.out.println(-7 % 5);  // -2
        System.out.println(-2 % -5); // -2
        System.out.println(-7 % -5); // -2
    }
}
/*You can also use modulus with negative numbers. If the divisor is negative, then the negative sign is ignored.
Negative values do change the behavior of modulus when applied to the dividend, though.
For example, if the divisor is 5, then the modulus value of a negative number is between -4 and 0.

 */
