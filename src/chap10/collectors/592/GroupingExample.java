package chap10.collectors;

// Page 592
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupingExample {
    public static void main(String[] args) {
        Map<Integer, java.util.List<String>> map =
                Stream.of("lions","tigers","bears")
                .collect(Collectors.groupingBy(String::length));
        System.out.println(map);
    }
}
