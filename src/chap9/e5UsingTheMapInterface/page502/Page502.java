package chap9.e5UsingTheMapInterface.page502;

import java.util.Map;

public class Page502 {
    public static void main(String[] args) {
//        Using the Map Interface
//        You use a Map when you want to identify values by a key.
//        For example, when you use the contact list in your phone, you look up “George”
//        rather than looking through each phone number in turn.
//        You can envision a Map as shown in Figure 9.8. You don’t need to know
//        the names of the specific interfaces that the different maps implement,
//        but you do need to know that LinkedHashMap is ordered and TreeMap is sorted.

//        The main thing that all Map classes have in common is that they have keys and values.
//        Beyond that, they each offer different functionality.
//        We look at the implementations you need to know and the available methods.

//        Map.of() and Map.copyOf()

//        Just like List and Set, there is a factory method to create a Map.
//        You pass up to 10 pairs of keys and values.


                Map.of("key1", "value1", "key2", "value2");


//        Unlike List and Set, this is less than ideal.
//        Passing keys and values is harder to read because you have to keep track of
//        which parameter is which. Luckily, there is a better way. Map also provides a
//        method that lets you supply key/value pairs.


        Map.ofEntries(
                Map.entry("key1", "value1"),
                Map.entry("key2", "value2"));


//        Now we can’t forget to pass a value. If we leave out a parameter, the entry() method won’t compile.
//        Conveniently, Map.copyOf(map) works just like the List and Set interface copyOf() methods.

    }
}
