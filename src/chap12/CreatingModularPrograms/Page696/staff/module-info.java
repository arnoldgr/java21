//module zoo.staff {
//    // This module only depends on Talks now, because Care and Feeding
//    // are already provided transitively through Talks
//
//    requires zoo.animal.talks; // Talks module transitively provides access to Care (and Care provides Feeding)
//
//    // No exports statements because this module's packages remain internal
//}