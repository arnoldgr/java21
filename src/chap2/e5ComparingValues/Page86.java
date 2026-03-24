package chap2.ComparingValues;
//Logical Operators
public class Page86 {
    public static void main(String[] args) {
//        AND is only true if both operands are true.
//                Inclusive OR is only false if both operands are false.
//                Exclusive OR is only true if the operands are different.
//
//        Let’s take a look at some examples:
        boolean eyesClosed = true;
        boolean breathingSlowly = true;

        boolean resting = eyesClosed | breathingSlowly;
        boolean asleep = eyesClosed & breathingSlowly;
        boolean awake = eyesClosed ^ breathingSlowly;
        System.out.println(resting);  // true
        System.out.println(asleep);   // true
        System.out.println(awake);    // false
    }
}
