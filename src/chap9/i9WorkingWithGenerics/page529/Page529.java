package chap9.i9WorkingWithGenerics.page529;

import java.util.ArrayList;
import java.util.List;
//Overloading a Generic Method
//Only one of these two methods is allowed in a class because type erasure will reduce both sets of arguments to (List input).
//class LongTailAnimal {
//    protected void chew(List<Object> input) {}
//    protected void chew(List<Double> input) {}  // DOES NOT COMPILE
//}

////For the same reason, you also can’t overload a generic method from a parent class.
class LongTailAnimal {
    protected void chew(List<Object> input) {}
}

//class Anteater extends LongTailAnimal {
//    protected void chew(List<Double> input) {}  // DOES NOT COMPILE
//}

//Both of these examples fail to compile because of type erasure. In the compiled form, the generic type is dropped, and it appears as an invalid overloaded method. Now, let’s look at another version of the same subclass:

class Anteater extends LongTailAnimal {
    protected void chew(List<Object> input) {}
    protected void chew(ArrayList<Double> input) {}
}

//The first chew() method compiles because it uses the same generic type in the overridden method as the one
// defined in the parent class. The second chew() method compiles as well.
// However, it is an overloaded method because one of the method arguments is a List and the other is an ArrayList.
// When working with generic methods, it’s important to consider the underlying type.

