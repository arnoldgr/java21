package chap9.e5UsingTheMapInterface.page504;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Page504 {

    //        Calling Basic Methods
//        Let’s start by comparing the behavior of each of the Map classes.
//        Consider the following method:
    static void addElementsAndPrint(Map<String, String> map) {
        map.put("koala", "bamboo");
        map.put("lion", "meat");
        map.put("giraffe", "leaf");
        String food = map.get("koala"); // bamboo
        for (String key : map.keySet())
            System.out.print(key + ",");

        //        Using our HashMap instance, we can try some boolean checks.
        System.out.println(map.containsKey("lion"));    // true
        System.out.println(map.containsValue("lion"));  // false
        System.out.println(map.size());     // 3
        map.clear();
        System.out.println(map.size());     // 0
        System.out.println(map.isEmpty());  // true

//        The first two lines show that keys and values are checked separately. We can see that there are three key/value pairs in our map. Then we clear out the contents of the map and see that there are zero elements and it is empty.
//        Do you see why this doesn’t compile?
//        System.out.println(map.contains("lion"));       // DOES NOT COMPILE

//        It doesn’t compile because the contains() method is on the Collection interface but not the Map interface.
//        In the following sections, we show Map methods you might not be as familiar with.
    }

    public static void main(String[] args) {
//        Here we use the put() method to add key/value pairs to the map
//        and get() to get a value given a key. We also use the keySet() method to get all the keys.
//        We can then apply this method to each of our three Map classes.
        addElementsAndPrint(new HashMap<>());        // koala,giraffe,lion,
        addElementsAndPrint(new LinkedHashMap<>());  // koala,lion,giraffe,
        addElementsAndPrint(new TreeMap<>());        // giraffe,koala,lion,

//        Like we saw with the Set classes, HashMap prints the elements in an arbitrary
//        ordering using the hashCode() of the key.
//        LinkedHashMap prints the elements in the order in which they were inserted.
//        Finally, TreeMap prints the elements based on the order of the keys.

    }

}
