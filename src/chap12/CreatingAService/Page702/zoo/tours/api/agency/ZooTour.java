package chap12.CreatingAService.Page702.zoo.tours.api.agency;

import chap12.CreatingAService.Page702.zoo.tours.api.Tour;

/*
 * This class implements the Tour service provider interface (SPI).
 * Any class that provides a tour must implement this interface.
 */
public class ZooTour implements Tour {

    /*
     * Returns the name of the tour.
     * This method fulfills the contract of the Tour interface.
     */
    @Override
    public String name() {
        return "Bronx Zoo Tour"; // The name of this specific tour
    }

    /*
     * Returns the length of the tour in minutes.
     * This method also fulfills the contract of the Tour interface.
     */
    @Override
    public int length() {
        return 90; // This tour lasts 90 minutes
    }
}