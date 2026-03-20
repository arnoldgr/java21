package chap14.io_streams.page835;

public class IOStreamFundamentals {

    public static void main(String[] args) {
        System.out.println("=== I/O Stream Fundamentals ===");

        System.out.println("Input = reading data from a resource");
        System.out.println("Output = writing data to a resource");

        System.out.println("\nIn java.io, there are two main families:");
        System.out.println("1. Byte streams -> InputStream / OutputStream");
        System.out.println("2. Character streams -> Reader / Writer");

        System.out.println("\nByte streams are best for binary data.");
        System.out.println("Character streams are best for text data.");

        System.out.println("\nExam Tip:");
        System.out.println("If the class name ends with InputStream/OutputStream, it is a byte stream.");
        System.out.println("If the class name ends with Reader/Writer, it is a character stream.");
    }
}
