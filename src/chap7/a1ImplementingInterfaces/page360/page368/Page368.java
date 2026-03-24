package chap7.a1ImplementingInterfaces.page360.page368;

//Writing a default Interface Method
//The first type of concrete method you should be familiar with for the exam is a default method.
// A default method is a method defined in an interface with the default keyword and includes a method body.
// It may be optionally overridden by a class implementing the interface.
//One use of default methods is for backward compatibility. You can add a new default method to an interface
// without the need to modify all of the existing classes that implement the interface.
// The older classes will just use the default implementation of the method defined in the interface.
// This is where the name default method comes from!
//The following is an example of a default method defined in an interface:
interface IsColdBlooded {
    boolean hasScales();
    default double getTemperature() {
        return 10.0;
    }
}
//This example defines two interface methods, one abstract and one default.
// The following Snake class, which implements IsColdBlooded, must implement hasScales().
// It may rely on the default implementation of getTemperature() or override the method with its own version:
class Snake implements IsColdBlooded {
    public boolean hasScales() {       // Required override
        return true;
    }

    public double getTemperature() {   // Optional override
        return 12.2;
    }
}

//Note that the default interface method modifier is not the same as the default label used in a switch.
// Likewise, even though package access is sometimes referred to as default access,
// that feature is implemented by omitting an access modifier.
// Sorry if this is confusing! We agree Java has overused the word default over the years!