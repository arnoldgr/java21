//package zoo.tours.agency;
//
//import zoo.tours.api.*;
//
///*
// * This is a Service Provider that implements the Tour interface
// * At runtime, consumers can discover it via ServiceLoader.
// */
//public class TourImpl implements Tour {
//
//    @Override
//    public String name() {
//        return "Behind the Scenes";
//    }
//
//    @Override
//    public int length() {
//        return 120; // 120 minutes
//    }
//
//    @Override
//    public Souvenir getSouvenir() {
//        return new Souvenir("stuffed animal");
//    }
//}