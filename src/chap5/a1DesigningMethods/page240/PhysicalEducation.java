package chap5.a1DesigningMethods.page240;

//If you do have multiple parameters, you separate them with a comma.
// There are a couple more rules for the parameter list that you’ll see when we cover varargs shortly.
// For now, let’s practice looking at method declarations with “regular” parameters:

public class PhysicalEducation {
    public void run1() {}
//    public void run2 {}                // DOES NOT COMPILE
    public void run3(int a) {}
//    public void run4(int a; int b) {}  // DOES NOT COMPILE
    public void run5(int a, int b) {}
}

//The run1() method is a valid declaration without any parameters.
// The run2() method doesn’t compile because it is missing the parentheses around the parameter list.
// The run3() method is a valid declaration with one parameter.
// The run4() method doesn’t compile because the parameters are separated
// by a semicolon rather than a comma. Semicolons are for separating statements,
// not for parameter lists. The run5() method is a valid declaration with two parameters.

