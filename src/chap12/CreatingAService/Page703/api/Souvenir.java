package zoo.tours.api;

// This class represents a souvenir that may be returned from a tour.
// Using a record for concise immutable data representation.
public record Souvenir(String description) { }