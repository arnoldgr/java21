package chap7.d4EncapsulatingDataWithRecords.page390;

//Declaring Constructors
//What if you need to declare a record with some guards as we did earlier? In this section,
// we cover two ways we can accomplish this with records.
//
//The Long Constructor
//First, we can just declare the constructor the compiler normally inserts automatically,
// which we refer to as the long constructor.

//record Crane(int numberEggs, String name) {
//    public Crane(int numberEggs, String name) {
//        if (numberEggs < 0) throw new IllegalArgumentException();
//        this.numberEggs = numberEggs;
//        this.name = name.toUpperCase();
//    }
//}

//The compiler will not insert a constructor if you define one with the same list of parameters in the same order.
//
// Since each field is final, the constructor must set every field. For example, this record does not compile:
//record Crane(int numberEggs, String name) {
//    public Crane(int numberEggs, String name) {}  // DOES NOT COMPILE
//}

//While being able to declare a constructor is a nice feature of records, it’s also problematic.
// If we have 20 fields, we’ll need to declare assignments for every one,
// introducing the boilerplate we sought to remove. Oh, bother!

//Compact Constructors
//Luckily, the authors of Java added the ability to define a compact constructor for records.
// A compact constructor is a special type of constructor used for records to process validation
// and transformations succinctly. It takes no parameters and implicitly sets all fields.

// Figure 7.7 shows an example of a compact constructor.
record Crane(int numberEggs, String name) {
    public Crane  {
        if (numberEggs < 0) throw new IllegalArgumentException();
        name = name.toUpperCase();
    }
}
//note: There are no parenthesis or constructor parameters and
// we are changing the parameter name to uppercase not the instance variable

//Great! Now we can check the values we want, and we don’t have to list all the constructor
// parameters and trivial assignments.
// Java will execute the full constructor after the compact constructor.
// You should also remember that a compact constructor is declared without parentheses,
// as the exam might try to trick you on this.
// As shown in Figure 7.7, we can even transform constructor parameters as we discuss more in the next section.


