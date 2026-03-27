package chap9.e5UsingTheMapInterface.page503;


import java.util.Map;

public class Page503 {
    public static void main(String[] args) {
//        Comparing Map Implementations
//        From Figure 9.1, HashMap, LinkedHashMap, and TreeMap are the three classes that implement the Map interface.
//
//        A HashMap stores the keys in a hash table. This means that it uses the hashCode() method of
//        the keys to retrieve their values more efficiently.

//        Like LinkedHashSet, the LinkedHashMap supports iterating over the elements in a well-defined order.
//        This is generally the insertion order, although it also includes methods to add/remove elements at
//        the front or back of the map.

//        Finally, a TreeMap stores the keys in a sorted tree structure. The main benefit is that the keys are always in sorted order. Like a TreeSet, the trade-off is that adding and checking whether a key is present takes longer as the tree grows larger.
//
//
//        Working with Map Methods
//        Given that Map doesn’t extend Collection, more methods are specified on the Map interface.
//        Since there are both keys and values, we need generic type parameters for both.
//        he class uses K for key and V for value.
//        The methods you need to know for the exam are in Table 9.6.
//        Some of the method signatures are simplified to make them easier to understand.
//
//
//        SEE BOOK FOR TABLE 9.6 Map methods
//        EXAMPLEs
        Map<String,String> m = Map.ofEntries(
                Map.entry("fourlegged", "dog"),
                Map.entry("twolegged", "bird"));
        System.out.println(m.containsKey("fourlegged"));
        System.out.println(m.containsValue("bird"));
        System.out.println(m.isEmpty());
    }
}
