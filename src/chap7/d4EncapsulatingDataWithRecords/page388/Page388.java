package chap7.d4EncapsulatingDataWithRecords.page388;

//Applying Records
//Our Crane class was 15 lines long.
// We can write that much more succinctly, as shown in Figure 7.6.
// Putting aside the guard clause on numberEggs in the constructor for a moment,
// this record is equivalent and immutable!

//figure 7.6

record Crane(int numberEggs, String name) {
}
//Wow! It’s only one line long!
// A record is a special type of data-oriented class in which the compiler inserts boilerplate code for you.
// In fact, the compiler inserts much more than the 14 lines we wrote earlier.
// As a bonus, the compiler inserts useful implementations of the Object methods equals(), hashCode(), and toString().
// We’ve covered a lot in one line of code!
//Now imagine that we had 10 data fields instead of 2.
// That’s a lot of methods we are saved from writing. And we haven’t even talked about constructors!
// Worse yet, any time someone changes a field, dozens of lines of related code may need to be updated.
// For example, name may be used in the constructor, toString(), equals() method, and so on.
// If we have an application with hundreds of POJOs, a record can save us valuable time.
//Creating an instance of a Crane and printing some fields is easy:


public class Page388 {
    public static void main(String[] args) {
        var mommy = new Crane(4, "Cammy");
        System.out.println(mommy.numberEggs());  // 4
        System.out.println(mommy.name());

        //A few things should stand out here. First, we never defined any constructors or methods in our
        // Crane declaration.
        // How does the compiler know what to do? Behind the scenes,
        // it creates a constructor for you with the parameters in the same order in
        // which they appear in the record declaration.
        // Omitting or changing the type order will lead to compiler errors:

//        var mommy1 = new Crane("Cammy", 4);  // DOES NOT COMPILE
//        var mommy2 = new Crane("Cammy");     // DOES NOT COMPILE

//        For each field, it also creates an accessor as the field name, plus a set of parentheses.
//        Unlike traditional
//        POJOs or JavaBeans, the methods don’t have the prefix get or is.
//        Just a few more characters that records save
//        you from having to type !Finally, records override a number of methods in Object for you.

    }
}

