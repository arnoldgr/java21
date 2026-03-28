package chap9.e5UsingTheMapInterface.page506;

import java.util.HashMap;
import java.util.Map;

public class Page506 {
    public static void main(String[] args) {
//        Getting Values Safely
//        The get() method returns null if the requested key is not in the map.
//        Sometimes you prefer to have a different value returned.
//        Luckily, the getOrDefault() method makes this easy. Let’s compare the two methods.
        Map<Character, String> map = new HashMap<>();
        map.put('x', "spot");
        System.out.println("X marks the " + map.get('x'));
        System.out.println("X marks the " + map.getOrDefault('x', ""));
        System.out.println("Y marks the " + map.get('y'));
        System.out.println("Y marks the " + map.getOrDefault('y', ""));

//        This code prints the following:
//        X marks the spot
//        X marks the spot
//        Y marks the null
//        Y marks the

//        As you can see, lines 13 and 14 have the same output because get() and getOrDefault()
//        behave the same way when the key is present. They return the value mapped by that key.

//        Lines 15 and 16 give different output, showing that get() returns null when the key is not present.
//        By contrast, getOrDefault() returns the empty string we passed as a parameter.


//        Replacing Values
//        These methods are similar to the List version, except a key is involved:
        Map<Integer, Integer> map2 = new HashMap<>();
        map2.put(1, 2);
        map2.put(2, 4);
        Integer original = map2.replace(2, 10); // 4
        System.out.println(map2);    // {1=2, 2=10}
        map2.replaceAll((k, v) -> k + v);
        System.out.println(map2);    // {1=3, 2=12}


//        Line 36 replaces the value for key 2 and returns the original value.
//        Line 38 calls a function and sets the value of each element of the map to the result of that function.
//        In our case, we added the key and value together.

//        Note that replace() and replaceAll() do not modify the Map if it does not contain the key.
//        Contrast this with put(), which will always attempt to set a value.
//
//        Putting If Absent
//        The putIfAbsent() method sets a value in the map but skips it if the value is
//        already set to a non-null value.
        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", null);
        favorites.putIfAbsent("Jenny", "Tram");
        favorites.putIfAbsent("Sam", "Tram");
        favorites.putIfAbsent("Tom", "Tram");
        System.out.println(favorites); // {Tom=Tram, Jenny=Bus Tour, Sam=Tram}

//        As you can see, Jenny’s value is not updated because one was already present.
//        Sam wasn’t there at all, so he was added.
//        Tom was present as a key but had a null value.
//        Therefore, he was updated as well

    }
}
