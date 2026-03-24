package chap7.a1ImplementingInterfaces.page360.page364;

//Inheriting an Interface
//Like an abstract class, when a concrete class inherits an interface,
// all of the inherited abstract methods must be implemented.
// We illustrate this principle in Figure 7.3.
// How many abstract methods does the concrete Swan class inherit?

interface Fly {
    void fly();
}
interface Swim {
    void swim();
}
abstract class Animal {
  abstract int getType();
        }
abstract class Bird extends Animal implements Fly {
    abstract boolean canSwoop();
}
class Swan extends Bird implements Swim {

    @Override
    boolean canSwoop() {
        return false;
    }

    @Override
    int getType() {
        return 0;
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}