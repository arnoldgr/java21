package zoo.tours.agency;

/*
 * Service Provider implementing the Tour interface.
 * -------------------------------------------------
 * According to the book, a service provider is a concrete class that
 * implements a service interface. It is not exported directly to other
 * modules, but instead declared in the module descriptor using:
 *
 *   provides InterfaceName with ClassName;
 *
 * This allows the ServiceLoader to discover it at runtime without the
 * consumer knowing the actual class name.
 */
public class TourImpl implements zoo.tours.api.Tour {

    /*
     * name()
     * ------
     * Implements the contract defined in the Tour interface.
     * The book emphasizes that consumers only depend on the interface,
     * not the implementation. Here we return a fixed name "Behind the Scenes".
     */
    @Override
    public String name() {
        return "Behind the Scenes";
    }

    /*
     * length()
     * --------
     * Another method from the Tour interface. The book explains that
     * implementations can provide their own details, while the consumer
     * simply calls the interface method. Here we return 120 minutes.
     */
    @Override
    public int length() {
        return 120; // in minutes
    }

    /*
     * getSouvenir()
     * -------------
     * Demonstrates returning a type defined in the API module (Souvenir).
     * The book highlights that service providers can construct and return
     * complex objects, but the consumer only sees them through the interface.
     * This reinforces loose coupling between modules.
     */
    @Override
    public zoo.tours.api.Souvenir getSouvenir() {
        return new zoo.tours.api.Souvenir("stuffed animal");
    }

    /*
     * Note:
     * -----
     * The book points out that when you print a service provider instance
     * without overriding toString(), you see output like:
     *   zoo.tours.agency.TourImpl@1936f0f5
     * This is the default Object.toString() format.
     * To make output more meaningful, you can override toString() to show
     * the tour's name, length, and souvenir.
     */
}