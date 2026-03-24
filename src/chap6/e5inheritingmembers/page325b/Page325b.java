package chap6.inheritingmembers.page325b;

public class Page325b {
}
    //    Redeclaring private Methods
//    What happens if you try to override a private method?
//    In Java, you can’t override private methods since they are not inherited.
//    Just because a child class doesn’t have access to the parent method doesn’t mean
//    the child class can’t define its own version of the method.
//    It just means, strictly speaking, that the new method is not an overridden
//    version of the parent class’s method.
//    Java permits you to redeclare a new method in the child class with the same or
//    modified signature as the method in the parent class.
//    This method in the child class is a separate and independent method, unrelated to the parent version’s method, so none of the rules for overriding methods is invoked. For example, these two declarations compile:
    class Beetle {
        private String getSize() {
            return "Undefined";
        }
    }

    class RhinocerosBeetle extends Beetle {
        private int getSize() {
            return 5;
        }
    }

//    Notice that the return type differs in the child method from String to int.
//    In this example, the method getSize() in the parent class is not inherited, so the method in the child class
//    is a new method and not an override of the method in the parent class.
//    What if the getSize() method was declared public in Beetle?
//    In this case, the method in RhinocerosBeetle would be an invalid override.
//    The access modifier in RhinocerosBeetle is more restrictive, and the return types are not covariant.

