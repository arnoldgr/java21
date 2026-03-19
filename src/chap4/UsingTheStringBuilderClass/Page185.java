package chap4.UsingTheStringBuilderClass;

public class Page185 {
    public static void main(String[] args) {
//        Reversing
//        After all that, it’s time for a nice, easy method.
//        The reverse() method does just what it sounds like: it reverses the
//        characters in the sequences and returns a reference to the current StringBuilder.
//        The method signature is as follows:
//        public StringBuilder reverse()

//        The following code shows how to use this method:
        var sb = new StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);

//        As expected, this prints CBA. This method isn’t that interesting.
//        Maybe the exam creators like to include it to encourage you to write
//        down the value rather than relying on memory for indexes.

//      Working with toString()

//        The Object class contains a toString() method that many classes provide
//        custom implementations of. The StringBuilder class is one of these.
//        The following code shows how to use this method:

        var sb2 = new StringBuilder("ABC");
        String s = sb2.toString();

//        Often StringBuilder is used internally for performance purposes,
//        but the end result needs to be a String.
//        For example, maybe it needs to be passed to another method that is expecting a String.
    }
}
