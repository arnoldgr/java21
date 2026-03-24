package chap7.a1ImplementingInterfaces.page360.page371;

//Calling a default Method
//A default method exists on any object inheriting the interface,
// not on the interface itself. In other words, you should treat it like an inherited method
// that can be optionally overridden, rather than as a static method. Consider the following:
interface Dance {
    default int getRhythm() {
        return 33;
    }
}

class Snake implements Dance {
    static void move() {
        var snake = new Snake();
        System.out.print(snake.getRhythm());
//        System.out.print(Dance.getRhythm()); // DOES NOT COMPILE
    }
}

//The first call to getRhythm() compiles because it is called on an instance of the Snake class.
// The second does not compile because it is not a static method and requires an instance of Dance.
//In the previous section, we showed how our Cat class could override a pair of conflicting default methods,
// but what if the Cat class wanted to access the “hidden” version of getSpeed() in Walk or Run? Is it still accessible?
//Yes, but it requires some special syntax.
class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }

    public int getWalkSpeed() {
        return Walk.super.getSpeed();
    }
}

//This is an area where a default method getSpeed() exhibits properties of both an
// instance and static method. We use the interface name to indicate which method we want to call,
// but we use the super keyword to show that we are following instance inheritance, not class inheritance.
// Note that calling Walk.this.getSpeed() would not have worked.
// A bit confusing, we know, but you need to be familiar with this syntax for the exam

