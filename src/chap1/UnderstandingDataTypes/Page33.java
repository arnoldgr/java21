package chap1.UnderstandingDataTypes;

public class Page33 {
    public static void main(String[] args) {
        //Let’s try a few examples. First, do you see why this doesn’t compile?
        //String block = """doe"""; // DOES NOT COMPILE
//        String block = """
//                doe""";

        //Text blocks require a line break after the opening """, making this one invalid.

        //How many lines do you think are in this text block?
        String block = """
                        doe \
                        deer""";
        System.out.println(block);

        //Just one. The output is doe deer since the \ tells Java not to add a new line before deer. Let’s try determining the number of lines in another text block.
        //String block = """

        // Let’s try determining the number of lines in another text block.
        String block1 = """
        doe \n
        deer
        """;
        System.out.println(block1);

        //  This time we have four lines. Since the text block has the closing """ on a separate line, we have three lines for the lines in the text block plus the explicit \n. Let’s try one more. What do you think this outputs?

        //What do you think this outputs?
        String block2 = """
                "doe\"\"\"
                \"deer\"""
                """;
        System.out.println( "*" + block2+ "*");

    }
}
