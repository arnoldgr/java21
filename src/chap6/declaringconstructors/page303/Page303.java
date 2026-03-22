package chap6.declaringconstructors.page303;

//Creating a Constructor
//Let’s start with a simple constructor:
class Bunny {
    public Bunny() {
        System.out.print("hop");
    }
}

//The name of the constructor, Bunny, matches the name of the class, Bunny, and there is no return type, not even void.
// That makes this a constructor.
// Can you tell why these two are not valid constructors for the Bunny class?
class Bunny2 {
    //    public bunny2() {}       // DOES NOT COMPILE
    public void Bunny2() {
    }
}

//The first one doesn’t match the class name because Java is case-sensitive.
// Since it doesn’t match, Java knows it can’t be a constructor and is supposed to be a regular method.
// However, it is missing the return type and doesn’t compile.
// The second method is a perfectly good method but is not a constructor because it has a return type.
//Like method parameters, constructor parameters can be any valid class, array, or primitive type, including generics,
// but may not include var.
//
// For example, the following does not compile:
class Bonobo {
//    public Bonobo(var food) {  // DOES NOT COMPILE
//    }
}

//A class can have multiple constructors, as long as each constructor has a unique constructor signature.
// In this case, that means the constructor parameters must be distinct.
// Like methods with the same name but different signatures, declaring multiple constructors
// with different signatures is referred to as constructor overloading.
// The following Turtle class has four distinct overloaded constructors:

class Turtle {
    private String name;

    public Turtle() {
        name = "John Doe";
    }

    public Turtle(int age) {
        System.out.println("age" + age);
    }

    public Turtle(long age) {
    }

    public Turtle(String newName, String... favoriteFoods) {
        name = newName;
    }


    //Constructors are used when creating a new object.
// This process is called instantiation because it creates a new instance of the class.
// A constructor is called when we write new followed by the name of the class we want to instantiate.
// Here’s an example:
//    new Turtle(15)
    public static void main(String[] args) {
        Turtle t = new Turtle(15);

    }
}

//When Java sees the new keyword, it allocates memory for the new object. It then looks for a constructor with a matching signature and calls it.
