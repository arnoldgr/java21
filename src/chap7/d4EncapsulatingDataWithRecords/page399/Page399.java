package chap7.d4EncapsulatingDataWithRecords.page399;

//Customizing Records
//Since records are data-oriented, we’ve focused on the features of records you are likely to use.
// Records actually support many of the same features as a class.
// Here are some of the members that records can include and that you should be familiar with for the exam:
//
//Overloaded and compact constructors
//Instance methods including overriding any provided methods (accessors, equals(), hashCode(), toString())
//Nested classes, interfaces, annotations, enums, and records
//
//As an illustrative example, the following overrides two instance methods using the optional @Override annotation:
record Crane(int numberEggs, String name) {
    @Override public int numberEggs() { return 10; }
    @Override public String toString() { return name; }
}

//While you can add methods, static fields, and other data types, you cannot add instance fields outside
//the record declaration, even if they are private and final.
// Doing so defeats the purpose of using a record and could break immutability!
//  record Crane(int numberEggs, String name) {
//    private static int TYPE = 10;
//    public int size;                        // DOES NOT COMPILE
//    private final boolean friendly = true;  // DOES NOT COMPILE
//}
//
//Records also do not support instance initializers. All initialization for the fields of a record must happen in a constructor. They do support static initializers, though.
//
//
//
//  record Crane(int numberEggs, String name) {
//    static { System.out.print("Hello Bird!"); }
//    { System.out.print("Goodbye Bird!"); }  // DOES NOT COMPILE
//    { this.name = "Big"; }                  // DOES NOT COMPILE
//}
//
//In this example, the first initializer compiles because it is static, while the second and third do not because they are instance initializers.
//
//
//
//
//While it’s a useful feature that records support many of the same members as a class, try to keep them simple. Like the POJOs and JavaBeans they were born out of, the more complicated they get, the less usable they become.
//
//
//
//
//This is the second time we’ve mentioned nested types, the first being with sealed classes and now records. Don’t worry; we’re covering them soon!
