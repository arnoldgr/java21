package zoo.tours.api;

// This interface defines the Service Provider Interface (SPI) for tours
// Any implementation of this interface will provide these behaviors.
public interface Tour {
    // Returns the name of the tour
    String name();

    // Returns the length of the tour (in whatever units you choose)
    int length();

    // Returns a Souvenir object associated with the tour
    zoo.tours.api.Souvenir getSouvenir();
}