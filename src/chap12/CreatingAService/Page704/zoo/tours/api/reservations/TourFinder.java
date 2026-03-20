package chap12.CreatingAService.Page704.zoo.tours.api.reservations;

import chap12.CreatingAService.Page704.zoo.tours.api.Tour;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ServiceLoader;

public class TourFinder {

    // Lookup a single Tour implementation
    public static Tour lookupTour() {
        return ServiceLoader.load(Tour.class)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("No Tour implementation found"));
    }

    // Lookup all Tour implementations
    public static List<Tour> lookupAllTours() {
        return ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}