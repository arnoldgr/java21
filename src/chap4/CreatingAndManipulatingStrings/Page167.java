package chap4.CreatingAndManipulatingStrings;

public class Page167 {
    public static void main(String[] args) {
        //    In this example, you just have to remember what += does. Keep in mind, s += "2" means the same thing as s = s + "2".
        var s = "1";                // s currently holds "1"
        s += "2";                   // s currently holds "12"
        s += 3;                     // s currently holds "123"
        System.out.println(s);      // 123
//        On line 5, we are “adding” two strings, which means we concatenate them.
//        Line 6 tries to trick you by adding a number, but it’s just like we wrote s = s + 3.
//        We know that a string “plus” anything else means to use concatenation.

    }
}
