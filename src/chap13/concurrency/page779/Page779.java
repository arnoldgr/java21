package chap13.concurrency.page779;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

// Chapter 13 - Using Concurrent Collections
// Page-style file.
//
// This file shows:
// - ConcurrentHashMap
// - CopyOnWriteArrayList
// - why concurrent collections are useful

public class Page779 {

    public static void main(String[] args) {

        // Example 1: safe removal with ConcurrentHashMap
        var foodData = new ConcurrentHashMap<String, Integer>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        for (String key : foodData.keySet()) {
            foodData.remove(key);
        }

        System.out.println("ConcurrentHashMap size: " + foodData.size());

        // Example 2: CopyOnWriteArrayList
        List<Integer> favNumbers = new CopyOnWriteArrayList<>(List.of(4, 3, 42));
        for (var n : favNumbers) {
            System.out.print(n + " ");
            favNumbers.add(n + 1);
        }

        System.out.println();
        System.out.println("Size: " + favNumbers.size());

        // Dangerous non-concurrent idea
        /*
        var badMap = new HashMap<String, Integer>();
        badMap.put("penguin", 1);
        badMap.put("flamingo", 2);

        for (String key : badMap.keySet()) {
            badMap.remove(key);   // Can throw ConcurrentModificationException
        }
        */
    }
}

/*
Commented command-line snippets:

// Compile:
javac -d out src/chap13/concurrency/page779/Page779.java

// Run:
java -cp out chap13.concurrency.page779.Page779
*/