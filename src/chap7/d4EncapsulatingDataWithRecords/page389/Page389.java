package chap7.d4EncapsulatingDataWithRecords.page389;

//Members Automatically Added to Records
//
//Constructor: A constructor with the parameters in the same order as the record declaration
//Accessor method: One accessor for each field
//equals(): A method to compare two elements that returns true if each field is equal in terms of equals()
//hashCode(): A consistent hashCode() method using all of the fields
//toString(): A toString() implementation that prints each field of the record in a convenient, easy-to-read format
//
//The following shows examples of the new methods. Remember that the println() method will call the toString() method automatically on any object passed to it.
record Crane(int numberEggs, String name) {
}
public class Page389 {
    public static void main(String[] args) {
        var father = new Crane(0, "Craig");
        System.out.println(father);               // Crane[numberEggs=0, name=Craig]
        var copy = new Crane(0, "Craig");
        System.out.println(copy);                 // Crane[numberEggs=0, name=Craig]
        System.out.println(father.equals(copy));  // true
        System.out.println(father.hashCode() + ", " + copy.hashCode()); // 1007, 1007

//        That’s the basics of records. We say “basics” because there’s a lot more you can do with them,
//        as you see in the next sections.

//        Given our one-line declaration of Crane, imagine how much code and work would be required to
//        write an equivalent class. It could easily take 40+ lines!
//        It might be a fun exercise to try to write all the methods that records supply.

//        This is not the kind of thing you’d use in your own code, but it could come up on the exam.
    }
}
//        Fun fact: it is legal to have a record without any fields.
//        It is simply declared with the record keyword and parentheses:
        record Crane2() {}

