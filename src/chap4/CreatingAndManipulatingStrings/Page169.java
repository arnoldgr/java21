package chap4.CreatingAndManipulatingStrings;

public class Page169 {
    public static void main(String[] args) {
//        Working with Code Points
//        In this book and on the exam, we often use the ASCII data encoding format.
//        Around the world some characters use a longer encoding called Unicode
//        which has a wider range and doesn’t fit in a char, such as a stylized quote (’).
//        A code point is bigger than a character, so it is expressed as a number.
//        The relevant method signatures are as follows:
//        public int codePointAt(int index)
//        public int codePointBefore(int index)
//        public int codePointCount(int beginIndex, int endIndex)

//        The codePointAt() returns the numeric value of the code point at the specified index.
//        The codePointBefore() method does the same, but looks at the value before the index.
//        Finally, the codePointCount() method returns the number of code points between two indexes.

        var s = "Weâ€™re done feeding the animals";
        System.out.println(s.charAt(0) + " " + s.codePointAt(0));  // W 87
        System.out.println(s.charAt(2) + " " + s.codePointAt(2));  // â€™ 8217
        System.out.println(s.codePointBefore(3));                  // 8217
        System.out.println(s.codePointCount(0,4));                 // 4

//        Don’t worry! You do not need to memorize the ASCII or Unicode values.
//        You just need to know that if you see codePointAt() on the exam that
//        it functions similarly to charAt() for ASCII characters,
//        returning the numeric value of the character at the location.

    }
}
