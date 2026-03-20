package chap4.CalculatingWithMathsAPI;

public class Page203 {
    public static void main(String[] args) {
//        Determining the Ceiling and Floor
//        The Math.ceil() method takes a double value. If it is a whole number, it returns the same value. If it has any fractional value, it rounds up to the next whole number. By contrast, the Math.floor() method discards any values after the decimal.
//        The method signatures are as follows:
//        public static double ceil(double num)
//        public static double floor(double num)

//        The following shows how to use these methods:
        double c = Math.ceil(3.14);  // 4.0
        double f = Math.floor(3.14); // 3.0
        System.out.println(c);
        System.out.println(f);
//        The first line returns 4.0 because four is the integer, just larger. The second line returns 3.0 because it is the integer, just smaller.

//        Calculating Exponents
//        The Math.pow() method handles exponents.
//        As you may recall from your elementary school math class, 32 means three squared.
//        This is 3 * 3 or 9. Fractional exponents are allowed as well. Sixteen to the 0.5 power means the square root of 16, which is 4. (Don’t worry, you won’t have to do square roots on the exam.)
//        The method signature is as follows:
//        public static double pow(double number, double exponent)

//        The following shows how to use this method:
        double squared = Math.pow(5, 2); // 25.0
        System.out.println(squared);

//        Notice that the result is 25.0 rather than 25 since it is a double.
//        Again, don’t worry;
//        the exam won’t ask you to do any complicated math.

        double squared2 = Math.pow(25, 0.5); // 5  //actually doing a squared root
        System.out.println(squared2);

//        Generating Random Numbers
//        The Math.random() method returns a value greater than or equal to 0 and less than 1.
//        The method signature is as follows:
//        public static double random()

//        The following shows how to use this method:
        double num = Math.random();
        System.out.println(num);

//        Since it is a random number, we can’t know the result in advance.
//        However, we can rule out certain numbers.
//        For example, it can’t be negative because that’s less than 0.
//        It can’t be 1.0 because that’s not less than 1.

    }
}
