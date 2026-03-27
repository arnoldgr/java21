package chap9.b2UsingTheListInterface.page492;

import java.util.ArrayList;
import java.util.LinkedList;

public class Page492 {
    public static void main(String[] args) {
//        Creating a List with a Constructor
//        Most? Collections have two constructors that you need to know for the exam.
//        The following shows them for LinkedList:
        var linked1 = new LinkedList<String>();
        var linked2 = new LinkedList<String>(linked1);

//        The first says to create an empty LinkedList containing all the defaults.
//        The second tells Java that we want to make a copy of another LinkedList.
//        Granted, linked1 is empty in this example, so it isn’t particularly interesting.
//        ArrayList has an extra constructor you need to know. We now show the three constructors.
        var list1 = new ArrayList<String>();
        var list2 = new ArrayList<String>(list1);
        var list3 = new ArrayList<String>(10);

//        The first two are the common constructors you need to know for all Collections.
//        The final example says to create an ArrayList containing a specific number of slots,
//        but again not to assign any. You can think of this as the size of the underlying array.

    }
}
