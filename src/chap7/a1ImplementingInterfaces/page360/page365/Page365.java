package chap7.a1ImplementingInterfaces.page360.page365;

//Inheriting Duplicate Abstract Methods
//Java supports inheriting two abstract methods that have compatible method declarations.
//interface Herbivore {
//    public int eatPlants(int plantsLeft);
//}
//
//interface Omnivore {
//    public int eatPlants(int foodRemaining);
//}
//
//class Bear implements Herbivore, Omnivore {
//    public int eatPlants(int plants) {
//        System.out.print("Eating plants");
//        return plants - 1;
//    }
//}

//By compatible, we mean a method can be written that properly overrides both inherited methods:
// for example, by using covariant return types that you learned about in Chapter 6.
// Notice that the method parameter names don’t need to match, just the type.

//The following is an example of an incompatible declaration:
interface Herbivore {
    public void eatPlants(int plantsLeft);
}

interface Omnivore {
    public int eatPlants(int foodRemaining);
}

//class Tiger implements Herbivore, Omnivore { // DOES NOT COMPILE
//    // Doesn't matter!
//}
//
//The implementation of Tiger doesn’t matter in this case since it’s impossible to write a version of Tiger that
// satisfies both inherited abstract methods.
// The code does not compile, regardless of what is declared inside the Tiger class.
