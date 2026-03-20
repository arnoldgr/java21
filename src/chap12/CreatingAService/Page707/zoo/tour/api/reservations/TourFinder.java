package chap12.CreatingAService.Page707.zoo.tour.api.reservations;

import chap12.CreatingAService.Page705.api.Tour;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

/*
 * TourFinder acts as the "service locator".
 * -----------------------------------------
 * According to the book, the consumer module should not know the actual
 * implementation classes of a service. Instead, it calls a utility like
 * this one, which uses ServiceLoader to discover providers at runtime.
 *
 * Key textbook points:
 * - ServiceLoader.load(Tour.class) scans the module path (or META-INF/services)
 *   for providers registered with "provides InterfaceName with ClassName".
 * - The consumer only depends on the interface (Tour), not the implementation.
 * - This allows new providers to be added without recompiling the consumer.
 */
public class TourFinder {

    /*
     * findSingleTour()
     * ----------------
     * Uses ServiceLoader to look up a single Tour implementation.
     * The book explains that ServiceLoader returns an Iterable of providers.
     * Here we call findFirst() to get the first available provider.
     *
     * If no provider is found, we return null.
     * This demonstrates loose coupling: the consumer doesn’t know or care
     * which provider is chosen, only that it implements Tour.
     */
    public static Tour findSingleTour() {
        return ServiceLoader.load(Tour.class).findFirst().orElse(null);
    }

    /*
     * findAllTours()
     * --------------
     * Uses ServiceLoader to look up *all* Tour implementations.
     * The book emphasizes that multiple providers can be registered,
     * and ServiceLoader will discover them all.
     *
     * We stream over the providers, call Provider::get to instantiate each,
     * and collect them into a List<Tour>.
     *
     * This shows how consumers can iterate over all available services
     * without knowing their class names or recompiling when new ones are added.
     */
    public static List<Tour> findAllTours() {
        return ServiceLoader.load(Tour.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}