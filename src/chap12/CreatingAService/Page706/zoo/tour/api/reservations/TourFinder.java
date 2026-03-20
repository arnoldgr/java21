package zoo.tours.reservations;

import zoo.tours.api.Tour;          // Correct import
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

/*
 * Service Locator
 * Finds Tour implementations at runtime using ServiceLoader
 */
public class TourFinder {

    // Returns the first Tour implementation, or null if none
    public static Tour findSingleTour() {
        return ServiceLoader.load(Tour.class).findFirst().orElse(null);
    }

    // Returns all Tour implementations as a list
    public static List<Tour> findAllTours() {
        return ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}