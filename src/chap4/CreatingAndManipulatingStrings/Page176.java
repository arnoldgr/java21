package chap4.CreatingAndManipulatingStrings;
//        The indent() method adds the same number of blank spaces to the beginning
//        of each line if you pass a positive number.
//        If you pass a negative number, it tries to remove that number of whitespace
//        characters from the beginning of the line.
//        If you pass zero, the indentation will not change.

//        If you call indent() with a negative number and try to remove more whitespace
//        characters than are present at the beginning of the line,
//        Java will remove all that it can find.

//        This seems straightforward enough. However, indent() also normalizes whitespace
//        characters.
//        What does normalizing whitespace mean, you ask?
//        First, a line break is added to the end of the string if not already there.
//        Second, any line breaks are converted to the \n format. Regardless of whether
//        your operating system uses \r\n (Windows) or \n (Mac/Unix),
//        Java will standardize on \n for you.
//        The stripIndent() method is useful when a String was built with concatenation
//        rather than using a text block. It gets rid of all incidental whitespace.
//        This means that all nonblank lines are shifted left so the same number of
//        whitespace characters are removed from each line and the first character
//        that remains is not blank. Like indent(), \r\n is turned into \n.
//        However, the stripIndent() method does not add a trailing line break if it is missing.

public class Page176 {
    public static void main(String[] args) {
//        working with indentation
//        method signatures
//        public String indent(int numberSpaces)
//        public String stripIndent()
        var block = """
                a
                 b
                c""";
        var concat = " a\n"
                + "  b\n"
                + " c";

        System.out.println(block.length());                 // 6
        System.out.println(concat.length());                // 9
        System.out.println(block.indent(1).length());       // 10
        System.out.println(concat.indent(-1).length());     // 7
        System.out.println(concat.indent(-4).length());     // 6
        System.out.println(concat.stripIndent().length());
        System.out.println(concat.stripIndent() );


//        Lines 32-38 create similar strings using a text block and a regular String, respectively.
//        We say “similar” because concat has a whitespace character at the beginning of each line
//        while block does not.

//        Line 40 counts the six characters in block, which are the three letters,
//        the blank space before b, and the \n after a and b.
//        Line 41 counts the nine characters in concat, which are the three letters,
//        one blank space before a, two blank spaces before b,
//        one blank space before c, and the \n after a and b. Count them up yourself. If you don’t
//        understand which characters are counted, it will only get more confusing.

//        On line 42, we ask Java to add a single blank space to each of the three lines in block.
//        However, the output says we added 4 characters rather than 3 since the length went from 6 to 10.
//        This mysterious additional character is thanks to the line termination normalization.
//        Since the text block doesn’t have a line break at the end, indent() adds one!

//        On line 43, we remove one whitespace character from each of the three lines of concat.
//        This gives a length of seven. We started with nine, got rid of three characters,
//        and added a trailing normalized new line.

//        On line 44, we ask Java to remove four whitespace characters from the same three lines.
//        Since there are not four whitespace characters, Java does its best.
//        The single space is removed before a and c. Both spaces are removed before b.
//        The length of six should make sense here; we removed one more character here than on line 20.

//        Finally, line 45 uses the stripIndent() method. All of the lines have at
//        least one whitespace character. Since they do not all have two whitespace characters,
//        the method gets rid of only one character per line. Since no new line is added by stripIndent(),
//        the length is six, which is three less than the original nine.




    }
}
