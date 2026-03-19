package chap6.writinglambdas;

import java.util.*;

// Writing Simple Lambdas
// Demonstrates replacing traditional classes with lambda expressions

class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }

    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }

    public String toString() { return species; }
}

// Functional interface (ONLY ONE abstract method)
interface CheckTrait {
    boolean test(Animal a);
}

public class Page374 {

    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));

        // Lambda: replaces implementation class
        print(animals, a -> a.canHop());

        // Another lambda
        print(animals, a -> a.canSwim());
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) {
                System.out.println(animal);
            }
        }
    }
}

/*
Old way (NO lambda):

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

print(animals, new CheckIfHopper());

Lambda replaces all of that:
a -> a.canHop()
*/