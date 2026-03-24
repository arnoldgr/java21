package chap7.d4EncapsulatingDataWithRecords.page393;

//Understanding Record Immutability
//As you saw, records don’t have setters.
// Every field is inherently final and cannot be modified after it has been written in the constructor.
// To “modify” a record, you have to make a new object and copy all of the data you want to preserve.
//record Crane(int numberEggs, String name) {
//    public Crane(String firstName, String lastName) {
//        this(0, firstName + " " + lastName);
//    }
//}
//public class Page393 {
//    public static void main(String[] args) {
//        var cousin = new Crane(3, "Jenny");
//        var friend = new Crane(cousin.numberEggs(), "Janeice");
//
//    }
//}

// Just as interfaces are implicitly abstract, records are also implicitly final.
// The final modifier is optional but assumed.
// final record Crane(int numberEggs, String name) {
//}

// Like enums, that means you can’t extend or inherit a record.
// record BlueCrane() extends Crane {
//}  // DOES NOT COMPILE

//Also like enums, a record can implement a regular or sealed interface,
// provided it implements all of the abstract methods.
interface Bird {

}

record Crane(int numberEggs, String name) implements Bird {
}

//While instance members of a record are final, the static members are not required to be.
//
// For example, the following defines an immutable record in which a static value
// is updated every time a record is created.
record WhoopingCrane(String name, int position) {
    private static int counter = 0;

    public WhoopingCrane(String name) {
        this(name, counter++);
    }
}

//Although well beyond the scope of this book, there are some good reasons to make data-oriented classes
// immutable. Doing so can lead to less error-prone code, as a new object is established any time
// the data is modified.
// It also makes them inherently thread-safe and usable in concurrent frameworks.

