import chap12.CreatingAService.Page704.zoo.tours.api.Tour;
import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {

        ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .mapToInt(Tour::length)
                .max()
                .ifPresent(maxLength ->
                        System.out.println("Longest tour is: " + maxLength));
    }
}