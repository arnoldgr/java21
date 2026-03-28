package chap9.f6SortingData.page518;

import java.util.Set;
import java.util.TreeSet;

record Duck(String name ) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }
    public String toString() { return name; }
}

//Going back to our Rabbit that does not implement Comparable, we try to add it to a TreeSet:
class UseTreeSet {
    record Rabbit(int id) {
    }

    public static void main(String[] args) {
        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Puddles"));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit(1));  // ClassCastException

        //Line 19 is fine. Duck does implement Comparable.
        // TreeSet is able to sort it into the proper position in the set.
        // Line 22 is a problem.
        // When TreeSet tries to sort it, Java discovers the fact that Rabbit does not implement Comparable.
        // Java throws an exception that looks like this:
//Exception in thread "main" java.lang.ClassCastException:
//class UseTreeSet$Rabbit cannot be cast to class java.lang.Comparable

//It may seem weird for this exception to be thrown when the first object is added to the set.
// After all, there is nothing to compare yet. Java works this way for consistency.
//Just like searching and sorting, you can tell collections that require sorting that you want
// to use a specific Comparator. For example:
//        Set<Rabbit> rabbits = new TreeSet<>((r1, r2) -> r1.id - r2.id);
//        rabbits.add(new Rabbit(1));

//Now Java knows that you want to sort by id, and all is well. A Comparator is a helpful object.
// It lets you separate sort order from the object to be sorted. It’s the declaration of the
// TreeSet that has changed.

    }
}

