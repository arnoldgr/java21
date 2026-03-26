package chap9.a1UsingCommonCollectionAPIs.page485;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Page485 {
    public static void main(String[] args) {
//        Using Both Shorteners

//        What happens if you use both var and the diamond operator?

        var map = new HashMap<>();

//        Believe it or not, this does compile! If you try to have them both infer,
//        there isn’t enough information and you get Object as the generic type.
//        This is equivalent to the following:

        HashMap<Object, Object> map2 = new HashMap<Object, Object>();

//        Adding Data
//        The add() method inserts a new element into the Collection and returns whether it was successful.
//        The method signature is as follows:
//        public boolean add (E element)

//        Remember that the Collections Framework uses generics. You will see E appear frequently.
//        It means the generic type that was used to create the collection.
//        For some Collection types, add() always returns true. For other types, t
//        here is logic as to whether the add() call was successful.
//        The following shows how to use this method:

        Collection<String> list = new ArrayList<>();
        System.out.println(list.add("Sparrow")); // true
        System.out.println(list.add("Sparrow")); // true

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow")); // true
        System.out.println(set.add("Sparrow")); // false

//        A List allows duplicates, making the return value true each time.
//        A Set does not allow duplicates. On line 9, we tried to add a duplicate so that
//        Java returns false from the add() method.

//        Removing Data
//        The remove() method removes a single matching value in the Collection and
//        returns whether it was successful. The method signature is as follows:
//        public boolean remove (Object object)

//        This time, the boolean return value tells us whether a match was removed.
//        The following shows how to use this method:
        Collection<String> birds = new ArrayList<>();
        birds.add("hawk");                            // [hawk]
        birds.add("hawk");                            // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // false
        System.out.println(birds.remove("hawk"));     // true
        System.out.println(birds);                    // [hawk]

//        Line 6 tries to remove an element that is not in birds.
//        It returns false because no such element is found. Line 7 tries to remove an
//        element that is in birds, so it returns true. Notice that it removes only one match.
    }
}
