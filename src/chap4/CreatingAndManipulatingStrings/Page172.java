package chap4.CreatingAndManipulatingStrings;

public class Page172 {
    public static void main(String[] args) {
//        Adjusting Case
//        These methods make it easy to convert your data.
//        The method signatures are as follows:
//        public String toLowerCase()
//        public String toUpperCase()

//        The following code shows how to use these methods:
        var name = "animals";
        System.out.println(name.toUpperCase());    // ANIMALS
        System.out.println("Abc123".toLowerCase());  // abc123

//        These methods do what they say. The toUpperCase() method converts any lowercase characters to uppercase in the returned string. The toLowerCase() method converts any uppercase characters to lowercase in the returned string. These methods leave alone any characters other than letters. Also, remember that strings are immutable, so the original string stays the same.


//        Checking for Equality
//        The equals() method checks whether two String objects contain exactly the
//        same characters in the same order.
//        The equalsIgnoreCase() method checks whether two String objects contain
//        the same characters, with the exception that it ignores the characters’ case.
//        The method signatures are as follows:
//        public boolean equals (Object obj)
//        public boolean equalsIgnoreCase (String str)

        System.out.println("abc".equals("ABC"));            // false
        System.out.println("ABC".equals("ABC"));            // true
        System.out.println("ABC".equals(6));                // false
        System.out.println("abc".equalsIgnoreCase("ABC"));  // true
    }
}
