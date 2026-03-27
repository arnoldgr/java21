package chap9.c3UsingTheSetInterface.page496;

public class Page496 {

    public static void main(String[] args) {
//        Using the Set Interface

//        You use a Set when you don’t want to allow duplicate entries.
//        The main thing that all Set implementations have in common is that they do not allow duplicates.
//        We look at each implementation that you need to know for the exam and how to write code using Set.

//        Comparing Set Implementations

//        Reviewing Figure 9.1 again, you need to know about three classes that implement the Set interface:
//        HashSet, LinkedHashSet, TreeSet.

//        A HashSet stores its elements in a hash table, which means the keys are a hash and the values
//        are an Object.
//        This means the HashSet uses the hashCode() method of the objects to retrieve them more efficiently.
//        Remember that a valid hashCode() doesn’t mean every object will get a unique value, but the method
//        is often written so that hash values are spread out over a large range to reduce collisions.

//        A LinkedHashSet is basically a HashSet with an imaginary LinkedList running across its elements.
//        This allows you to iterate over the set in a well-defined encounter order,
//        which is often the order the elements were inserted.
//        That said, LinkedHashSet also includes methods to add/remove elements from the front or back of the set,
//        allowing you to change the ordering as needed.

//         Finally, a TreeSet stores its elements in a sorted tree structure. The main benefit is that the set is always in sorted order. The trade-off is that adding or removing an element could take longer than with a HashSet, especially as the tree grows larger.
    }
}
