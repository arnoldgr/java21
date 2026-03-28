package chap9.i9WorkingWithGenerics.page530;

import java.util.ArrayList;
import java.util.List;
//Returning Generic Types
//When you’re working with overridden methods that return generics, the return values must be covariant.
// In terms of generics, this means the return type of the class or interface declared in the
// overriding method must be a subtype of the class defined in the parent class.
// The generic parameter type must match its parent’s type exactly.
//Given the following declaration for the Mammal class, which of the two subclasses, Monkey and Goat, compile?
 class Mammal {
    public List<CharSequence> play() { return new ArrayList<>(); }
    public CharSequence sleep() { return null;}
}

 class Monkey extends Mammal {
    public ArrayList<CharSequence> play() { return null; }
}

//public class Goat extends Mammal {
//    public List<String> play() {  }  // DOES NOT COMPILE
//    public String sleep() {  }
//}

//The Monkey class compiles because ArrayList is a subtype of List. The play() method in the Goat class does not compile, though. For the return types to be covariant, the generic type parameter must match. Even though String is a subtype of CharSequence, it does not exactly match the generic type defined in the Mammal class. Therefore, this is considered an invalid override.
//Notice that the sleep() method in the Goat class does compile since String is a subtype of CharSequence. This example shows that covariance applies to the return type, just not the generic parameter type.
//For the exam, it might be helpful for you to apply type erasure to questions involving generics to ensure that they compile properly. Once you’ve determined which methods are overridden and which are being overloaded, work backward, making sure the generic types match for overridden methods. And remember, generic methods cannot be overloaded by changing the generic parameter type only.

