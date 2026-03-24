package chap6.inheritingmembers.page327;

public class Page327 {
}

//    See if you can figure out why each of the method declarations in the SunBear class does not compile:
class Bear {
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }

    public void hibernate() {
        System.out.println("Bear is hibernating");
    }

    public static void laugh() {
        System.out.println("Bear is laughing");
    }
}

class SunBear extends Bear {
//        public void sneeze() {           // DOES NOT COMPILE
//            System.out.println("Sun Bear sneezes quietly");
//        }
//        public static void hibernate() { // DOES NOT COMPILE
//            System.out.println("Sun Bear is going to sleep");
//        }
//        protected static void laugh() {  // DOES NOT COMPILE
//            System.out.println("Sun Bear is laughing");
//        }
}
//    In this example, sneeze() is marked static in the parent class but not in the child class.
//    The compiler detects that you’re trying to override using an instance method.
//    However, sneeze() is a static method that should be hidden, causing the compiler to generate an error.
//    The second method, hibernate(), does not compile for the opposite reason. The method is marked static in the child
//    class but not in the parent class.
//    Finally, the laugh() method does not compile. Even though both versions of the method are marked static,
//    the version in SunBear has a more restrictive access modifier than the one it inherits,
//    and it breaks the second rule for overriding methods. Remember,
//    the four rules for overriding methods must be followed when hiding static methods.


