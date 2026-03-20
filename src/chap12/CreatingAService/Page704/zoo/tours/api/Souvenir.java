package chap12.CreatingAService.Page704.zoo.tours.api;

/*
 * Represents a souvenir that is given to visitors on a tour.
 * This class is returned by the getSouvenir() method defined in the Tour interface,
 * meaning every Tour implementation must provide a Souvenir.
 */
public class Souvenir {

    // The name of the souvenir (e.g. "stuffed animal").
    // Marked final because a souvenir's name should not change after creation.
    private final String name;

    /*
     * Constructs a Souvenir with the given name.
     * Called by Tour implementations when returning their associated souvenir.
     */
    public Souvenir(String name) {
        this.name = name; // Store the provided name for later display
    }

    /*
     * Returns a human-readable description of this souvenir.
     * Used when printing the souvenir to the console, e.g. "Souvenir: stuffed animal".
     */
    @Override
    public String toString() {
        return "Souvenir: " + name; // Combines label with the souvenir's name
    }
}