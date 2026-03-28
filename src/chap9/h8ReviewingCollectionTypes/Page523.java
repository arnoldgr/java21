package chap9.h8ReviewingCollectionTypes;

import java.util.*;

public class Page523 {
    public static void main() {

//    Reviewing Collection Types
//    We conclude this part of the chapter by reviewing rules that apply to various collection types,
//    as well as an overview of all the types covered in this chapter.

        //    Using Unmodifiable Wrapper Views
//    An unmodifiable view is a wrapper object around a collection that cannot be modified through
//    the view itself. While the view object cannot be modified, the underlying data can still be modified.
//    There are four methods you should be familiar with for the exam that create unmodifiable
//    views of a collection:

        Collection<String> coll = Collections.unmodifiableCollection(List.of("brown"));
        List<String> list = Collections.unmodifiableList(List.of("orange"));
        Set<String> set = Collections.unmodifiableSet(Set.of("green"));
        Map<String, Integer> map = Collections.unmodifiableMap(Map.of("red", 1));

        //    Let’s consider some code that uses them:
        Map<String, Integer> map2 = new TreeMap<>();
        map2.put("blue", 41);
        map2.put("red", 90);
        List<String> list2 = Arrays.asList("green", "yellow");
        Set<String> set2 = new HashSet<>(list2);

        Map<String, Integer> mapView = Collections.unmodifiableMap(map2);
        Collection<String> collView = Collections.unmodifiableCollection(list2);
        List<String> listView = Collections.unmodifiableList(list2);
        Set<String> setView = Collections.unmodifiableSet(set2);

//    As you might expect, trying to modify an unmodifiable view throws an exception.
//    When run independently, each of the following compiles and throws an
//    UnsupportedOperationException at runtime.
        collView.add("pink");
        setView.remove("green");
        mapView.put("blue", 42);

//    However, since it is a view, nothing prevents you from changing the original values. For example:
        System.out.println(mapView);   // {blue=41, red=90}
        System.out.println(collView);  // [green, yellow]
        System.out.println(listView);  // [green, yellow]
        System.out.println(setView);   // [green, yellow]

        map.put("blue", 105);
        list.set(1, "purple");

        System.out.println(mapView);   // {blue=105, red=90}
        System.out.println(collView);  // [green, purple]
        System.out.println(listView);  // [green, purple]
        System.out.println(setView);   // [green, yellow]


//    On line 29, notice that the value of blue is changed to 105 in the original
//    TreeMap and it shows up as changed in mapView on line 32.
//    The list variable created on line 13 refers to a fixed sized backed array.
//    Which means both collView and listView represent a view of a List that refers to a backed array.
//    Since the value is set on line 30, it remains the same size, and the change properly shows up in our views.
//            However, setView has not changed value.
//            The constructor on line 14 makes a new set that is disconnected from the original data structure.
//            This means line 30 has no effect on set.
//    What happens if we try adding elements to these collections?

        set.add("orange");
        System.out.println(setView);   // [green, yellow, orange]

        list.add("orange");            // UnsupportedOperationException

//    Line 36 successfully modifies the underlying HashSet, with the changes reflected in the view on line 37.
//    Line 39 throws an exception at runtime. Remember, the list was created with Arrays.asList().
//    As we saw earlier in the chapter, you can replace elements in such objects but you cannot add/remove elements.
//    For the exam, remember to check the type of the underlying object to determine if things can be added, removed,
//    or modified.
    }
}
