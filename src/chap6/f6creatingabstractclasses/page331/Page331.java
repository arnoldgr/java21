package chap6.creatingabstractclasses.page331;

//    Easy so far. But there are some rules you need to be aware of:
//
//    Only instance methods can be marked abstract within a class, not variables, constructors, or static methods.
//    An abstract class can include zero or more abstract methods, while a non-abstract class cannot contain any.
//    A non-abstract class that extends an abstract class must implement all inherited abstract methods.
//    Overriding an abstract method follows the existing rules for overriding methods that you learned about
//    earlier in the chapter.

    //    Let’s see if you can spot why each of these class declarations does not compile:
    abstract class Canine {
        public abstract String getSound();

        public void bark() {
            System.out.println(getSound());
        }
    }

//    class FennecFox extends Canine {
//        public int getSound() {
//            return 10;
//        }
//    }

//    class ArcticFox extends Canine {
//    }
//
//    class Direwolf extends Canine {
//        public abstract rest();
//
//        public String getSound() {
//            return "Roof!";
//        }
//    }

//    class Jackal extends Canine {
//        public abstract String name;
//
//        public String getSound() {
//            return "Laugh";
//        }
//    }

//    First off, the FennecFox class does not compile because it is an invalid method override.
//    In particular, the return types are not covariant.
//    The ArcticFox class does not compile because it does not override the abstract getSound() method.
//    The Direwolf class does not compile because it is not abstract but declares an abstract method rest().
//    Finally, the Jackal class does not compile because variables cannot be marked abstract.
//    An abstract class is most commonly used when you want another class to inherit properties of a particular class,
//    but you want the subclass to fill in some of the implementation details.
//

//Earlier, we said that an abstract class is one that cannot be instantiated.
//This means that if you attempt to instantiate it, the compiler will report an exception, as in this example:
//abstract class Alligator {
//    public static void main(String… food) {
////        var a = new Alligator();  // DOES NOT COMPILE
//    }
//}

//An abstract class can be initialized, but only as part of the instantiation of a non-abstract subclass.
