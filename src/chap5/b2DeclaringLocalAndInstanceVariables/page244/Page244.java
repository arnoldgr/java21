package chap5.DeclaringLocalAndInstanceVariables.page244;

public class Page244 {
    //Effectively Final Variables
//An effectively final local variable is one that is not modified after it is assigned.
// This means that the value of a variable doesn’t change after it is set,
// regardless of whether it is explicitly marked as final.
// If you aren’t sure whether a local variable is effectively final, just add the final keyword.
// If the code still compiles, the variable is effectively final.
//Given this definition, which of the following variables are effectively final?
    public String zooFriends() {
        String name = "Harry the Hippo";
        var size = 10;
        boolean wet;
        if (size > 100) size++;
        name.substring(0);
        wet = true;
        return name;
    }
}
//Remember, a quick test of effectively final is to just add final to the variable declaration
// and see if it still compiles.
// In this example, name and wet are effectively final and can be updated with the final modifier,
// but not size.
// The name variable is assigned a value on line 7 and not reassigned.
// Line 11 creates a value that is never used.
// Remember from Chapter 4, “Core APIs,” that strings are immutable.
// The size variable is not effectively final because it could be incremented on line 10.
// The wet variable is assigned a value only once and not modified afterward.

//Effectively Final Parameters
//
//Recall from Chapter 1 that method and constructor parameters are local variables that have been pre-initialized.
// In the context of local variables, the same rules around final and effectively final apply.
// This is especially important in Chapter 7 and Chapter 8, “Lambdas and Functional Interfaces,”
// since local classes and lambda expressions declared within a method can only reference local variables that are final
// or effectively final.

