package chap12.CreatingAService.Page705.api.visitor;

import java.util.List;
import chap12.CreatingAService.Page705.api.Tour;
import chap12.CreatingAService.Page705.api.reservations.TourFinder;

public class Tourist {
    public static void main(String[] args) {

        // Get a single tour
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour: " + tour);

        // Get all tours
        List<Tour> tours = TourFinder.findAllTours();
        System.out.println("# tours: " + tours.size());
    }
}