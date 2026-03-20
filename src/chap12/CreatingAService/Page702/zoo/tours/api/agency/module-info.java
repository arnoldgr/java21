//module zoo.tours.agency {
//    // This module depends on the Tour SPI defined in zoo.tours.api
//    requires zoo.tours.api;
//
//    // Declares that this module provides an implementation of the Tour interface
//    // at runtime. ServiceLoader in other modules (like zoo.tours.reservations)
//    // can discover ZooTour as a service provider.
//    provides chp12.CreatingAService.Page702.zoo.tours.api.Tour
//            with chp12.CreatingAService.Page702.zoo.tours.agency.ZooTour;
//}