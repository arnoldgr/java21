package chap7.b2WorkingWithEnums.page378;

import java.sql.SQLOutput;

interface Visitors {
    void printVisitors();
}

//    Working with Complex Enums
//    While a simple enum is composed of just a list of values, we can define a complex enum with additional elements.
//    Let’s say our zoo wants to keep track of traffic patterns to determine which seasons get the most visitors.

enum SeasonWithVisitors implements Visitors {
    WINTER("Low"), SPRING("Medium"), SUMMER("High"), FALL("Medium");

    private final String visitors;
    public static final String DESCRIPTION = "Weather enum";

    private SeasonWithVisitors(String visitors) {
        System.out.print("constructing,");
        this.visitors = visitors;
    }

    @Override
    public void printVisitors() {
        System.out.println(visitors);
    }
}


//    There are a few things to notice here.
//    On line 12, the list of enum values ends with a semicolon (;).
//    While this is optional for a simple enum, it is required if there is anything in the enum besides the values.
//    Lines 14–26 are regular Java code. We have instance and static variables (lines 14-15),
//    a constructor (lines 17–20), and a method (lines 22-26).

//    You might have noticed that in our enum example, the list of values comes first.
//    This was not an accident. For complex enums (and trivially simple enums), the list of values always comes first.

//    Creating Enum Variables
//    An enum declaration can include both static and instance variables.
//    In our SeasonWithVisitors implementation (lines 14-15), we mark the variables final,
//    so that our enum properties cannot be modified.
//    Although it is possible to create an enum with instance variables that can be modified,
//    it is a very poor practice to do so since they are shared within the JVM.
//    When designing enum values, they should be immutable.

//    Declaring Enum Constructors
//    All enum constructors are implicitly private, with the modifier being optional.
//    This is reasonable since you can’t extend an enum and the constructors can be called only within the enum itself.
//    In fact, an enum constructor will not compile if it contains a public or protected modifier.

//27: public SeasonWithVisitors(String visitors) {  // DOES NOT COMPILE

//        What about all of the parentheses on line 12 of our SeasonWithVisitors enum?
//        Those are constructor calls, but without the new keyword normally used for objects.
//        The first time we ask for any of the enum values, Java constructs all of the enum values.
//        After that, Java just returns the already constructed enum values.
//        Given this explanation, you can see why this code snippet calls each constructor only once:


public class Page378 {

    public static void main(String[] args) {
        System.out.print("begin,");
        var firstCall = SeasonWithVisitors.SUMMER;   // Prints 4 times
        System.out.print("middle,");
        var secondCall = SeasonWithVisitors.WINTER;  // Doesn't print anything
        System.out.print("end");
        firstCall.printVisitors();
    }
//        This program prints the following:
//        begin,constructing,constructing,constructing,constructing,middle,end

//        If the SeasonWithVisitors enum was used earlier in the program (and therefore initialized sooner), then the line that declares the firstCall variable would not print anything.

}
