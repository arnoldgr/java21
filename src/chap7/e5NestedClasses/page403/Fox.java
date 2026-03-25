package chap7.e5NestedClasses.page403;

//Inner Classes Require an Instance

//Take a look at the following and see whether you can figure out why two of the three constructor calls do not compile:
public class Fox {
    private class Den {}
    public void goHome() {
        new Den();
    }
//    public static void visitFriend() {
//        new Den();  // DOES NOT COMPILE
//    }
}

class Squirrel {
    public void visitFox() {
//        new Den();  // DOES NOT COMPILE
    }
}
//The first constructor call compiles because goHome() is an instance method, and therefore the call is associated with the this instance. The second call does not compile because it is called inside a static method. You can still call the constructor, but you have to explicitly give it a reference to a Fox instance.
//The last constructor call does not compile for two reasons. Even though it is an instance method, it is not an instance method inside the Fox class. Adding a Fox reference would not fix the problem entirely, though. Den is private and not accessible in the Squirrel class.

