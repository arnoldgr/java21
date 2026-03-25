package chap1.f6UnderstandingDataTypes;
/*text blocks
A text block starts and ends with three double quotes ("""), and the contents don’t need to be escaped.
 This is much easier to read. Notice how the type is still String.
 This means any String methods you already know or will learn in Chapter 4 apply to text blocks too.
 It also means you use a text block with a method that takes a String. For example:
 */
public class Page31 {
    public static void main(String[] args) {

        /*not using text block
        Building this as a String requires two things you haven’t learned yet. The syntax \" lets you say you want a " rather than to end the String, and \n says you want a new line. Both of these are called escape characters because the backslash provides a special meaning. With these two new skills, we can write this:
        */
        String eyeTest1 = "\"Java Study Guide\"\n   by Jeanne & Scott";

        //using text block
        String eyeTest = """
                "Java Study Guide"
                            by Jeanne & Scott""";
        System.out.println(eyeTest);
        prepare();
    }

    static public String label(String title, String author) {
        return """
                Book:
                """ + title + " by " + author;
    }

    static public void prepare() {
        String labelled = label("""
                Java Study Guide
                For Java 21
                2024 Edition""", "Jeanne & Scott");
        System.out.println(labelled);
    }
}