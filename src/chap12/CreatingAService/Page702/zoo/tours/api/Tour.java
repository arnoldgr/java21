package chap12.CreatingAService.Page702.zoo.tours.api;

/*
 * Service Provider Interface (SPI) for tours
 * Any class implementing Tour can be discovered by TourFinder
 */
public interface Tour {
    String name();      // Tour name
    int length();       // Tour length in minutes
}