package chap2.ComparingValues;

public class Page87 {
    public static void main(String[] args) {
        //bitwise operators
//        First, we have the bitwise AND operator (&) and the bitwise OR operator (|).
//        These operators return 1 when both or either corresponding binary digits are 1, respectively.
//        First, you need to know that the original number is returned if both operands are the same.
        int number = 70;
        System.out.println(number);            // 70
        System.out.println(number & number);   // 70
        System.out.println(number | number);   // 70

//        You also need to know how bitwise operations work on a number and its negation,
//        which returns 0 for bitwise AND (&), and -1 for bitwise OR (|).
        int negated = ~number;
        System.out.println(negated);           // -71

        System.out.println(number & negated);  // 0
        System.out.println(number | negated);  // -1

//        Finally, we have the binary exclusive OR operator (^).
//        It works like the boolean version except with 0 as false, and 1 as true.
//        However, it checks at each position in the number. You should know that it returns 0 if both numbers are the same (bits are all 0s), and -1 (bits are all 1s) for a value with its negation.
        System.out.println(number ^ number);   // 0
        System.out.println(number ^ negated);  // -1


    }
}
