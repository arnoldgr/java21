package chap10.advancedstreampipelineconcepts;

// Page 590
import java.util.stream.Stream;

public class ExecutionOrder {
    public static void main(String[] args) {
        Stream.of(1,2,3)
                .map(x -> {
                    System.out.println("map: " + x);
                    return x * 2;
                })
                .forEach(System.out::println);
    }
}
