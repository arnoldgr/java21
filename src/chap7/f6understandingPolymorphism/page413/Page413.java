package chap7.f6understandingPolymorphism.page413;


//In the previous example, we created a single instance of a Lemur object and accessed it via superclass and interface references. Once we changed the reference type, though, we lost access to more specific members defined in the subclass that still exist within the object. We can reclaim those references by casting the object back to the specific subclass it came from:
class Primate {
    public boolean hasHair() {
        return true;
    }
}

interface HasTail {
    public abstract boolean isTailStriped();
}

class Lemur extends Primate implements HasTail {
    public boolean isTailStriped() {
        return false;
    }

    public int age = 10;
}

public class Page413 {
    public static void main(String[] args) {
        Lemur lemur = new Lemur();

                Primate primate = lemur;        // Implicit Cast to supertype

                Lemur lemur2 = (Lemur)primate;  // Explicit Cast to subtype

//                Lemur lemur3 = primate;         // DOES NOT COMPILE (missing cast)

//In this example, we first create a Lemur object and implicitly cast it to a Primate reference.
// Since Lemur is a subtype of Primate, this can be done without a cast operator.
// We then cast it back to a Lemur object using an explicit cast,
// gaining access to all of the methods and fields in the Lemur class.
// The last line does not compile because an explicit cast is required.
// Even though the object is stored in memory as a Lemur object, we need an explicit cast to assign it to Lemur.
//Casting objects is similar to casting primitives, as you saw in Chapter 2, “Operators.”
// When casting objects, you do not need a cast operator if casting to an inherited supertype.
// This is referred to as an implicit cast and applies to classes or interfaces the object inherits.
// Alternatively, if you want to access a subtype of the current reference,
// you need to perform an explicit cast with a compatible type.
// If the underlying object is not compatible with the type, then a ClassCastException will be thrown at runtime.
// When reviewing a question on the exam that involves casting and polymorphism,
// be sure to remember what the instance of the object actually is.
// Then, focus on whether the compiler will allow the object to be referenced with or without explicit casts.
// We summarize these concepts into a set of rules for you to memorize for the exam:
//
// Casting a reference from a subtype to a supertype doesn’t require an explicit cast.
// Casting a reference from a supertype to a subtype requires an explicit cast.
// At runtime, an invalid cast of a reference to an incompatible type
// results in a ClassCastException being thrown.
// The compiler disallows casts to unrelated types.

    }
}
