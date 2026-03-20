package chap4.CalculatingWithMathsAPI;

public class Page202 {

    public static void main(String[] args) {
//        Rounding Numbers
//        The Math.round() method gets rid of the decimal portion of the value,
//        choosing the next higher number if appropriate.
//        If the fractional part is .5 or higher, we round up.
//        The method signatures for Math.round() are as follows:
//        public static long round(double num)
//        public static int round(float num)

//        There are two overloaded methods to ensure that there is enough room to
//        store a rounded double if needed.
//        The following shows how to use this method:
        long low = Math.round(123.45);       // 123
        long high = Math.round(123.50);      // 124
        int fromFloat = Math.round(123.45f); // 123
        System.out.println(low);
        System.out.println(high);
        System.out.println(fromFloat);

//        The first line returns 123 because .45 is smaller than a half.
//        The second line returns 124 because the
//        fractional part is just barely a half.
//        The final line shows that an explicit float triggers the method
//        signature that returns an int.
    }
}
