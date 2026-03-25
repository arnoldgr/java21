package chap7.f6understandingPolymorphism.page417;

// Overriding vs. Hiding Members
// While method overriding replaces the method everywhere it is called,
// static method and variable hiding do not. Strictly speaking,
// hiding members is not a form of polymorphism since the methods and
// variables maintain their individual properties.
// Unlike method overriding, hiding members is very sensitive
// to the reference type and location where the member is being used.
// Let’s take a look at an example:
class Penguin {
    public static int getHeight() { return 3; }
    public void printInfo() {
        System.out.println(this.getHeight());
    } }

public class CrestedPenguin extends Penguin {
    public static int getHeight() { return 8; }
    public static void main(String... fish) {
        new CrestedPenguin().printInfo();
    } }


// The CrestedPenguin example is nearly identical to our previous EmperorPenguin example,
// although as you probably already guessed, it prints 3 instead of 8.
// The getHeight() method is static and is therefore hidden, not overridden.
// The result is that calling getHeight() in CrestedPenguin returns a different value
// than calling it in Penguin, even if the underlying object is the same.
// Contrast this with overriding a method, where it returns the same value
// for an object regardless of which class it is called in.
//What about the fact that we used this to access a static method in this.getHeight()?
// As discussed in Chapter 5, while you are permitted to use an instance reference
// to access a static variable or method, doing so is often discouraged.
// The compiler will warn you when you access static members in a non-static way.
// In this case, the this reference had no impact on the program output.

