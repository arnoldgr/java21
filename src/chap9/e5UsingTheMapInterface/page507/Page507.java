package chap9.e5UsingTheMapInterface.page507;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Page507 {
    public static void main(String[] args) {
//        Merging Data
//        The merge() method adds logic of what to choose.
//        Suppose we want to choose the ride with the longest name.
//        We can write code to express this by passing a mapping function to the merge() method.
        BiFunction<String, String, String> mapper = (v1, v2)
                -> v1.length() > v2.length() ? v1 : v2;


        Map<String, String> favorites = new HashMap<>();
        favorites.put("Jenny", "Bus Tour");
        favorites.put("Tom", "Tram");

        String jenny = favorites.merge("Jenny", "Skyride", mapper);
        String tom = favorites.merge("Tom", "Skyride", mapper);

        System.out.println(favorites); // {Tom=Skyride, Jenny=Bus Tour}
        System.out.println(jenny);     // Bus Tour
        System.out.println(tom);       // Skyride

//
//        The code on lines 12 and 13 takes two parameters and returns a value.
//        Our implementation returns the one with the longest name.

//        Line 20 calls this mapping function, and it sees that Bus Tour is longer than Skyride,
//        so it leaves the value as Bus Tour.

//        Line 21 calls this mapping function again.
//        This time, Tram is shorter than Skyride, so the map is updated.

//        Line 23 prints out the new map contents. Lines 24 and 25 show that the result is returned from merge().

//        The merge() method also has logic for what happens if null values or missing keys are involved.
//        In this case, it doesn’t call the BiFunction at all, and it simply uses the new value.

        BiFunction<String, String, String> mapper2 =
                (v1, v2) -> v1.length() > v2.length() ? v1 : v2;
        Map<String, String> favorites2 = new HashMap<>();
        favorites2.put("Sam", null);
        favorites2.merge("Tom", "Skyride", mapper2);
        favorites2.merge("Sam", "Skyride", mapper2);
        System.out.println(favorites2);   // {Tom=Skyride, Sam=Skyride}
//
//        Notice that the mapping function isn’t called.
//        If it were, we’d have a NullPointerException.
//        The mapping function is used only when there are two actual values to decide between.
//        The final thing to know about merge() is what happens when the mapping function is
//        called and returns null.
//        The key is removed from the map when this happens.

        BiFunction<String, String, String> mapper3 = (v1, v2) -> null;
        Map<String, String> favorites3 = new HashMap<>();
        favorites3.put("Jenny", "Bus Tour");
        favorites3.put("Tom", "Bus Tour");

        favorites3.merge("Jenny", "Skyride", mapper3);
        favorites3.merge("Sam", "Skyride", mapper3);
        System.out.println(favorites3);   // {Tom=Bus Tour, Sam=Skyride}

//        Tom was left alone since there was no merge() call for that key.
//        Sam was added since that key was not in the original list.
//        Jenny was removed because the mapping function returned null.
//        Table 9.7 shows all of these scenarios as a reference.

//        SEE BOOK FOR TABLE 9.7
    }
}