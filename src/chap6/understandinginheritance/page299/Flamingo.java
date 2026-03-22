package chap6.understandinginheritance.page299;
public class Flamingo {
    private String color = null;
    public void setColor(String color) {
        color = color;
//        this.color = color;
    }
    public static void main(String... unused) {
        var f = new Flamingo();
        f.setColor("PINK");
        System.out.print(f.color);
    }
}
//If you said null, then you’d be correct.
// Java uses the most granular scope, so when it sees color = color,
// it thinks you are assigning the method parameter value to itself (not the instance variable).
// The assignment completes successfully within the method, but the value of the
// instance variable color is never modified and is null when printed in the main() method.
//The fix when you have a local variable with the same name as an instance variable
// is to use the this reference or keyword.
// The this reference refers to the current
// instance of the class and can be used to access any member of the class, including inherited members.
// It can be used in any instance method, constructor, or instance initializer block.
// It cannot be used when there is no implicit instance of the class, such as in a static method
// or static initializer block.
// We apply this to our previous method implementation as follows:

//public void setColor(String color) {
//    this.color = color;  // Sets the instance variable with method parameter
//}

//The corrected code will now print PINK as expected. In many cases, the this reference is optional. If Java encounters a variable or method it cannot find, it will check the class hierarchy to see if it is available.


