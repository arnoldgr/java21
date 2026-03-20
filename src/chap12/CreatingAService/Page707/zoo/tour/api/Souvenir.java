//package zoo.tours.api;
//
///*
// * Souvenir class
// * --------------
// * Represents a souvenir associated with a tour.
// * This is part of the API module, meaning both providers and consumers
// * can use it. The book emphasizes that service providers may construct
// * and return complex objects defined in the API, while consumers only
// * interact with them through the interface.
// */
//public class Souvenir {
//
//    /*
//     * Instance variable: name
//     * -----------------------
//     * Stores the name of the souvenir (e.g., "stuffed animal").
//     * This is private to enforce encapsulation, a core principle
//     * of object-oriented programming.
//     */
//    private String name;
//
//    /*
//     * Constructor
//     * -----------
//     * Initializes the souvenir with a given name.
//     * The consumer or provider can call new Souvenir("...") to
//     * create a souvenir object. This demonstrates how providers
//     * can return API-defined types to consumers.
//     */
//    public Souvenir(String name) {
//        this.name = name;
//    }
//
//    /*
//     * toString()
//     * ----------
//     * Overrides Object.toString() to provide a meaningful string
//     * representation of the souvenir. Without this, printing a
//     * Souvenir would show something like zoo.tours.api.Souvenir@1936f0f5.
//     * By overriding, we make the output recruiter-friendly and clear.
//     */
//    @Override
//    public String toString() {
//        return "Souvenir: " + name;
//    }
//}