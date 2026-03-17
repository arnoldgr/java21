package chap2.WorkingWithBinaryArithmeticOperators;
//Division and Modulus operators
public class Page72 {
    public static void main(String[] args) {
        System.out.println(9 / 3);   // 3
        System.out.println(9 % 3);   // 0

        System.out.println(10 / 3);  // 3
        System.out.println(10 % 3);  // 1

        System.out.println(11 / 3);  // 3
        System.out.println(11 % 3);  // 2

        System.out.println(12 / 3);  // 4
        System.out.println(12 % 3);  // 0
    }
}
/*Be sure to understand the difference between arithmetic division and modulus.
 For integer values, division results in the floor value of the nearest integer that fulfills the operation,
 whereas modulus is the remainder value. If you hear the phrase floor value,
 it just means the value without anything after the decimal point.
 For example, the floor value is 4 for each of the values 4.0, 4.5, and 4.9999999

 */
