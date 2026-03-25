package chap7.f6understandingPolymorphism.page415;

//The instanceof Operator
//The instanceof operator can be used to check whether an object belongs
// to a particular class or interface and to prevent a ClassCastException at runtime.
// As we saw in Chapter 3, it can also be used with pattern matching.
// Consider the following example:
class Rodent {
}

public class Capybara extends Rodent {
    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        var capybara = (Capybara) rodent;  // ClassCastException

//This program throws an exception on line 6. We can replace line 6 with the following:
        if (rodent instanceof Capybara c) {
            // Do stuff
        }
    }
}

