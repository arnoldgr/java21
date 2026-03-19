package chap4.CalculatingWithMathsAPI;

public class Page201 {
    public static void main(String[] args) {
//        Calculating with Math APIs
//        It should come as no surprise that computers are good at computing numbers.
//        Java comes with a powerful Math class with many methods to make your life easier.
//        We just cover a few common ones here that are most likely to appear on the exam.
//        When doing your own projects, look at the Math Javadoc to see what other methods can help you.
//        Additionally, we cover the BigInteger and BigDecimal classes in this section.

//        Finding the Minimum and Maximum
//        The Math.min() and Math.max() methods compare two values and return one of them.
//        The method signatures for Math.min() are as follows:
//        public static double min(double a, double b)
//        public static float min(float a, float b)
//        public static int min(int a, int b)
//        public static long min(long a, long b)

//        There are four overloaded methods, so you always have an API available with the same type.
//        Each method returns whichever of a or b is smaller. The max() method works the same way, except it returns the larger value.
//        The following shows how to use these methods:
        int first = Math.max(3, 7);    // 7
        int second = Math.min(7, -9);  // -9

//        The first line returns 7 because it is larger.
//        The second line returns -9 because it is smaller.
//        Remember from school that negative values are smaller than positive ones.


    }
}
