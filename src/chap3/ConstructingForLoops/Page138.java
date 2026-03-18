package chap3.ConstructingForLoops;

import java.util.ArrayList;
import java.util.List;


public class Page138 {
    public static void main(String[] args) {
//        The for-each loop is a specialized structure designed to iterate over arrays and various Collections Framework classes,
        String[] names = {"a", "b"};
        printNames(names);
        printNames2(names);
//        The for-each loop is a lot shorter, isn’t it? We no longer have a counter
//        loop variable that we need to create, increment, and monitor.
//        Like using a for loop in place of a while loop, for-each loops are meant to
//        reduce boilerplate code, making code easier to read/write, and freeing you to
//        focus on the parts of your code that really matter.

//         We can lso use a for-each loop on a List, since it implements Iterable.
        List<String> list = new ArrayList<>();
        list.add("Sparrow"); // true
        list.add("Eagle");
        printNames3(list);

//        What about the following examples?

//        String birds = "Jay";
//        for (String bird : birds)  // DOES NOT COMPILE
//            System.out.print(bird + " ");
//
//        String[] sloths = new String[3];
//        for (int sloth : sloths)    // DOES NOT COMPILE
//            System.out.print(sloth + " ");

//        The first for -each loop does not compile because the String birds cannot be
//        used on the right side of the statement.While a String may represent a list of characters,
//        it has to actually be an array or implement Iterable.
//        The second example does not compile because the loop variable type
//        on the left side of the statement is int and doesn’t match the expected type of String.
    }

    //    Compare these two methods that both print the values of an array, one using a traditional for loop and the other using a for-each loop:
    static void printNames(String[] names) {
        for (int counter = 0; counter < names.length; counter++)
            System.out.println(names[counter]);
    }

    static void printNames2(String[] names) {
        for (var name : names)
            System.out.println(name);
    }

    static void printNames3(List<String> names) {
        for (var name : names)
            System.out.println(name);
    }
}
