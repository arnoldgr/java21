package chap7.f6understandingPolymorphism.page418;

//Besides the location, the reference type can also determine the value you get when
// you are working with hidden members. Ready?
// Let’s try a more complex example:

class Marsupial {
    protected int age = 2;
    public static boolean isBiped() {
        return false;
    } }

public class Kangaroo extends Marsupial {
    protected int age = 6;
    public static boolean isBiped() {
        return true;
    }

    public static void main(String[] args) {
        Kangaroo joey = new Kangaroo();
        Marsupial moey = joey;
        System.out.println(joey.isBiped());
        System.out.println(moey.isBiped());
        System.out.println(joey.age);
        System.out.println(moey.age);
    } }

//The program prints the following:
//        true
//        false
//        6
//        2

// In this example, only one object (of type Kangaroo) is created and stored in memory!
// Since static methods can only be hidden, not overridden, Java uses the reference type
// to determine which version of isBiped() should be called, resulting in joey.isBiped()
// printing true and moey.isBiped() printing false.
//Likewise, the age variable is hidden, not overridden, so the reference type is used to
// determine which value to output.
// This results in joey.age returning 6 and moey.age returning 2.
// For the exam, make sure you understand these examples, as they show how hidden and overridden
// methods are fundamentally different.
// In practice, overriding methods is the cornerstone of polymorphism and an extremely powerful feature.
//
// Don’t Hide Members in Practice
//
//Although Java allows you to hide variables and static methods,
// it is considered an extremely poor coding practice.
// As you saw in the previous example, the value of the variable or method can change
// depending on what reference is used, making your code very confusing, difficult to follow,
// and challenging for others to maintain.
// This is further compounded when you start modifying the value of the variable in
// both the parent and child methods, since it may not be clear which variable you’re updating.
//When you’re defining a new variable or static method in a child class,
// it is considered good coding practice to select a name that is not already used
// by an inherited member.
// Redeclaring private methods and variables is considered less problematic,
// though, because the child class does not have access to the variable in the parent class to begin with.

