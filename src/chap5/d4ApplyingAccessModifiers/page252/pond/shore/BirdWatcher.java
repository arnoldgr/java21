package chap5.ApplyingAccessModifiers.page252.pond.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();               // protected access is ok
        System.out.print(bird.text);       // protected access is ok
    }
}

//
// The definition of protected allows access to subclasses and classes in the same package.
// This example uses the same package part of that definition.

