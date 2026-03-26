package chap9.a1UsingCommonCollectionAPIs.page486;

import java.util.ArrayList;
import java.util.Collection;

public class Page486 {

    public static void main(String[] args) {
//        Counting Elements
//        The isEmpty() and size() methods look at how many elements are in the Collection.
//        The method signatures are as follows:
//        public boolean isEmpty ()
//        public int size ()

//        The following shows how to use these methods:
        Collection<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0
        birds.add("hawk");                   // [hawk]
        birds.add("hawk");                   // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size());    // 2

//        At the beginning, birds has a size of 0 and is empty.
//        It has a capacity that is greater than 0. After we add elements, the size becomes positive,
//        and it is no longer empty.


//        Clearing the Collection
//        The clear() method provides an easy way to discard all elements of the Collection.
//        The method signature is as follows:
//        public void clear ()

//        The following shows how to use this method:
        Collection<String> birds2 = new ArrayList<>();
        birds2.add("hawk");                   // [hawk]
        birds2.add("hawk");                   // [hawk, hawk]
        System.out.println(birds2.isEmpty()); // false
        System.out.println(birds2.size());    // 2
        birds.clear();                       // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0

//        After calling clear(), birds is back to being an empty ArrayList of size 0.


//        Checking Contents
//        The contains() method checks whether a certain value is in the Collection.
//        The method signature is as follows:
//        public boolean contains (Object object)

//        The following shows how to use this method:
        Collection<String> birds3 = new ArrayList<>();
        birds3.add("hawk");                           // [hawk]
        System.out.println(birds.contains("hawk"));  // true
        System.out.println(birds.contains("robin")); // false

//        The contains() method calls equals() on elements of the ArrayList
//        to see whether there are any matches
    }
}
