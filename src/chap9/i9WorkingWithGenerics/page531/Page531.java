package chap9.i9WorkingWithGenerics.page531;

//Implementing Generic Interfaces
//Just like a class, an interface can declare a formal type parameter. For example, the following Shippable interface uses a generic type as the argument to its ship() method:
interface Shippable<T> {
    void ship(T t);
}

class Robot {
}

//There are three ways a class can approach implementing this interface. The first is to specify the generic type in the class. The following concrete class says that it deals only with robots. This lets it declare the ship() method with a Robot parameter.
class ShippableRobotCrate implements Shippable<Robot> {
    public void ship(Robot t) {
    }
}

//The next way is to create a generic class. The following concrete class allows the caller to specify the type of the generic:
class ShippableAbstractCrate<U> implements Shippable<U> {
    public void ship(U t) {
    }
}

//In this example, the type parameter could have been named anything, including T. We used U in the example to avoid confusion about what T refers to. The exam won’t mind trying to confuse you by using the same type parameter name.
//        The final way is to not use generics at all. This is the old way of writing code. It generates a compiler warning about Shippable being a raw type, but it does compile. Here the ship() method has an Object parameter since the generic type is not defined:
class ShippableCrate implements Shippable {
    public void ship(Object t) {
    }
}
//
//
//
//
//
// Real World Scenario
//
// What You Can’t Do with Generic Types
//
// There are some limitations on what you can do with a generic type.
// These aren’t on the exam, but it will be helpful to refer to this scenario
// when you are writing practice programs and run into one of these situations.
// Most of the limitations are due to type erasure.
// Oracle refers to a type whose information is fully available at runtime as a reifiable type.
// Reifiable types can do anything that Java allows. Non-reifiable types have some limitations.
// Here are the things that you can’t do with generics (and by “can’t,” we mean without resorting to contortions
// like passing in a class object):
//
// Call a constructor: Writing new T() is not allowed because at runtime, it would be new Object().
// Create an array of that generic type:
// This one is the most annoying, but it makes sense because you’d be creating an array of Object values.
// Call instanceof:
// This is not allowed because at runtime List<Integer> and List<String>
// look the same to Java, thanks to type erasure.
// Use a primitive type as a generic type parameter:
// This isn’t a big deal because you can use the wrapper class instead.
// If you want a type of int, just use Integer.
// Create a static variable as a generic type parameter:
// This is not allowed because the type is linked to the instance of the class.
// Catch an exception of type T:
// Even if T extends Exception, it cannot be used in a catch block since the precise type is not known.
