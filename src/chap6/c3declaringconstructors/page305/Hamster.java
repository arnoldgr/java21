package chap6.declaringconstructors.page305;

//Calling Overloaded Constructors with this()
//Have the basics about creating and referencing constructors? Good,
// because things are about to get a bit more complicated.
// Since a class can contain multiple overloaded constructors,
// these constructors can actually call one another.
// Let’s start with a simple class containing two overloaded constructors:
public class Hamster {
    private String color;
    private int weight;

    public Hamster(int weight, String color) {  // First constructor
        this.weight = weight;
        this.color = color;
    }
    public Hamster(int weight) {                // Second constructor
        this.weight = weight;
        color = "brown";
    }
}

    //One of the constructors takes a single int parameter.
// The other takes an int and a String.
// These parameter lists are different, so the constructors are successfully overloaded.
//There is a bit of duplication, as this.weight is assigned the same way in both constructors.
// In programming, even a bit of duplication tends to turn into a lot of duplication as we keep
// adding “just one more thing.”
// For example, imagine that we have five variables being set like this.weight,
// rather than just one.
// What we really want is for the first constructor to call the second constructor with two parameters.
// So, how can you have a constructor call another constructor?
// You might be tempted to rewrite the first constructor as the following:
//public Hamster(int weight) {  // Second constructor
//    Hamster(weight, "brown");  // DOES NOT COMPILE
//}
//}
//
//This will not work. Constructors can be called only by writing new before the name of the constructor.
// They are not like normal methods that you can just call.
// What happens if we stick new before the constructor name?
//    public Hamster(int weight) {      // Second constructor
//        new Hamster(weight, "brown");  // Compiles, but creates an extra object
//    }
//}
//
//This attempt does compile. It doesn’t do what we want, though.
// When this constructor is called, it creates a new object with the default weight and color.
// It then constructs a different object with the desired weight and color.
// In this manner, we end up with two objects, one of which is discarded after it is created.
// That’s not what we want. We want weight and color set on the object we are trying to instantiate in the first place.
//Java provides a solution: this()—yes, the same keyword we used to refer to instance members,
// but with parentheses.
// When this() is used with parentheses, Java calls another constructor on the same instance of the class.
//    public Hamster(int weight) {  // Second constructor
//        this(weight, "brown");
//    }
//}
//Success! Now Java calls the constructor that takes two parameters, with weight and color set as expected.
//
//
//
