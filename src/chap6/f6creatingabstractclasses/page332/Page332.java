package chap6.creatingabstractclasses.page332;


//    Declaring Abstract Methods
//    An abstract method is always declared without a body. It also includes a semicolon (;)
//    after the method declaration.
//    As you saw in the previous example, an abstract class may include non-abstract methods,
//    in this case with the bark() method.
//    In fact, an abstract class can include all of the same members as a non-abstract class,
//    including variables, static and instance methods, constructors, etc.
//    It might surprise you to know that an abstract class is not required to
//    include any abstract methods. For example, the following code compiles even though it doesn’t
//    define any abstract methods:
    abstract class Llama {
        public void chew() {}
    }

//    Even without abstract methods, the class cannot be directly instantiated.
//    For the exam, keep an eye out for abstract methods declared outside abstract classes, such as the following:
//    public class Egret {  // DOES NOT COMPILE
//        public abstract void peck();
//    }
//    The exam creators like to include invalid class declarations, mixing non-abstract classes with abstract methods.

//    Like the final modifier, the abstract modifier can be placed before or after
//    the access modifier in class and method declarations, as shown in this Tiger class:
//     class abstract Tiger {
//        abstract public int claw();
//    }

//    The abstract modifier cannot be placed after the class keyword in a class declaration
//    or after the return type in a method declaration.
//    The following Bear and howl() declarations do not compile for these reasons:
//    class abstract Bear {    // DOES NOT COMPILE
//        public int abstract howl();  // DOES NOT COMPILE
//    }

//    It is not possible to define an abstract method that has a body or default implementation.
//    You can still define a default method with a body—you just can’t mark it as abstract.
//    As long as you do not mark the method as final, the subclass has the option to override the inherited method.

