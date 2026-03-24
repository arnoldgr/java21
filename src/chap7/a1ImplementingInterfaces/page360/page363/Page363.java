package chap7.a1ImplementingInterfaces.page360.page363;

//Extending an Interface
//Like a class, an interface can extend another interface using the extends keyword.
//interface Nocturnal {}
//
//interface HasBigEyes extends Nocturnal {}

//Unlike a class, which can extend only one class, an interface can extend multiple interfaces.
interface Nocturnal {
    public int hunt();
}

interface CanFly {
    public void flap();
}

interface HasBigEyes extends Nocturnal, CanFly {}
//
class Owl implements HasBigEyes {
    public int hunt() { return 5; }
    public void flap() { System.out.println("Flap!"); }
}
//
//In this example, the Owl class implements the HasBigEyes interface and must implement the hunt() and flap() methods.
//Extending two interfaces is permitted because interfaces are not initialized as part of a class hierarchy.
// Unlike abstract classes, they do not contain constructors and are not part of instance initialization.
// Interfaces simply define a set of rules and methods that a class implementing them must follow.



