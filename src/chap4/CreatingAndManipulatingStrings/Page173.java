package chap4.CreatingAndManipulatingStrings;

public class Page173 {
    public static void main(String[] args) {
//        Searching for Substrings
//        Often, you need to search a larger string to determine if a substring is contained within it. The startsWith() and endsWith() methods look at whether the provided value matches part of the String. There is also an overloaded startsWith() that specifies where in the String to start looking. The contains() method isn’t as particular; it looks for matches anywhere in the String. The method signatures are as follows:
//        public boolean startsWith(String prefix)
//        public boolean startsWith(String prefix, int fromIndex)
//        public boolean endsWith(String suffix)
//        public boolean contains(CharSequence charSeq)

//        The following code shows how to use these methods:
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false

        System.out.println("abc".startsWith("b", 1)); // true
        System.out.println("abc".startsWith("b", 2)); // false

        System.out.println("abc".endsWith("c"));   // true
        System.out.println("abc".endsWith("a"));   // false

        System.out.println("abc".contains("b"));   // true
        System.out.println("abc".contains("B"));   // false
    }
}
