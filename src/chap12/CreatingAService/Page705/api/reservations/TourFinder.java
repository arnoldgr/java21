package chap12.CreatingAService.Page705.api.reservations;

import chap12.CreatingAService.Page705.api.Tour;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class TourFinder {

    // Lookup a single Tour implementation
    public static Tour findSingleTour() {
        return ServiceLoader.load(Tour.class).findFirst().orElse(null);
    }

    // Lookup all Tour implementations
    public static List<Tour> findAllTours() {
        return ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}