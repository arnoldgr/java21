package chap12.CreatingAService.Page702.zoo.tours.reservations;

import java.util.*;
import chap12.CreatingAService.Page702.zoo.tours.api.*;

/*
 * TourFinder is a service locator for Tour implementations.
 * It uses Java's ServiceLoader to dynamically discover implementations
 * of the Tour service provider interface (SPI) at runtime.
 */
public class TourFinder {

    /*
     * Returns the first Tour implementation found, or null if none exist.
     *
     * ServiceLoader.load(Tour.class) searches for all classes that implement
     * the Tour interface and are declared in META-INF/services.
     *
     * The method iterates over the ServiceLoader and returns the first available tour.
     * This is convenient if the program expects exactly one service provider.
     */
    public static Tour findSingleTour() {
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader)
            return tour; // Return the first Tour found
        return null; // No implementations available
    }

    /*
     * Returns a List of all Tour implementations found.
     *
     * This method is useful when multiple service providers are available.
     * Each discovered Tour implementation is added to a list and returned.
     */
    public static List<Tour> findAllTours() {
        List<Tour> tours = new ArrayList<>();
        ServiceLoader<Tour> loader = ServiceLoader.load(Tour.class);
        for (Tour tour : loader)
            tours.add(tour); // Add each discovered Tour to the list
        return tours;
    }
}