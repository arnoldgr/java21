package chap4.CalculatingWithMathsAPI;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Page204 {
    public static void main(String[] args) {

//    Using BigInteger and BigDecimal
//    All of the Math APIs in the previous section used java primitive types.
//    However, these are not always precise enough.
//    Especially when dealing with money or large numbers.
//    Luckily, Java has built in classes called BigInteger and BigDecimal
//    that can handle values that don’t fit into the primitive numeric types.
//    Like String, these classes are immutable so you chain methods to perform multiple operations.
//    While there are constructors, it is recommended to use the valueOf() method where possible.
//    Note that you can pass a long to either type, but a double only to BigDecimal.

        var bigInt = BigInteger.valueOf(5_000L);
        var bigDecimal = BigDecimal.valueOf(5_000L);
        bigDecimal = BigDecimal.valueOf(5_000.00);

//        Both classes provide constants for the most common values like BigInteger.ZERO and BigDecimal.ONE.
//        There are methods to perform math operations with these types, such as:
        var bigInt2 = BigInteger.valueOf(199)
                .add(BigInteger.valueOf(1))
                .divide(BigInteger.TEN)
                .max(BigInteger.valueOf(6));
        System.out.println(bigInt2);  // 20

//        This example starts by adding 199 and 1 which gives 200.
//        It then divides by 10 resulting in 20. Finally, max()
//        sees that 20 is larger than 6 and we have the result.

        var bi = new BigInteger("12345123451234512345");
        System.out.println(bi);

    }
}
