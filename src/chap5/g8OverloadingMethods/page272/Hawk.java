package chap5.g8OverloadingMethods.page272;

//What about these; why do they not compile?
public class Hawk {
    public void fly(int numMiles) {}
//    public static void fly(int numMiles) {}     // DOES NOT COMPILE
//    public void fly(int numKilometers) {}       // DOES NOT COMPILE
}

//Again, the method signatures of these three methods are the same.
// You cannot declare methods in the same class where the only difference
// is that one is an instance method and one is a static method.
// You also cannot have two methods that have parameter lists with the same
// variable types and in the same order. As we mentioned earlier,
// the names of the parameters in the list do not matter when determining the method signature.
