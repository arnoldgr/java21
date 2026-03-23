package chap10.collectors;

// Page 594
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingCollectorExample {
    public static void main(String[] args) {
        List<Integer> list =
                Stream.of("lions","tigers","bears")
                .collect(Collectors.mapping(String::length, Collectors.toList()));
        System.out.println(list);
    }
}
