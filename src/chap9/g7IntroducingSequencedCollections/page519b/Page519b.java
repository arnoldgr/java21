package chap9.g7IntroducingSequencedCollections.page519b;

import java.util.*;

public class Page519b {
//Introducing Sequenced Collections
//New to Java 21 are sequenced collections, which includes the three interfaces

//SequencedCollection
//SequencedSet
//SequencedMap

//A sequenced collection is a collection in which the encounter order is well-defined.
// By encounter order, it means all of the elements can be read in a repeatable way.
// While the elements of the collection may be sorted, it is not required.

//Working with SequencedCollection
//Let’s start with the simplest example of a sequenced collection,
//one you’ve been working with throughout this book.
//An ArrayList is a SequencedCollection, as its first and last elements are well-defined,
//as is the ordering of all elements in between.

    //Table 9.11 which includes various methods available on a SequencedCollection.

//addFirst(E e)
//Adds element as the first element in the collection

//addLast(E e)
//Adds element as the last element in the collection

//getFirst()
//Retrieves the first element in the collection

//getLast()
//Retrieves the last element in the collection

//removeFirst()
//Removes the first element in the collection

//removeLast()
//Removes the last element in the collection

//reversed()
//Returns a reverse-ordered view of the collection

    //For ArrayList, it should be pretty obvious how most of these methods are implemented. For example, to add or retrieve the first element in the list, you could call the add(0,e) and get(0), respectively. The purpose of the SequencedCollection interface isn’t necessarily to add new functionality, but to make it easier to work with related types. For example, let’s say we have the following method that welcomes the next visitor to the zoo:
    static public void welcomeNext(SequencedCollection<String> visitors) {
        System.out.println("Welcome to the Zoo! " + visitors.getFirst());
        visitors.removeFirst();
    }

    public static void main() {

//We can now apply various sequenced collections to this method:

        var visitArrayList = new ArrayList<String>(List.of("Huey", "Dewey", "Louie"));
        var visitLinkedList = new LinkedList<String>(List.of("Moe", "Larry", "Shemp"));
        var visitTreeSet = new TreeSet<String>(Set.of("Alvin", "Simon", "Theodore"));

        welcomeNext(visitArrayList);  // Welcome to the Zoo! Huey
        welcomeNext(visitLinkedList); // Welcome to the Zoo! Moe
        welcomeNext(visitTreeSet);    // Welcome to the Zoo! Alvin

    }
}