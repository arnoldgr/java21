package chap10.advancedstreampipelineconcepts;

// Page 588
import java.util.stream.Stream;

public class LazinessExample {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("a","b","c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                });

        stream.forEach(System.out::println);
    }
}
