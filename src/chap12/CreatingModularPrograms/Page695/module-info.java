module zoo.animal.talks {
    // Export packages so other modules can access them
    exports zoo.animal.talks.content to zoo.staff; // only visible to staff
    exports zoo.animal.talks.media;
    exports zoo.animal.talks.schedule;


}