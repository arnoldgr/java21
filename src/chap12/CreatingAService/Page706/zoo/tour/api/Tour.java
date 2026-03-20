package chap12.CreatingAService.Page706.zoo.tour.api;

/**
 * Service Provider Interface (SPI) for Tours
 */
public interface Tour {
    String name();   // Returns the tour name
    int length();    // Returns the tour length in hours

}