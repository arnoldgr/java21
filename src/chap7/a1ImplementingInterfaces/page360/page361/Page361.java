package chap7.a1ImplementingInterfaces.page360.page361;

//Let’s start with a simple example. Imagine that we have an interface WalksOnTwoLegs, defined as follows:
//
 abstract interface WalksOnTwoLegs {}

//It compiles because interfaces are not required to define any methods.
// The abstract modifier in this example is optional for interfaces,
// with the compiler inserting it if it is not provided.

// Now, consider the following two examples:
//final interface WalksOnEightLegs {}  // DOES NOT COMPILE

class Biped {
    public static void main(String[] args) {
//        var e = new WalksOnTwoLegs();         // DOES NOT COMPILE
    }
}

//The WalksOnEightLegs interface doesn’t compile because interfaces cannot be marked as final
// for the same reason that abstract classes cannot be marked as final.
// Marking an interface final implies no class could ever implement it.
// The Biped class also doesn’t compile, as WalksOnTwoLegs is an interface and cannot be instantiated.

//How do you use an interface? Let’s say we have an interface Climb, defined as follows:
interface Climb {
    Number getSpeed(int age);
}

//Next, we have a concrete class FieldMouse that implements the Climb interface,

class FieldMouse  implements Climb, CanBurrow {

    @Override
    public Float getSpeed(int age) {
        return 0f;
    }
}
//The FieldMouse class declares that it implements the Climb interface and includes an overridden
// version of getSpeed() inherited from the Climb interface.
// The @Override annotation is optional.
// It serves to let other developers know that the method is inherited.
//The method signature of getSpeed() matches exactly, and the return type is covariant,
// since a Float can be implicitly cast to a Number.
// The access modifier of the interface method is implicitly public in Climb,
// although the concrete class FieldMouse must explicitly declare it.
//As shown in Figure 7.2, a class can implement multiple interfaces, each separated by a comma (,).
// If any of the interfaces define abstract methods, then the concrete class is required to override them.
// In this case, FieldMouse implements the CanBurrow interface that we saw in Figure 7.1. In this manner,
// the class overrides two abstract methods at the same time with one method declaration.
// You learn more about duplicate and compatible interface methods in this chapter.
