package chap6.declaringconstructors.page306;

//this vs. this()

//Despite using the same keyword, this and this() are very different.
// The first, this, refers to an instance of the class, while the second, this(),
// refers to a constructor call within the class.
// The exam may try to trick you by using both together, so make sure you know which one to use and why.

//   Calling this() has one special rule you need to know.
//   If you choose to call it, the this() call must be the first statement in the constructor.
//   The side effect of this is that there can be only one call to this() in any constructor.
class Hamster {
    public Hamster(int weight) {
        System.out.println("chew");
        // Set weight and default color
//           this(weight, "brown");     // DOES NOT COMPILE
    }
}

//Even though a print statement on line 15 doesn’t change any variables,
// it is still a Java statement and is not allowed to be inserted before the call to this().
// The comment on line 16 is just fine.
// aren’t considered statements and are allowed anywhere.
