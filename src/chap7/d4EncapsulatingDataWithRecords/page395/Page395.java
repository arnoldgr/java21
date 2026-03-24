package chap7.d4EncapsulatingDataWithRecords.page395;

//Matching Records
//The last two rules for record matching warrant a bit more discussion.
// Pattern matching for records include matching both the type of the record and the type of each field.
// Given the five pattern matching statements, what does the following code print?
record Fish(Object type) {
}

class Veterinarian {
    public static void main(String[] args) {
        Fish f1 = new Fish("Nemo");
        Fish f2 = new Fish(Integer.valueOf(1));

        if (f1 instanceof Fish(Object t)) {
            System.out.print("Match1-");
        }
        if (f1 instanceof Fish(String t)) {
            System.out.print("Match2-");
        }
        if (f1 instanceof Fish(Integer t)) {
            System.out.print("Match3-");
        }
        if (f2 instanceof Fish(String t)) {
            System.out.print("Match4-");
        }
        if (f2 instanceof Fish(Integer x)) {
            System.out.print("Match5");
        }
    }
}


//The first and second pattern matching statements match because "Nemo"
// can be implicitly cast to Object and String, respectively.
// The third statement compiles but does not match, as "Nemo" cannot be cast to Integer.
// Likewise, the fourth statement compiles but does not match, as the numeric value cannot be cast to String.
// Finally, the last statement matches as the type of both is Integer.
// The code compiles and prints the following at runtime:
//Match1-Match2-Match5

//What happens if we change the declaration of Fish to the following?
//        1:  record Fish(Integer type) {}
//
// First off, our f1 variable declared on line 12 would no longer compile!
// Assuming we fix the variable declaration, though, lines 18 and 24 would not compile.
// The compiler is smart enough to know that no instance of Fish is capable of matching an Integer to a String.

