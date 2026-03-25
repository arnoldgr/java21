package chap1.h8InitialisingVariables.page41;

public class VarKeyword {
    //var tricky; var can only be used fpr local variables like below
    //var tricky = "Hello"; // DOES NOT COMPILE
    public void reassignment() {
        //declaration and assignment of var must be in a single statement;
        var number = 7;

        number = 4;
        // number = "five";  // DOES NOT COMPILE, the type for number is now int, cannot assign a String
        // still a single statement
        var silly
                = 1; // valid beacuse it's a single statement
    }
}
