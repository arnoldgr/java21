package chap6.inheritingmembers.page322;

//Rule #2: Access Modifiers
//What’s the purpose of the second rule about access modifiers?
// Let’s try an illustrative example:
class Camel {
    public int getNumberOfHumps() {
        return 1;
    }
}

class BactrianCamel extends Camel {
//    private int getNumberOfHumps() {  // DOES NOT COMPILE
//        return 2;
//    }
}

//In this example, BactrianCamel attempts to override the getNumberOfHumps() method defined
// in the parent class but fails because the access modifier private is more restrictive than
// the one defined in the parent version of the method. Let’s say BactrianCamel was allowed to compile, though.
// What would this program print?
public class Rider {
    public static void main(String[] args) {
        Camel c = new BactrianCamel();
        System.out.print(c.getNumberOfHumps());  // ???
    }
}

//The answer is, we don’t know. The reference type for the object is Camel,
// where the method is declared public, but the object is actually an instance of type BactrianCamel,
// where the method is declared private.
// Java avoids these types of ambiguity problems by limiting overriding a method to
// access modifiers that are as accessible or more accessible than the version in the inherited method.
