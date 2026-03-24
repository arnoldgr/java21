package chap1.c3WritingAMainMethod.page9;

public class Zoo {
    public static void main(String[] args) {
        System.out.println(args[0]);
        System.out.println(args[1]);
    }
}

/*launching single-file source-code

If you get tired of typing both javac and java every time you want to try a code example,
there’s a shortcut.
You can instead run this:

java Zoo.java Bronx Zoo


There is a key difference here. When compiling first, you omitted the file extension when running java.
When skipping the explicit compilation step, you include this extension.
This feature is called launching single-file source-code programs and is useful for testing or for small programs. The name cleverly tells you that it is designed for when your program is one file
 */
