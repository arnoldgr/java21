package chap6.creatingabstractclasses.page333;

public class Page333 {
}

    //    Creating a Concrete Class
//    An abstract class becomes usable when it is extended by a concrete subclass.
//    A concrete class is a non-abstract class.
//    The first concrete subclass that extends an abstract class is required to implement all inherited abstract methods.
//    This includes implementing any inherited abstract methods from inherited interfaces, as you see in the next chapter.
//    When you see a concrete class extending an abstract class on the exam,
//    check to make sure that it implements all of the required abstract methods. Can you see
//    why the following Walrus class does not compile?
    abstract class Animal {
        public abstract String getName();
    }

//    class Walrus extends Animal {} // DOES NOT COMPILE

    //    In this example, we see that Animal is marked as abstract and Walrus is not,
//    making Walrus a concrete subclass of Animal.
//    Since Walrus is the first concrete subclass, it must implement all inherited abstract methods—getName()
//    in this example. Because it doesn’t, the compiler reports an error with the declaration of Walrus.
//    We highlight the first concrete subclass for a reason.
//    An abstract class can extend a non-abstract class and vice versa.
//    Anytime a concrete class is extending an abstract class,
//    it must implement all of the methods that are inherited as abstract.
//    Let’s illustrate this with a set of inherited classes:
//    abstract class Mammal {
//        abstract void showHorn();
//
//        abstract void eatLeaf();
//    }
//
//    abstract class Rhino extends Mammal {
//        void showHorn() {
//        }  // Inherited from Mammal
//    }
//
//    class BlackRhino extends Rhino {
//        void eatLeaf() {
//        }   // Inherited from Mammal
//    }
//}

    //    In this example, the BlackRhino class is the first concrete subclass,
//    while the Mammal and Rhino classes are abstract.
//    The BlackRhino class inherits the eatLeaf() method as abstract and is therefore
//    required to provide an implementation, which it does.
//    What about the showHorn() method? Since the parent class, Rhino,
//    provides an implementation of showHorn(), the method is inherited in the BlackRhino
//    as a non-abstract method. For this reason, the BlackRhino class is permitted but
//    not required to override the showHorn() method.
//    The three classes in this example are correctly defined and compile.
//    What if we changed the Rhino declaration to remove the abstract modifier?
//    class Rhino extends Mammal {  // DOES NOT COMPILE
//        void showHorn() {}
//    }
//
//    By changing Rhino to a concrete class, it becomes the first non-abstract class to extend the abstract Mammal class. Therefore, it must provide an implementation of both the showHorn() and eatLeaf() methods. Since it only provides one of these methods, the modified Rhino declaration does not compile.
//    Let’s try one more example. The following concrete class Lion inherits two abstract methods, getName() and roar():
//    abstract class Animal {
//        abstract String getName();
//    }
//
//    abstract class BigCat extends Animal {
//        protected abstract void roar();
//    }
//
//    class Lion extends BigCat {
//        public String getName() {
//            return "Lion";
//        }
//
//        public void roar() {
//            System.out.println("The Lion lets out a loud ROAR!");
//        }
//    }
//}
//
//    In this sample code, BigCat extends Animal but is marked as abstract;
//    therefore, it is not required to provide an implementation for the getName() method.
//    The class Lion is not marked as abstract, and as the first concrete subclass,
//    it must implement all of the inherited abstract methods not defined in a parent class.
//    All three of these classes compile successfully.
//
