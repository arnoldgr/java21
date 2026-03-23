package chap10.collectors;

// Page 593
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PartitioningExample {
    public static void main(String[] args) {
        Map<Boolean, java.util.List<String>> map =
                Stream.of("lions","tigers","bears")
                .collect(Collectors.partitioningBy(s -> s.length() <= 5));
        System.out.println(map);
    }
}
