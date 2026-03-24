package chap7.a1ImplementingInterfaces.page370;

//Inheriting Duplicate default Methods
//The last rule for creating a default interface method requires some explanation.
// For example, what value would the following code output?
interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}

//public class Cat implements Walk, Run {}  // DOES NOT COMPILE

//In this example, Cat inherits the two default methods for getSpeed(), so which does it use?
// Since Walk and Run are considered siblings in terms of how they are used in the Cat class,
// it is not clear whether the code should output 5 or 10. In this case, the compiler throws up its hands and says,
// “Too hard, I give up!” and fails.
//All is not lost, though.
// If the class implementing the interfaces overrides the duplicate default method,
// the code will compile without issue.
// By overriding the conflicting method, the ambiguity about which version of the method to call has been removed.
// For example, the following modified implementation of Cat will compile:
class Cat implements Walk, Run {
    public int getSpeed() {
        return 1;
    }
}
