package chap12.CreatingAService.Page705.api;

/**
 * Service Provider Interface (SPI) for Tours
 */
public interface Tour {
    String name();   // Returns the tour name
    int length();    // Returns the tour length in hours
}