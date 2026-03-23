package chap6.creatingabstractclasses.page330;

//    Creating Abstract Classes
//    When designing a model, we sometimes want to create an entity that cannot be instantiated directly.
//    For example, imagine that we have a Canine class with subclasses Wolf, Fox, and Coyote.
//    We want other developers to be able to create instances of the subclasses,
//    but perhaps we don’t want them to be able to create a Canine instance.
//    In other words, we want to force all objects of Canine to have a particular type at runtime.

//    Introducing Abstract Classes
//    Enter abstract classes. An abstract class is a class declared with the abstract modifier that
//    cannot be instantiated directly and may contain abstract methods.
//    Let’s take a look at an example based on the Canine data model:
abstract class Canine {
}

class Wolf extends Canine {
}

class Fox extends Canine {

}

class Coyote extends Canine {
}


//    In this example, other developers can create instances of Wolf, Fox, or Coyote, but not Canine. Sure, they can pass a variable reference as a Canine, but the underlying object must be a subclass of Canine at runtime.
//    But wait, there’s more! An abstract class can contain abstract methods. An abstract method is a method declared with the abstract modifier that does not define a body. Put another way, an abstract method forces subclasses to override the method.
//    Why would we want this? Polymorphism, of course! By declaring a method abstract, we can guarantee that some version will be available on an instance without having to specify what that version is in the abstract parent class.
//abstract class Canine {
//    public abstract String getSound();
//
//    public void bark() {
//        System.out.println(getSound());
//    }
//}
//
//abstract class Canine {
//    public abstract String getSound();
//
//    public void bark() {
//        System.out.println(getSound());
//    }
//}
//    class Wolf extends Canine {
//        public String getSound() {
//            return "Wooooooof!";
//        }
//    }
//
//    class Fox extends Canine {
//        public String getSound() {
//            return "Squeak!";
//        }
//    }
//
//    class Coyote extends Canine {
//        public String getSound() {
//            return "Roar!";
//        }
//    }


/// /    We can then create an instance of Fox and assign it to the parent type Canine.
/// The overridden method will be used at runtime.
//public class Page330 {
//    public static void main(String[] p) {
//        Canine w = new Fox();
//        w.bark();  // Squeak!
//
//    }
//}



