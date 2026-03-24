package chap7.d4EncapsulatingDataWithRecords.page392;

//Overloaded Constructors
//You can also create overloaded constructors that take a completely different list of parameters.
//They are more closely related to the long-form constructor and don’t use any of the syntactical
//features of compact constructors.
record Crane(int numberEggs, String name) {
    public Crane(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }
}

// The first line of an overloaded constructor must be an explicit call to another constructor via this().
// If there are no other constructors, the long constructor must be called.
// Contrast this with what you learned about in Chapter 6, where calling super() or this()
// was often optional in constructor declarations.
// Also, unlike compact constructors, you can only transform the data on the first line. After the first line,
// all of the fields will already be assigned, and the object is immutable.
//record Crane(int numberEggs, String name) {
//    public Crane(int numberEggs, String firstName, String lastName) {
//        this(numberEggs + 1, firstName + " " + lastName);
//        numberEggs = 10; // NO EFFECT (applies to parameter, not instance field)
//        this.numberEggs = 20; // DOES NOT COMPILE
//    }
//}





//Only the long constructor, with fields that match the record declaration, supports setting field values with a this reference. Compact and overloaded constructors do not.




//As you saw in Chapter 6, you also can’t declare two record constructors that call each other infinitely or as a cycle.
//public record Crane(int numberEggs, String name) {
//    public Crane(String name) {
//        this(1);  // DOES NOT COMPILE
//    }
//    public Crane(int numberEggs) {
//        this("");  // DOES NOT COMPILE
//    }
//}
