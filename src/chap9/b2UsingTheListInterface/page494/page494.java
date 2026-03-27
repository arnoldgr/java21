package chap9.b2UsingTheListInterface.page494;

import java.util.LinkedList;

public class page494 {
    public static void main(String[] args) {
//    Overloaded remove() Methods

//We’ve now seen two overloaded remove() methods. The one from Collection removes an object that
// matches the parameter.
// By contrast, the one from List removes an element at a specified index.
//This gets tricky when you have an Integer type.
// What do you think the following prints?


        var list = new LinkedList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.remove(2);
        list.remove(Integer.valueOf(2));
        System.out.println(list);


//The correct answer is [3]. Let’s look at how we got there.
// At the end of line 34, we have [3, 2, 1]. Line 35 passes a primitive,//
// which means we are requesting deletion of the element at index 2.
// This leaves us with [3, 2].
// Then line 36 passes an Integer object, which means we are deleting the value 2.
// That brings us to [3].
//The remove() method that takes an element will return false if the element is not found.
// Contrast this with the remove() method that takes an int, which throws an exception if the element is not found:


        list = new LinkedList<Integer>();
        list.remove(Integer.valueOf(100));  // Returns false
        list.remove(100);                   // IndexOutOfBoundsException

    }
}
