package chap4.CreatingAndManipulatingStrings;

public class Page166 {
    public static void main(String[] args) {
        //Concatenating
//        If both operands are numeric, + means numeric addition.
//        If either operand is a String, + means concatenation.
//        The expression is evaluated left to right.

//        Now let’s look at some examples:
        System.out.println(1 + 2);           // 3
        System.out.println("a" + "b");       // ab
        System.out.println("a" + "b" + 3);   // ab3
        System.out.println(1 + 2 + "c");     // 3c
        System.out.println("c" + 1 + 2);     // c12
        System.out.println("c" + null);      // cnull

//       Remember null is represented as a string when concatenated or printed, giving us "cnull".

//        The exam takes trickery a step further and will try to fool you with something like this:
        int three = 3;
        String four = "4";
        System.out.println(1 + 2 + three + four);
//        we start with the third rule, which tells us to consider 1 + 2.
//        The first rule gives us 3. Next, we have 3 + three. Since three is of type int,
//        we still use the first rule, giving us 6. Then, we have 6 + four

    }
}
