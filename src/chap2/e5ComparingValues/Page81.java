package chap2.ComparingValues;

import java.io.File;

//Comparing Values
public class Page81 {
    public static void main(String[] args) {

        //The equality operator can be applied to numeric values, boolean values, and objects
        // (including String and null).
        // When applying the equality operator, you cannot mix these types.

        int a = 5;
        System .out.println(a == 10);
        double b = 3.14;
        System .out.println(b != 3.14);

        //NB: DO NOT MIX THE TYPES
//        boolean monkey = true == 3;       // DOES NOT COMPILE
//        boolean ape = false != "Grape";   // DOES NOT COMPILE
//        boolean gorilla = 10.2 == "Koko"; // DOES NOT COMPILE

        //What is the output for the following?
        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);  // true

//        At first glance, you might think the output should be false, and if the expression were (bear == true),
//        then you would be correct. In this example, though, the expression is assigning the value of true to bear,
//        and as you saw in the section on assignment operators, the assignment itself has the value of the assignment.
//        Therefore, polar is also assigned a value of true, and the output is true.

//        For object comparison, the equality operator is applied to the references to the objects,
//        not the objects they point to. Two references are equal if and
//        only if they point to the same object or both point to null. Let’s take a look at some examples:

        var monday = new File("schedule.txt");
        var tuesday = new File("schedule.txt");
        var wednesday = tuesday;
        System.out.println(monday == tuesday);    // false
        System.out.println(tuesday == wednesday); // true

//        Even though all of the variables point to the same file information,
//        only two references, tuesday and wednesday,
//        are equal in terms of == since they point to the same object.

//        In some languages, comparing null with any other value is always false,
//        although this is not the case in Java.
        System.out.print(null == null);  // true
//        In Chapter 4, we’ll continue the discussion of object equality by introducing
//        what it means for two different objects to be equivalent.
//        We’ll also cover String equality and show how this can be a nontrivial topic.



    }
}
