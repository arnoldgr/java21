package chap7.d4EncapsulatingDataWithRecords.page394;

//Using Pattern Matching with Records
//New to Java 21, records have been updated to support pattern matching.
// Initially, you might think this is not actually something new.
// After all, we could use records with pattern matching in Java 17.
// The new feature is really about the members of the record, rather than the record itself. Let’s try an example:
record Monkey(String name, int age) {
}

public class Zoo {
    public static void main(String[] args) {

        Object animal = new Monkey("George", 3);

        if (animal instanceof Monkey(String name, int myAge)) {
            System.out.println("Hello " + name);
            System.out.println("Your age is " + myAge);
        }

    }
}

//Wait, what’s going on in line 16?
// It looks like we redeclared the declaration of the record. Don’t worry, we didn’t!
// What we did do, though, is define a pattern that is compatible with the Monkey record.
// We also named two elements, name and myAge.
// Like the pattern matching you saw in Chapter 3, this allows us to use them
// local variables on line 17 and 18, without a reference variable.
//For the exam, you should be aware of the following rules when working with pattern matching and records:

//If any field declared in the record is included, then all fields must be included.
//The order of fields must be the same as in the record.
//The names of the fields do not have to match.
//At compile time, the type of the field must be compatible with the type declared in the record.
//The pattern may not match at runtime if the record supports elements of various types.

//Working with records and pattern matching has some similarities to casting.
// For example, the compiler will disallow things that it knows to be invalid.
// There are some differences, though, that we will get to shortly.
//Quiz time! Given our previous Monkey record, which of the following lines of code do not compile?
//        11: if(animal instanceof Monkey myMonkey) {}
//        12: if(animal instanceof Monkey(String n, int a) myMonkey) {}
//        13: if(animal instanceof Monkey(String n, long a)) {}
//        14: if(animal instanceof Monkey(Object n, int a)) {}
//
//The first example compiles, as this is just simple pattern matching that we saw in Chapter 3.
// Line 50 does not compile, though. You can name the record or its fields, but not both.
// Line 51 also does not compile, as numeric promotion is not supported.
// The last line does compile, as String is compatible with Object.
