package chap9.g7IntroducingSequencedCollections.page521;

import java.util.*;

public class Page521 {
    //    Sequenced collections grant us the ability to work with lots of different types that all have a well-defined encounter order. Using some of the other methods from Table 9.11, we can even rearrange the elements.
    static public void welcomeNext(SequencedCollection<String> visitors) {
        System.out.println("Welcome to the Zoo! " + visitors.getFirst());
        visitors.removeFirst();
    }

    static public void moveToEnd(SequencedCollection<String> visitors) {
        visitors.addLast(visitors.removeFirst());
    }

    public static void main() {


//    What happens if we call this new method on another group of collections?
        var visitArrayList = new ArrayList<String>(
                List.of("Bluey", "Bingo", "Socks"));
        var visitLinkedList = new LinkedList<String>(List.of("Garfield", "Odie"));
        var visitTreeSet = new TreeSet<String>(Set.of("Tom", "Jerry"));

        moveToEnd(visitArrayList);
        welcomeNext(visitArrayList);  // Welcome to the Zoo! Bingo

        moveToEnd(visitLinkedList);
        welcomeNext(visitLinkedList); // Welcome to the Zoo! Odie

//        moveToEnd(visitTreeSet);      // java.lang.UnsupportedOperationException
        welcomeNext(visitTreeSet);

//    Uh-oh, why didn’t the last example work? Just because a method implements SequencedCollection
//    doesn’t mean the class supports all of the methods in Table 9.11.
//    In this example, the addLast() call fails at runtime because you can’t insert an
//    item at the end of a sorted structure.
//    Doing so could violate the comparator within the TreeSet.

//    For the exam, you don’t need to know which collections support which methods found in Table 9.11, but you should know the difference between a sequenced collection and a sorted collection.

//    A SequencedSet is a subtype of SequencedCollection; therefore,
//    it inherits all its methods.
//    It only applies to SequencedCollection classes that also implement Set,
//    such as LinkedHashSet and TreeSet.

    }
}
