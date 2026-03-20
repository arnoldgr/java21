
package chap12.CreatingAService.Page704.zoo.tours.api;

/*
 * ZooTour is a concrete implementation of the Tour SPI (Service Provider Interface).
 *
 * It is discovered at runtime by ServiceLoader, which scans the
 * META-INF/services/chp12.CreatingAService.Page704.zoo.tours.api.Tour file
 * to find registered implementations like this one.
 *
 * Any class wanting to provide a Tour must implement all methods
 * defined in the Tour interface.
 */
public class ZooTour implements Tour {

    /*
     * Returns the display name of this tour.
     * Fulfills the name() contract defined in the Tour interface.
     */
    @Override
    public String name() {
        return "Bronx Zoo Tour"; // The name of this specific tour
    }

    /*
     * Returns how long this tour takes, measured in minutes.
     * Fulfills the length() contract defined in the Tour interface.
     */
    @Override
    public int length() {
        return 90; // This tour lasts 90 minutes
    }

    /*
     * Returns the Souvenir associated with this tour.
     * A new Souvenir object is created with a descriptive name.
     * Fulfills the getSouvenir() contract defined in the Tour interface.
     */
    @Override
    public Souvenir getSouvenir() {
        return new Souvenir("stuffed animal"); // The souvenir given on this tour
    }
}