package chap7.d4EncapsulatingDataWithRecords.page387;

//Understanding Encapsulation
//A POJO, which stands for Plain Old Java Object, is a class used to model and pass data around,
// often with few or no complex methods (hence the “plain” part of the definition).
// You might have also heard of a JavaBean, which is POJO that has some additional rules applied.
//Let’s create a simple POJO with two fields:
class Crane {
    int numberEggs;
    String name;

    public Crane(int numberEggs, String name) {
        this.numberEggs = numberEggs;
        this.name = name;
    }
}

// Uh oh, the fields are package access.
// Why do we care? That means someone outside the class in the same package could change
// these values and create invalid data such as this:
class Poacher {
    public void badActor() {
        var mother = new Crane(5, "Cathy");
        mother.numberEggs = -100;
    }
}

//This is clearly no good. We do not want the mother Crane to have a negative number of eggs! Encapsulation to the rescue. Encapsulation is a way to protect class members by restricting access to them. In Java, it is commonly implemented by declaring all instance variables private. Callers are required to use methods to retrieve or modify instance variables.
//Encapsulation is about protecting a class from unexpected use. It also allows us to modify the methods and behavior of the class later without someone already having direct access to an instance variable within the class. For example, we can change the data type of an instance variable but maintain the same method signatures. In this manner, we maintain full control over the internal workings of a class.
//Let’s take a look at the newly encapsulated (and immutable) Crane class:
//final class Crane {
//    private final int numberEggs;
//    private final String name;
//
//    public Crane(int numberEggs, String name) {
//        if (numberEggs >= 0) this.numberEggs = numberEggs;  // guard
//        else throw new IllegalArgumentException();
//        this.name = name;
//    }
//
//    public int getNumberEggs() {         // getter
//        return numberEggs;
//    }
//
//    public String getName() {            // getter
//        return name;
//    }
//}

// Note that the instance variables are now private on lines 32 and 33.
// This means only code within the class can read or write their values.
// Since we wrote the class, we know better than to set a negative number of eggs.
// We added a method on lines 41-46 to read the value, which is called an accessor method or a getter.
// You might have noticed that we marked the class and its instance variables final,
// and we don’t have any mutator methods, or setters, to modify the value of the instance variables.
// That’s because we want our class to be immutable in addition to being well encapsulated.
// As you saw in Chapter 6, the immutable objects pattern is an object-oriented design pattern
// in which an object cannot be modified after it is created.
// Instead of modifying an immutable object, you create a new object that contains any
// properties from the original object you want copied over.

// To review, remember that data is private and getters/setters are public.
// You don’t even have to provide getters and setters.
// As long as the instance variables are private, you are good.
// For example, the following class is well encapsulated,
// although it is not terribly useful since it doesn’t declare any non-private methods:
class Vet {
    private String name = "Dr Rogers";
    private int yearsExperience = 25;
}

//You must omit the setters for a class to be immutable.
// Review Chapter 6 for the additional rules on creating immutable objects.