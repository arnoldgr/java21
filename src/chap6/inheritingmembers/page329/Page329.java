package chap6.inheritingmembers.page329;

public class Page329 {
//    Writing final Methods

//    We conclude our discussion of method inheritance with a somewhat self-explanatory rule:
//    final methods cannot be overridden. By marking a method final, you forbid a child class from replacing this method.
//    This rule is in place both when you override a method and when you hide a method.
//    In other words, you cannot hide a static method in a child class if it is marked final in the parent class.
//    Let’s take a look at an example:
    class Bird {
        public final boolean hasFeathers() {
            return true;
        }
        public final static void flyAway() {}
    }

    class Penguin extends Bird {
//        public final boolean hasFeathers() {  // DOES NOT COMPILE
//            return false;
//        }
//        public final static void flyAway() {}  // DOES NOT COMPILE
    }

//    In this example, the instance method hasFeathers() is marked as final in the parent class Bird,
//    so the child class Penguin cannot override the parent method, resulting in a compiler error.
//    The static method flyAway() is also marked final, so it cannot be hidden in the subclass.
//    In this example, whether or not the child method uses the final keyword is irrelevant—the code will not compile either way.
//    This rule applies only to inherited methods.
//    For example, if the two methods were marked private in the parent Bird class,
//    then the Penguin class, as defined, would compile. In that case, the private methods
//    would be redeclared, not overridden or hidden.
}
