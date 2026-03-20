package chap4.CalculatingWithMathsAPI;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Page205 {
    public static void main(String[] args) {
//        When to use BigInteger and BigDecimal

//        In the real world, you would use BigInteger to handle integer values
//        that don’t fit within int or long, such as in the following example.


        System.out.println(new BigInteger("12345123451234512345"));
//        System.out.println(12345123451234512345L);  // DOES NOT COMPILE


//        Likewise, BigDecimal is for larger values that don’t fit within float or double.
//        It is often used for small values that involve money.
//        Why? Well, sometimes floating point numbers are stored in memory in unexpected ways.
//        Consider the following example.


        double amountInCents1 = 64.1 * 100;
        System.out.println(amountInCents1);  // 6409.999999999999

        float amountInCents2 = 64.1f * 100;
        System.out.println(amountInCents1);  // 6409.999999999999


//        The difference between the expected value and actual value is
//        referred to as the floating-point error.
//        Oftentimes, these errors don’t significantly change the result of an operation,
//        but it would be bad to do so when working with money!
//        We can fix this by using BigDecimal instead.


        BigDecimal amountInCents3 = BigDecimal.valueOf(64.1)
                .multiply(BigDecimal.valueOf(100));
        System.out.println(amountInCents3);  // 6410.0
    }
}
