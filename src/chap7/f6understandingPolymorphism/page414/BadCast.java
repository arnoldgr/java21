package chap7.f6understandingPolymorphism.page414;

//Casting Interfaces
//While the compiler can enforce rules about casting to unrelated types for classes,
// it cannot always do the same for interfaces. Remember, interfaces support multiple inheritance,
// which limits what the compiler can reason about them.
// While a given class may not implement an interface,
// it’s possible that some subclass may implement the interface.
// When holding a reference to a particular class,
// the compiler doesn’t know which specific subtype it is holding.
//Let’s try an example. Do you think the following program compiles?


interface Canine {
}

interface Dog {
}

class Wolf implements Canine {
}

class BadCasts {
    public static void main(String[] args) {
        Wolf wolfy = new Wolf();
//        Dog badWolf = (Dog) wolfy;
    } }
//
//
// In this program, a Wolf object is created and then assigned to a Wolf reference type on line 7.
// With interfaces, the compiler has limited ability to enforce many rules
// because even though a reference type may not implement an interface, one of its subclasses could.
// Therefore, it allows the invalid cast to the Dog reference type on line 8,
// even though Dog and Wolf are not related. Fear not, even though the code compiles,
// it still throws a ClassCastException at runtime.
// This limitation aside, the compiler can enforce one rule around interface casting.
// The compiler does not allow a cast from an interface reference to an object reference
// if the object type cannot possibly implement the interface, such as if the class is marked final.
// For example, what if we changed line 3 of our previous code?
//        3: final class Wolf implements Canine {}
//
// Line 8 no longer compiles. The compiler recognizes that there are no possible subclasses of Wolf
// capable of implementing the Dog interface.
