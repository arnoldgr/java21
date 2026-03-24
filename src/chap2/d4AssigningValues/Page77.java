package chap2.AssigningValues;
// Applying Casting
public class Page77 {
    public static void main(String[] args) {

//        We can fix three of the previous examples by casting the results to a smaller data type.
//        Remember, casting primitives is required any time you are going from a larger numerical
//        data type to a smaller numerical data type, or converting from a floating-point number to an integral value.

        int fish = (int)1.0;
        short bird = (short)1921222;  // Stored as 20678
        int mammal = (int)9f;

//        What about applying casting to an earlier example?

//        long reptile = (long)192301398193810323;  // DOES NOT COMPILE
//        This still does not compile because the value is first interpreted as an int by the compiler and is out of range. The following fixes this code without requiring casting:

        long reptile = 192301398193810323L;

//        Overflow and underflow
        System.out.print(2147483647+1);  // -2147483648
//        Since 2147483647 is the maximum int value, adding any strictly positive value to it will cause it to wrap to the smallest negative number.

        short mouse = 10;
        short hamster = 3;
        //short capybara = mouse * hamster;  // DOES NOT COMPILE
        short capybara = (short)(mouse * hamster);
//        By casting a larger value into a smaller data type,
//        you instruct the compiler to ignore its default behavior.
//        In other words, you are telling the compiler that you have taken additional steps to prevent overflow or underflow.
    }
}
