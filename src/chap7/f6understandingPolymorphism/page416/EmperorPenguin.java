package chap7.f6understandingPolymorphism.page416;

//Polymorphism and Method Overriding
//        In Java, polymorphism states that when you override a method, you replace all calls to it,
//        even those defined in the parent class. As an example,
//        what do you think the following code snippet outputs?
class Penguin {
    public int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());
    } }

public class EmperorPenguin extends Penguin {
    public int getHeight() { return 8; }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo();
    } }

//If you said 8, then you are well on your way to understanding polymorphism.
// In this example, the object being operated on in memory is an EmperorPenguin.
// The getHeight() method is overridden in the subclass, meaning all calls to it are replaced at runtime.
// Despite printInfo() being defined in the Penguin class, calling getHeight()
// on the object calls the method associated with the precise object in memory,
// not the current reference type where it is called.
// Even using the this reference, which is optional in this example,
// does not call the parent version because the method has been replaced.
//Polymorphism’s ability to replace methods at runtime via overriding is one
// of the most important properties of Java. It allows you to create complex
// inheritance models with subclasses that have their own custom implementation
// of overridden methods. It also means the parent class does not need to be updated
// to use the custom or overridden method.
// If the method is properly overridden, then the overridden version will be used in all places that it is called.
// Remember, you can choose to limit polymorphic behavior by marking methods
// final, which prevents them from being overridden by a subclass.

//Calling the Parent Version of an Overridden Method

//Just because a method is overridden doesn’t mean the parent method is completely inaccessible.
// We can use the super reference that you learned about in Chapter 6 to access it.
// How can you modify our previous example to print 3 instead of 8?
// You could try calling super.getHeight() in the parent Penguin class:

//class Penguin {
//    public int getHeight() { return 3; }
//    public void printInfo() {
////        System.out.print(super.getHeight());  // DOES NOT COMPILE
//    }
//}
////Unfortunately, this does not compile, as super refers to the superclass of Penguin; in this case, Object. The solution is to override printInfo() in the child EmperorPenguin class and use super there.
//public class EmperorPenguin extends Penguin {
//    public int getHeight() { return 8; }
//    public void printInfo() {
//        System.out.print(super.getHeight());
//    }
//    public static void main(String []fish) {
//        new EmperorPenguin().printInfo();  // 3
//    }
//}
