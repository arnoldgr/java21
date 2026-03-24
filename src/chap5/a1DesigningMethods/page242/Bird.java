package chap5.DesigningMethods.page242;

//Method Body
//The final part of a method declaration is the method body.
// A method body is simply a code block.
// We’ve spent several chapters looking at Java statements by now,
// so you should find it easy to figure out why the following compile or don’t

public class Bird {
    public void fly1() {}
//    public void fly2()        // DOES NOT COMPILE
    public void fly3(int a) { int name = 5; }
}

//The fly1() method is a valid declaration with an empty method body.
// around the empty method body.
//The fly2() method doesn’t compile because it is missing the braces around the
// empty method body. Methods are required to have a body unless they are declared abstract.
// We cover abstract methods in Chapter 6, “Class Design.”
// The fly3() method is a valid declaration with one statement in the method body.
// Methods are required to have a body unless they are declared abstract.
// We cover abstract methods in Chapter 6, “Class Design.” The fly3() method is a valid
// declaration with one statement in the method body.
//Congratulations! You’ve made it through the basics of identifying correct and
// incorrect method declarations. Now you can delve into more detail.

