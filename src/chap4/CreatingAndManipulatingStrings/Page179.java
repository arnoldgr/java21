package chap4.CreatingAndManipulatingStrings;

public class Page179 {
    public static void main(String[] args) {
//        Using format() with Flags
//
//        Besides supporting symbols, Java also supports optional flags between the % and the symbol character.
//        In the previous example, the floating-point number was printed as 90.250000.
//        By default, %f displays exactly six digits past the decimal.
//        If you want to display only one digit after the decimal, you can use %.1f instead of %f.
//        The format() method relies on rounding rather than truncating when shortening numbers.
//        For example, 90.250000 will be displayed as 90.3 (not 90.2) when passed to format() with %.1f.
//        The format() method also supports two additional features.
//        You can specify the total length of output by using a number before the decimal symbol.
//        By default, the method will fill the empty space with blank spaces.
//        You can also fill the empty space with zeros by placing a single zero before the decimal symbol.
//        The following examples use brackets, [], to show the start/end of the formatted value:

        var pi = 3.14159265359;
        System.out.format("[%f]",pi);      // [3.141593]
        System.out.format("[%12.8f]",pi);  // [  3.14159265]
        System.out.format("[%012f]",pi);   // [00003.141593]
        System.out.format("[%12.2f]",pi);  // [        3.14]
        System.out.format("[%.3f]",pi);    // [3.142]


//        The format() method supports a lot of other symbols and flags.
//        You don’t need to know any of them for the exam beyond what we’ve discussed already.

    }
}
