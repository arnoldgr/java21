package chap5.DeclaringLocalAndInstanceVariables;

public class Page243 {
    //    Local Variable Modifiers
//    There’s only one modifier that can be applied to a local variable: final.
//    Easy to remember, right?
//    When writing methods, developers may want to create a variable that does not
//    change during the course of the method.
//    In this code sample, trying to change the value or object these variables reference results in a compiler error:
    public void zooAnimalCheckup(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
        else rest = 20;
        System.out.print(rest);

        final var giraffe = new Animal();
        final int[] friends = new int[5];

//        rest = 10;               // DOES NOT COMPILE
//        giraffe = new Animal();  // DOES NOT COMPILE
//        friends = null;          // DOES NOT COMPILE
    }

    //    As shown with the rest variable, we don’t need to assign a value when a final variable is declared.
    //    The rule is only that it must be assigned a value before it can be used.
    //    We can even use var and final together. Contrast this with the following example:
    public void zooAnimalCheckup2(boolean isWeekend) {
        final int rest;
        if (isWeekend) rest = 5;
//        System.out.print(rest);  // DOES NOT COMPILE
    }

    //    The rest variable might not have been assigned a value, such as if isWeekend is false. Since the compiler does not allow the use of local variables that may not have been assigned a value, the code does not compile.
//    Does using the final modifier mean we can’t modify the data? Nope. The final attribute refers only to the variable reference; the contents can be freely modified (assuming the object isn’t immutable).
    public void zooAnimalCheckup() {
        final int rest = 5;
        final Animal giraffe = new Animal();
        final int[] friends = new int[5];

        giraffe.setName("George");
        friends[2] = 2;
    }

//    The rest variable is a primitive, so it’s just a value that can’t be modified.
//    On the other hand, the contents of the giraffe and friends variables can be freely
//    modified, provided the variables aren’t reassigned.


//    While it might not seem obvious, marking a local variable final is often a good practice.
//    For example, you may have a complex method in which a variable is referenced dozens of times.
//    It would be really bad if someone came in and reassigned the variable in the middle of the method.
//    Using the final attribute is like sending a message to other developers to leave the variable alone!

}

class Animal {
    String name;
    void setName (String n) {
        name = n;
    }
}
