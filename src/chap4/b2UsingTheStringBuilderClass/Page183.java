package chap4.UsingTheStringBuilderClass;

public class Page183 {

    public static void main(String[] args) {
//        Appending Values
//        The append() method is by far the most frequently used method in StringBuilder.
//        In fact, it is so frequently used that we just started using it without comment. Luckily, this method does just what it sounds like: it adds the parameter to the StringBuilder and returns a reference to the current StringBuilder. One of the method signatures is as follows:
//        public StringBuilder append(String str)

//        Notice that we said one of the method signatures.
//        There are more than 10 method signatures that look similar but take different
//        data types as parameters, such as int, char, etc.
//        All those methods are provided so you can write code like this:
        var sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb);      // 1c-true

//        Nice method chaining, isn’t it? The append() method is called directly after the constructor.
//        By having all these method signatures, you can just call append() without
//        having to convert your parameter to a String first.
//
//        Applying Code Points
//        The codePointAt(), codePointBefore(), and codePointCount() methods from
//        String are also available on StringBuilder. There’s one more method you need
//        to know for code points that is only on StringBuilder:
//        public StringBuilder appendCodePoint(int codePoint)

//        It works like the append() method in the previous section except
//        it takes an integer representing the Unicode value, converts it
//        to a character, and appends it to the StringBuilder.

        var sb2 = new StringBuilder()
                .appendCodePoint(87).append(',')
                .append((char) 87).append(',')
                .append(87).append(',')
                .appendCodePoint(8217);
        System.out.println(sb2);  // W,W,87,â€™

//        Like we saw with String, it also handles non-ASCII characters like a stylized quote (’).
//        Again, you do not need to know the numeric values for characters for the exam,
//        but you should understand how the text in this example is generated.

    }
}
