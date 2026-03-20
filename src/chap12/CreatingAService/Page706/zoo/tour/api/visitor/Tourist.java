package zoo.visitor;

import java.util.List;
import zoo.tours.api.Tour;
import zoo.tours.reservations.TourFinder;

/*
 * Consumer module: uses the TourFinder (service locator)
 * to obtain Tour implementations without knowing their actual classes.
 */
public class Tourist {

    public static void main(String[] args) {

        // Get a single Tour
        Tour tour = TourFinder.findSingleTour();
        System.out.println("Single tour: " + tour);

        // Get all Tour implementations
        List<Tour> tours = TourFinder.findAllTours();
        System.out.println("# tours: " + tours.size());

        // Print details of each tour
        for (Tour t : tours) {
            System.out.println("Tour name: " + t.name() +
                    ", length: " + t.length() +
                    " minutes, souvenir: " + t.getSouvenir());
        }
    }
}