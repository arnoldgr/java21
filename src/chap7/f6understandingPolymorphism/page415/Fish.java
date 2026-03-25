package chap7.f6understandingPolymorphism.page415;

//Now the code snippet doesn’t throw an exception at runtime and performs
// the cast only if the instanceof operator is successful.
//Just as the compiler does not allow casting an object to unrelated types,
// it also does not allow instanceof to be used with unrelated types.
// We can demonstrate this with our unrelated Bird and Fish classes:
class Bird {
}

public class Fish {
    public static void main(String[] args) {
        Fish fish = new Fish();
//        if (fish instanceof Bird b) {  // DOES NOT COMPILE
//            // Do stuff
//        }
    }
}