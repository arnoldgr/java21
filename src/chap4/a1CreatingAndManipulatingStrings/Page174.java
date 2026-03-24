package chap4.CreatingAndManipulatingStrings;

public class Page174 {
    public static void main(String[] args) {
//        Replacing Values
//        The replace() method does a simple search and replace on the string. There’s a version that takes char parameters as well as a version that takes CharSequence parameters. The method signatures are as follows:
//        public String replace(char oldChar, char newChar)
//        public String replace(CharSequence target, CharSequence replacement)

//        The following code shows how to use these methods:
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc

//        Removing Whitespace
//        The method signatures are as follows:
//        public String strip()
//        public String stripLeading()
//        public String stripTrailing()
//        public String trim()

//        The following code shows how to use these methods:
        System.out.println("abc".strip());                 // abc
        System.out.println("\t   a b c\n".strip());        // a b c

        String text = " abc\t ";
        System.out.println(text.trim().length());          // 3
        System.out.println(text.strip().length());         // 3
        System.out.println(text.stripLeading().length());  // 5
        System.out.println(text.stripTrailing().length()); // 4
    }
}
