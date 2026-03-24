package chap5.ApplyingAccessModifiers.page252.pond.inland;


import chap5.ApplyingAccessModifiers.page252.pond.shore.Bird;

public class BirdWatcherFromAfar {       // Not a subclass of Bird
    public void watchBird() {
        Bird bird = new Bird();
//        bird.floatInWater();               // DOES NOT COMPILE
//        System.out.print(bird.text);       // DOES NOT COMPILE
    }
}

//BirdWatcherFromAfar is not in the same package as Bird,
// and it doesn’t inherit from Bird.
// This means it is not allowed to access protected members of Bird.
//Got that? Subclasses and classes in the same package are the only
// ones allowed to access protected members.
