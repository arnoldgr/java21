package chap4.CreatingAndManipulatingStrings;

public class Page168 {
    public static void main(String[] args) {

//        A String is immutable, or unchangeable.
//        This means calling a method on a String will return a different String object
//        rather than changing the value of the reference.

//        Some methods of String
//        Determining the Length
//        The method length() returns the number of characters in the String.
//        The method signature is as follows:
//        public int length();

//        The following code shows how to use length():
        var name = "animals";
        System.out.println(name.length());  // 7

//        Wait. It outputs 7? Didn’t we just tell you that Java counts from zero?
//        The difference is that zero counting happens only when you’re using indexes
//        or positions within a list. When determining the total size or length,
//        Java uses normal counting again.


//        Getting a Single Character
//        The method charAt() lets you query the string to find out what character is at a specific index.The method
//        signature is as follows:
//        public char charAt ( int index)

//        The following code shows how to use charAt ():
//        var name = "animals";
        System.out.println(name.charAt(0));  // a
        System.out.println(name.charAt(6));  // s
        System.out.println(name.charAt(7));  // exception

//        Since indexes start counting with zero, charAt (0) returns the “first”character in the sequence.
//        Similarly, charAt(6) returns the “seventh”character in the sequence.However, charAt(7) is a problem.It asks for
//        the “eighth”character in the sequence, but there are only seven characters present.When something goes wrong
//        that Java doesn’t know how to deal with, it throws an exception
//        java.lang.StringIndexOutOfBoundsException: String index out of range: 7


    }
}
