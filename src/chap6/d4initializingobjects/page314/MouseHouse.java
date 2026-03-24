package chap6.initializingobjects.page314;

//Initializing final Fields
//Before we delve into order of initialization for instance members,
// we need to talk about final fields (instance variables) for a minute.
// When we presented instance and class variables in Chapter 1,
// we told you they are assigned a default value based on their type if no value is specified.
// For example, a double is initialized with 0.0, while an object reference is initialized to null.
// A default value is only applied to a non-final field, though.
//As you saw in Chapter 5, final static variables must be explicitly assigned a
// value exactly once.
// Fields marked final follow similar rules.
// They can be assigned values in the line in which they are declared or in an instance initializer.

public class MouseHouse {
    private final int volume;
    private final String name = "The Mouse House";  // Declaration assignment

    {
        volume = 10;  // Instance initializer assignment
    }
}

//Unlike static class members, though, final instance fields can also be set in a constructor.
// The constructor is part of the initialization process, so it is allowed to assign final instance variables.
// For the exam, you need to know one important rule: by the time the constructor completes,
// all final instance variables must be assigned a value exactly once.
//Let’s try this in an example:
class MouseHouse2 {
    private final int volume;
    private final String name;

    public MouseHouse2() {
        this.name = "Empty House";   // Constructor assignment
    }

    {
        volume = 10;  // Instance initializer assignment
    }
}

// Unlike local final variables, which are not required to have a value unless they are actually used,
// final instance variables must be assigned a value.
// If they are not assigned a value when they are declared or in an instance initializer,
// then they must be assigned a value in the constructor declaration.
// Failure to do so will result in a compiler error.
//class MouseHouse3 {
//    private final int volume;
//    private final String type;
//
//    {
//        this.volume = 10;
//    }
//
//    public MouseHouse3(String type) {
//        this.type = type;
//    }
//
//    public MouseHouse3() {  // DOES NOT COMPILE
//        this.volume = 2;    // DOES NOT COMPILE
//    }
//}

//In this example, the first constructor that takes a String argument compiles.
// In terms of assigning values, each constructor is reviewed individually,
// which is why the second constructor does not compile. First, the constructor
// fails to set a value for the type variable.
// The compiler detects that a value is never set for type and reports an error.
// Second, the constructor sets a value for the volume variable,
// even though it was already assigned a value by the instance initializer.

//On the exam, be wary of any instance variables marked final.
// Make sure they are assigned a value in the line where they are declared, in an instance initializer,
// or in a constructor. They should be assigned a value only once, and failure to assign a value
// is considered a compiler error.

//What about final instance variables when a constructor calls another constructor
// in the same class?
// In that case, you have to follow the flow carefully, making sure every final
// instance variable is assigned a value exactly once.
// We can replace our previous bad constructor with the following one that does compile:
//public MouseHouse4() {
//    this(null);
//}

//This constructor does not perform any assignments to any final instance variables,
// but it calls the MouseHouse(String) constructor, which we observed compiles without issue.
// We use null here to demonstrate that the variable does not need to be an object value.
// We can assign a null value to final instance variables as long as they are explicitly set.
