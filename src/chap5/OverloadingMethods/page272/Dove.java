package chap5.OverloadingMethods.page272;

//Calling overloaded methods is easy. You just write code, and Java calls the right one.
// For example, look at these two methods:

public class Dove {
    public void fly(int numMiles) {
        System.out.println("int");
    }
    public void fly(short numFeet) {
        System.out.println("short");
    }
}

//The call fly((short) 1) prints short.
// It looks for matching types and calls the appropriate method.
// Of course, it can be more complicated than this.
//Now that you know the basics of overloading,
// let’s look at some more complex scenarios that you may encounter on the exam.
