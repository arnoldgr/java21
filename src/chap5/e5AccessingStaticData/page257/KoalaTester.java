package chap5.AccessingStaticData.page257;

public class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);          // call static method
// having static methods eliminates the need for the caller to instantiate an object
// just to call the method.
//For state that is shared by all instances of a class, like a counter.
// All instances must share the same state.
// Methods that merely use that state should be static as well.
    }
}