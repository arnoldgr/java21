package chap10.advancedstreampipelineconcepts;

// Page 587
import java.util.stream.Stream;

public class AdvancedPipelineOrder {
    public static void main(String[] args) {
        Stream.of("one","two","three")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return s.length() > 2;
                })
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .forEach(System.out::println);
    }
}
