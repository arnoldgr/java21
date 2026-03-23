package chap10.advancedstreampipelineconcepts;

// Page 589
import java.util.stream.Stream;

public class ShortCircuiting {
    public static void main(String[] args) {
        Stream.generate(() -> "chimp")
                .peek(System.out::println)
                .limit(3)
                .forEach(System.out::println);
    }
}
