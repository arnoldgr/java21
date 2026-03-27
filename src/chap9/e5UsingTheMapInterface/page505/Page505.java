package chap9.e5UsingTheMapInterface.page505;

import java.util.HashMap;
import java.util.Map;

public class Page505 {
    public static void main(String[] args) {
//        Iterating through a Map
//        You saw the forEach() method earlier in the chapter. Note that it works a little differently on a Map.
//        This time, the lambda used by the forEach() method has two parameters: the key and the value.
//        Let’s look at an example, shown here:
        Map<Integer, Character> map = new HashMap<>();
        map.put(1, 'a');
        map.put(2, 'b');
        map.put(3, 'c');
        map.forEach((k, v) -> System.out.println(v));

//        The lambda has both the key and value as the parameters.
//        It happens to print out the value but could do anything with the key and/or value.
//        Interestingly, since we don’t care about the key, this particular code could have been written
//        with the values() method and a method reference instead.
        map.values().forEach(System.out::println);

//        Another way of iterating over the data in a map is using entrySet(),
//        which returns a set of Map.Entry<K, V> objects. If this type seems a little strange,
//        don’t worry! This is just a fancy way of storing the key/value pair in an object.
//        It provides methods to retrieve the key and value of each pair.
        map.entrySet().forEach(e ->
                System.out.println(e.getKey() + " " + e.getValue()));

//        In this case, each element e is of type Map.Entry<Integer, Character>.
    }
}
