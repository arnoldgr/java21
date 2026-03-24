package chap6.inheritingmembers.page336;


//    abstract and private Modifiers
//    A method cannot be marked as both abstract and private.
//    This rule makes sense if you think about it.
//    How would you define a subclass that implements a required method if the method is not inherited by the subclass?
//    The answer is that you can’t, which is why the compiler will complain if you try to do the following:
//    abstract class Whale {
//        private abstract void sing();  // DOES NOT COMPILE
//    }

//    class HumpbackWhale extends Whale {
//        private void sing() {
//            System.out.println("Humpback whale is singing");
//        } }

//    In this example, the abstract method sing() defined in the parent class Whale is not visible to the subclass
//    HumpbackWhale.
//    Even though HumpbackWhale does provide an implementation, it is not considered an override of the
//    abstract method since the abstract method is not inherited.
//    The compiler recognizes this in the parent class and reports an error as soon as private and abstract
//    are applied to the same method.

//    While it is not possible to declare a method abstract and private,
//    it is possible (albeit redundant) to declare a method final and private.

//    If we changed the access modifier from private to protected in the parent class Whale,
//    would the code compile?
//     abstract class Whale {
//        protected abstract void sing();
//    }

//    public class HumpbackWhale extends Whale {
//        private void sing() {  // DOES NOT COMPILE
//            System.out.println("Humpback whale is singing");
//        }
//    }

//    In this modified example, the code will still not compile,
//    but for a completely different reason.
//    If you remember the rules for overriding a method,
//    the subclass cannot reduce the visibility of the parent method, sing().
//    Because the method is declared protected in the parent class,
//    it must be marked as protected or public in the child class.
//    Even with abstract methods, the rules for overriding methods must be followed.

//abstract and static Modifiers
//As we discussed earlier in the chapter, a static method can only be hidden, not overridden. It is defined as belonging to the class, not an instance of the class. If a static method cannot be overridden, then it follows that it also cannot be marked abstract since it can never be implemented. For example, the following class does not compile:
//abstract class Hippopotamus {
//    abstract static void swim();  // DOES NOT COMPILE
//}

//For the exam, make sure you know which modifiers can and cannot be used with one another,
// especially for abstract classes and interfaces.



