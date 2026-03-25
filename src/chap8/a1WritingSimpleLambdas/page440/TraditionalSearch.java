package chap8.a1WritingSimpleLambdas.page440;

import java.util.ArrayList;
import java.util.List;
//Writing Simple Lambdas
//Java is an object-oriented language at heart.
// You’ve seen plenty of objects by now.
// Functional programming is a way of writing code more declaratively.
// You specify what you want to do rather than dealing with the state of objects.
// You focus more on expressions than loops.
//Functional programming uses lambda expressions to write code.
// A lambda expression is a block of code that gets passed around.
// You can think of a lambda expression as an unnamed method existing
// inside an anonymous class like the ones you saw in Chapter 7, “Beyond Classes.”
// It has parameters and a body just like full-fledged methods do,
// but it doesn’t have a name like a real method. Lambda expressions are often
// referred to as lambdas for short.
// You might also know them as closures if Java isn’t your first language.
// If you had a bad experience with closures in the past, don’t worry.
// They are far simpler in Java.
//Lambdas allow you to write powerful code in Java.
// In this section, we cover an example of why lambdas are helpful and the syntax of lambdas.

// Looking at a Lambda Example
// Our goal is to print out all the animals in a list according to some criteria.
// We show you how to do this without lambdas to illustrate how lambdas are useful.
// We start with the Animal record.
record Animal(String species, boolean canHop, boolean canSwim) {
}

//The Animal record has three fields. Let’s say we have a list of animals,
// and we want to process the data based on a particular attribute.
// For example, we want to print all animals that can hop.
// We can define an interface to generalize this concept and support a large variety of checks.
interface CheckTrait {
    boolean test(Animal a);
}

//The first thing we want to check is whether the Animal can hop.
// We provide a class that implements our interface.
class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

// This class may seem simple—and it is.
// This is part of the problem that lambdas solve.
// Just bear with us for a bit. Now we have everything we need to write our code to find out if an Animal can hop.

public class TraditionalSearch {
    public static void main(String[] args) {

        // list of animals
        var animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        // pass class that does check
        print(animals, new CheckIfHopper());
//        print(animals, a -> a.canHop());
//        print(animals, (Animal a )->{ return a.canHop();});
//        print(animals, (Animal a) -> a.canHop());
//        print(animals, a -> {return a.canHop();});

    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {

            // General check
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}

//Line 53 shows configuring an ArrayList with a specific type of Animal.
// The print() method on line 60 is very general—it can check for any trait.
// This is good design.
// It shouldn’t need to know what specifically we are searching for in order to print a list of animals.
// What happens if we want to print the Animals that swim? Sigh.
// We need to write another class, CheckIfSwims.
// Granted, it is only a few lines, but it is a whole new file.
// Then we need to add a new line under line 60 that instantiates that class.
// That’s two things just to do another check.
// Why can’t we specify the logic we care about right here? It turns out that we can, with lambda expressions.
// We could repeat the whole class here and make you find the one line that changed.
// Instead, we just show you that we can keep our print() method declaration unchanged.
// Let’s replace line 13 with the following, which uses a lambda:

//  print(animals, a -> a.canHop());

// Don’t worry that the syntax looks a little funky.
// You’ll get used to it, and we describe it in the next section.
// We also explain the bits that look like magic.
// For now, just focus on how easy it is to read. We are telling Java that we only care if an Animal can hop.
// It doesn’t take much imagination to figure out how we would add logic to get the Animals that can swim.
// We only have to add one line of code—no need for an extra class to do something simple. Here’s that other line:
//        13:       print(animals, a -> a.canSwim());
//
//How about Animals that cannot swim?
//        13:       print(animals, a -> !a.canSwim());

//The point is that it is really easy to write code that uses lambdas once you get the basics in place.
// This code uses a concept called deferred execution, which means that code is specified now but will run later.
// In this case, “later” is inside the print() method body, as opposed to when it is passed to the method.






