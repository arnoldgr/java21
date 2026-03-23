package chap6.inheritingmembers;



//Inheriting Members
//Now that we’ve created a class, what can we do with it? One of Java’s biggest strengths is leveraging its inheritance model to simplify code. For example, let’s say you have five classes, each of which extends from the Animal class. Furthermore, each class defines an eat() method with an identical implementation. In this scenario, it’s a lot better to define eat() once in the Animal class than to have to maintain the same method in five separate classes.
//Inheriting a class not only grants access to inherited methods in the parent class but also sets the stage for collisions between methods defined in both the parent class and the subclass. In this section, we review the rules for method inheritance and how Java handles such scenarios.
//We refer to the ability of an object to take on many different forms as polymorphism. We cover this more in the next chapter, but for now you just need to know that an object can be used in a variety of ways, in part based on the reference variable used to call the object.

//Overriding a Method
//What if a method with the same signature is defined in both the parent and child classes? For example, you may want to define a new version of the method and have it behave differently for that subclass. The solution is to override the method in the child class. In Java, overriding a method occurs when a subclass declares a new implementation for an inherited method with the same signature and compatible return type.

//Remember that a method signature is composed of the name of the method and method parameters. It does not include the return type, access modifiers, optional specifiers, or any declared exceptions.

//When you override a method, you may still reference the parent version of the method using the super keyword.
// In this manner, the keywords this and super allow you to select between the current and parent versions of a method,
// respectively.
// We illustrate this with the following example:
class Marsupial {
    public double getAverageWeight() {
        return 50;
    }
}
public class Kangaroo extends Marsupial {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
    }
    public static void main(String[] args) {
        System.out.println(new Marsupial().getAverageWeight());  // 50.0
        System.out.println(new Kangaroo().getAverageWeight());   // 70.0
    }
}

//In this example, the Kangaroo class overrides the getAverageWeight() method but in the process calls the parent
// version using the super reference.