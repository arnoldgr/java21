package chap9.g7IntroducingSequencedCollections.page522;

import java.util.HashMap;
import java.util.Map;
import java.util.SequencedMap;
import java.util.TreeMap;

public class Page522 {
//Working with SequencedMap
//As you can probably guess, a SequencedMap is a Map with a defined encounter order.
// We define common methods in Table 9.12.

//TABLE 9.12 Common SequencedMap Methods

//firstEntry()
//Retrieves the first key/value pair in the map

//lastEntry()
//Retrieves the last key/value pair in the map

//pollFirstEntry()
//Removes and retrieves the first key/value pair in the map

//pollLastEntry()
//Removes and retrieves the last key/value pair in the map

//putFirst(K k, V v)
//Adds the key/value pair as the first element in the map

//putLast(K k, V v)
//Adds the key/value pair as the last element in the map

//reversed()
//Returns a reverse-ordered view of the map


    static public void welcomeNext(SequencedMap<String, String> visitors) {
        System.out.println("Welcome to the Zoo! " + visitors.pollFirstEntry());
    }

    public static void main() {


//What do you think the following snippet prints?
        var visitHashMap = new HashMap<String, String>(
                Map.of("1", "Yakko", "2", "Wakko", "3", "Dot"));
//        welcomeNext(visitHashMap);

//Trick question! It actually doesn’t compile. Like we explained with HashSet earlier,
// a HashMap does not have an ordering, so it cannot be used as a SequencedMap.
// What about this example?
        var visitTreeMap = new TreeMap<String, String>(
                Map.of("Pink", "Blossom", "Green", "Buttercup", "Blue", "Bubbles"));
        welcomeNext(visitTreeMap);

//If you guessed Welcome to the Zoo! Blue=Bubbles, then you were paying attention when
// we covered TreeMap.
// A TreeMap sorts things by the natural order of its keys, not the order in which
// they were added to the map. Since Blue is the first key in sorted order, it is the first pair printed.

//Most of the collections that you have worked with throughout this book are sequenced.
// Two notable exceptions are HashSet and HashMap.

    }
}