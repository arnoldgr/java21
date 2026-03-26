package chap9.a1UsingCommonCollectionAPIs.page483;

 

import java.util.ArrayList;
import java.util.List;

public class Page483 {
    public static void main(String[] args) {
// Using Common Collection APIs
// A collection is a group of objects contained in a single object.
// The Java Collections Framework is a set of classes in java.util for storing collections.
// There are four main interfaces in the Java Collections Framework.

// List: A list is an ordered collection of elements that allows duplicate entries.
// Elements in a list can be accessed by an int index.

//Set: A set is a collection that does not allow duplicate entries.
//Queue: A queue is a collection that orders its elements in a specific order for processing.
// A Deque is a subinterface of Queue that allows access at both ends.
//Map: A map is a collection that maps keys to values, with no duplicate keys allowed. 
// The elements in a map are key/value pairs.

//SEE THE BOOK FOR Figure 9.1 shows the Collection interface, its subinterfaces.

//In this section, we discuss the common methods that the Collections API provides to the implementing classes.
// Many of these methods are convenience methods that could be implemented in other ways but
// make your code easier to write and read. This is why they are convenient.
//In this section, we use ArrayList and HashSet as our implementation classes, 
// but they can apply to any class that inherits the Collection interface. 
// We cover the specific properties of each Collection class in the next section.

//Understanding Generic Types
//In the previous chapter, we showed you numerous functional interfaces that use generics. 
// But what are generics? In Java, generics is just a way of saying parameterized type.
// For example, a List<Integer> is a list of numbers, while Set<String> is a set of strings.
//Without generics, we’d have to write a lot of code like the following:
        List numbers = new ArrayList(List.of(1,2,3));
        Integer element = (Integer) numbers.get(0);  // Required cast to compile
        numbers.add("Welcome to the zoo!");         // Unrelated types allowed

//With generics we can do better. 
// The following change not only does away with the required cast from the previous code 
// but also helps prevent unrelated objects from being added to the collection:
        List<Integer> numbers2 = new ArrayList<Integer>(List.of(1, 2, 3));
        Integer element2 = numbers2.get(0);    // No cast required
//        numbers2.add("Welcome to the zoo!");  // DOES NOT COMPILE

// Getting a compiler error is good. You’ll know right away that something is wrong
// rather than hoping to discover it later. Generics are convenient because the code for List, 
// Set, and other collections does not change based on the generic type. 
// You can even use your own class as the type, such as List<Visitor>.
// We’ll be using generics throughout this chapter, and even show you how to define your
// own generic classes toward the end of this chapter.
    }
}
