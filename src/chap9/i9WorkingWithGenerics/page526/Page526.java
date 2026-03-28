package chap9.i9WorkingWithGenerics.page526;


//Working with Generics
//We conclude this chapter with one of the most useful, and at times most confusing, features in the Java language:
// generics. In this section, we present more advanced topics including creating generic classes and methods.

//Creating Generic Classes
//You can introduce generics into your own classes. T
// he syntax for introducing a generic is to declare a formal type parameter in angle brackets.
// For example, the following class named Crate has a generic type variable declared after the name of the class:

class Crate<T> {
    private T contents;

    public T lookInCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
        System.out.println(contents);
    }
}

//The generic type T is available anywhere within the Crate class.
// When you instantiate the class, you tell the compiler what T should be for that particular instance.

//Naming Conventions for Generics

//A type parameter can be named anything you want.
// The convention is to use single uppercase letters to make it obvious that
// they aren’t real class names. T
// he following are common letters to use:

//E for an element
//K for a map key
//V for a map value
//N for a number
//T for a generic data type
//S, U, V, and so forth for multiple generic types
class Elephant {
    static String name = "Elephant";

    @Override
    public String toString() {
        return "Elephant";
    }
}

class Zebra {
}

class Robot {
}

public class Page526 {
    public static void main() {

//  For example, suppose an Elephant class exists, and we are moving our elephant
//  to a new and larger enclosure in our zoo.
//
//  (The San Diego Zoo did this in 2009. It was interesting seeing the large metal crate.)
        Elephant elephant = new Elephant();
        Crate<Elephant> crateForElephant = new Crate<>();
        crateForElephant.packCrate(elephant);
        Elephant inNewHome = crateForElephant.lookInCrate();

//To be fair, we didn’t pack the crate so much as the elephant walked into it.
// However, you can see that the Crate class is able to deal with an Elephant without knowing anything about it.
//This probably doesn’t seem particularly impressive.
// We could have just typed in Elephant instead of T when coding Crate.
// What if we wanted to create a Crate for another animal?
        Crate<Zebra> crateForZebra = new Crate<>();

//Now we couldn’t have simply hard-coded Elephant in the Crate class since a Zebra is not an Elephant.
// However, we could have created an Animal superclass or interface and used that in Crate.
//Generic classes become useful when the classes used as the type parameter can have absolutely
// nothing to do with each other. For example, we need to ship our 120-pound robot to another city.
        Robot joeBot = new Robot();
        Crate<Robot> robotCrate = new Crate<>();
        robotCrate.packCrate(joeBot);
// ship to Houston
        Robot atDestination = robotCrate.lookInCrate();


//Now it is starting to get interesting. The Crate class works with any type of class.
// Before generics, we would have needed Crate to use the Object class for its instance variable,
// which would have put the burden on the caller to cast the object it receives on emptying the crate.
//In addition to Crate not needing to know about the objects that go into it,
// those objects don’t need to know about Crate.
// We aren’t requiring the objects to implement an interface named Crateable or the like.
// A class can be put in the Crate without any changes at all.


//Don’t worry if you can’t think of a use for generic classes of your own.
// Unless you are writing a library for others to reuse, generics hardly show up in the class
// definitions you write.
// You’ve already seen them frequently in the code you call, such as functional interfaces and collections.


    }
}