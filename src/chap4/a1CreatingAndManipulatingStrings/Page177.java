package chap4.CreatingAndManipulatingStrings;

public class Page177 {
    public static void main(String[] args) {
//        Checking for Empty or Blank Strings
//        Java provides convenience methods for whether a String has a
//        length of zero or contains only whitespace characters. The method signatures are as follows:
//        public boolean isEmpty()
//        public boolean isBlank()

//        The following code shows how to use these methods:
        System.out.println(" ".isEmpty());  // false
        System.out.println("".isEmpty());   // true
        System.out.println(" ".isBlank());  // true
        System.out.println("".isBlank());   // true

//        The first line prints false because the String is not empty; it has a blank space in it.
//        The second line prints true because this time, there are no characters in the String.
//        The final two lines print true because there are no characters other than whitespace present.

    }
}
