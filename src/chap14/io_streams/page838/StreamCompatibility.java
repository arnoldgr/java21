package chap14.io_streams.page838;

public class StreamCompatibility {

    public static void main(String[] args) {
        System.out.println("=== Stream Compatibility Rules ===");

        System.out.println("""
                VALID EXAMPLES:
                - new BufferedReader(new FileReader("file.txt"))
                - new BufferedInputStream(new FileInputStream("file.bin"))
                - new BufferedWriter(new FileWriter("file.txt"))
                - new ObjectInputStream(new FileInputStream("data.ser"))
                """);

        System.out.println("""
                INVALID EXAMPLES (do NOT compile):
                - new BufferedInputStream(new FileReader("z.txt"))
                - new BufferedWriter(new FileOutputStream("z.txt"))
                - new ObjectInputStream(new FileOutputStream("z.txt"))
                - new BufferedInputStream(new InputStream()) // abstract class
                """);

        System.out.println("""
                EXAM RULE:
                - InputStream classes wrap InputStream classes
                - OutputStream classes wrap OutputStream classes
                - Reader classes wrap Reader classes
                - Writer classes wrap Writer classes
                """);

        System.out.println("""
                SPECIAL BRIDGE CLASSES:
                - InputStreamReader (InputStream -> Reader)
                - OutputStreamWriter (OutputStream -> Writer)
                """);
    }
}
