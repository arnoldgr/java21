package chap6.creatingclasses.page298;

//Applying Class Access Modifiers
//Like variables and methods, you can apply access modifiers to classes.
// As you might remember from Chapter 1, a top-level class is one not defined inside another class.
// Also remember that a .java file can have at most one public top-level class.
//While you can only have one public top-level class, you can have as many classes (in any order)
// with package access as you want. In fact, you don’t even need to declare a public class!
// The following declares three classes, each with package access:
// Bear.java
class Bird {}
class Bear {}
class Fish {}

//Trying to declare a top-level class with protected or private class will lead to a compiler error, though.
// ClownFish.java
//protected class ClownFish{} // DOES NOT COMPILE

// BlueTang.java
//private class BlueTang {} // DOES NOT COMPILE

//Does that mean a class can never be declared protected or private? Not exactly.
// In Chapter 7, we present nested types and show that when you define a class inside another,
// it can use any access modifier.
