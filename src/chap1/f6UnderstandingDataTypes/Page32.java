package chap1.f6UnderstandingDataTypes;

//Incidental and essential whitespace
public class Page32 {
    public static void main(String[] args) {
        /*You might have noticed the words incidental and essential whitespace in the figure.
        What’s that? Essential whitespace is part of your String and is important to you.
        Incidental whitespace just happens to be there to make the code easier to read.
        You can reformat your code and change the amount of incidental whitespace without any
        impact on your String value.
        Imagine a vertical line drawn on the leftmost non-whitespace character in your text block.
        Everything to the left of it is incidental whitespace, and everything to the right is
        essential whitespace. Let’s try an example. How many lines does this output,
        and how many incidental and essential whitespace characters begin each line?
         */
        String pyramid = """
                  *
                 * *
                * * * 
                """;
        System.out.print(pyramid);
        /*There are four lines of output. Lines 15–17 have stars.
        Line 18 is a line without any characters.
        The closing triple " would have needed to be on line 17 if we didn’t want that blank line.
        There are no incidental whitespace characters here.
        The closing """ on line 18 are the leftmost characters, so the line is drawn at the leftmost position.
         Line 15 has two essential whitespace characters to begin the line, and line 16 has one.
         That whitespace fills in the line drawn to match line 18.
         */
    }
}
