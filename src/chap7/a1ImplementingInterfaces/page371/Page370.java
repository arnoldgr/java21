package chap7.a1ImplementingInterfaces.page371;

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

