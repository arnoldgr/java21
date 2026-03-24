package chap5.a1DesigningMethods.page239;
//Method Name
//Method names follow the same rules we practiced with variable names in Chapter 1, “Building Blocks.”
// To review, an identifier may only contain letters, numbers, currency symbols, or _.
// Also, the first character is not allowed to be a number, and reserved words are not allowed.
// Finally, the single underscore character is not allowed.
//By convention, methods begin with a lowercase letter, but they are not required to.
// Since this is a review of Chapter 1, we can jump right into practicing with some examples:


public class BeachTrip {
    public void jog1() {}
//    public void 2jog() {}   // DOES NOT COMPILE
//    public jog3 void() {}   // DOES NOT COMPILE
    public void Jog_$() {}
//    public _() {}           // DOES NOT COMPILE
//    public void() {}        // DOES NOT COMPILE
}
//The jog1() method is a valid declaration with a traditional name.
// The 2jog() method doesn’t compile because identifiers are not allowed to begin with numbers.
// The jog3() method doesn’t compile because the method name is before the return type.
// The Jog_$() method is a valid declaration. While it certainly isn’t good practice to
// start a method name with a capital letter and end with punctuation, it is legal.
// The _ method is not allowed since it consists of a single underscore.
// The final line of code doesn’t compile because the method name is missing.
