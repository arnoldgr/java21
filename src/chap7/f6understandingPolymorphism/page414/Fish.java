package chap7.f6understandingPolymorphism.page414;

//Disallowed Casts
//The first three rules are just a review of what we’ve said so far.
// The last rule is a bit more complicated. The exam may try to trick you with a cast
// that the compiler knows is not permitted (aka impossible).
// In the previous example, we were able to cast a Primate reference to a
// Lemur reference because Lemur is a subclass of Primate and therefore related. Consider this example instead:
class Bird {}

public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
//        Bird bird = (Bird)fish;  // DOES NOT COMPILE not related
    }
}