//package zoo.visitor;
//
//import java.util.List;
//import zoo.tours.api.Tour;
//import zoo.tours.reservations.TourFinder;
//
///*
// * Consumer module: obtains Tour instances via TourFinder (service locator)
// * and uses the service without knowing its actual class.
// */
//public class Tourist {
//
//    public static void main(String[] args) {
//        // Get a single tour using the helper method
//        Tour tour = getOneTour();
//        System.out.println("Single tour: " + tour);
//
//        // Get all Tour implementations
//        List<Tour> tours = TourFinder.findAllTours();
//        System.out.println("# tours: " + tours.size());
//
//        // Optional: print details of each tour
//        for (Tour t : tours) {
//            System.out.println("Tour name: " + t.name() + ", length: " + t.length() +
//                    " minutes, souvenir: " + t.getSouvenir());
//        }
//    }
//
//    /*
//     * getOneTour()
//     * ------------
//     * This helper method delegates to TourFinder.findSingleTour()
//     * and returns one Tour implementation. According to the book,
//     * this demonstrates how a consumer can obtain a service instance
//     * without knowing the provider class name.
//     */
//    public static Tour getOneTour() {
//        return TourFinder.findSingleTour();
//    }
//}