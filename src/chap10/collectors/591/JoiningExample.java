package chap10.collectors;

// Page 591
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningExample {
    public static void main(String[] args) {
        String result = Stream.of("w","o","l","f")
                .collect(Collectors.joining());
        System.out.println(result); // wolf
    }
}
