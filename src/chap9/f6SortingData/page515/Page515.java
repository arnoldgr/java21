package chap9.f6SortingData.page515;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparing Multiple Fields
//When writing a Comparator that compares multiple instance variables,
// the code gets a little messy.
// Suppose that we have a Squirrel record, as shown here:

record Squirrel(int weight, String species) {
}

//We want to write a Comparator to sort by species name.
// If two squirrels are from the same species, we want to sort the one that weighs the least first.
// We could do this with code that looks like this:

class MultiFieldComparator implements Comparator<Squirrel> {
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.species().compareTo(s2.species());
        if (result != 0) return result;
        else return s1.weight() - s2.weight();
    }
}

//This works assuming no species’ names are null. It checks one field.
// If they don’t match, we are finished sorting.
// If they do match, it looks at the next field.
// This isn’t easy to read, though. It is also easy to get wrong.
// Changing != to == breaks the sort completely.


public class Page515 {
    public static void main(String[] args) {
//Alternatively, we can use method references and build the Comparator.
// This code represents logic for the same comparison:

        Comparator<Squirrel> c = Comparator.comparing(Squirrel::species)
                .thenComparingInt(Squirrel::weight);

        var sq = new ArrayList<Squirrel>();
        sq.add(new Squirrel(20,"Aspecies"));
        sq.add(new Squirrel(50,"Aspecies"));
        sq.add(new Squirrel(10,"Aspecies"));
        sq.add(new Squirrel(6,"Aspecies"));
        System.out.println(sq);
        Collections.sort(sq,c);
        System.out.println(sq);

//This time, we chain the methods. First, we create a Comparator on species ascending.
// Then, if there is a tie, we sort by weight.
// We can also sort in descending order.
// Some methods on Comparator, like thenComparingInt(), are default methods.
//Suppose we want to sort in descending order by species.
        var c2 = Comparator.comparing(Squirrel::species).reversed();
        System.out.println(sq);
        Collections.sort(sq,c2);
        System.out.println(sq);


// SEE BOOK FOR Table 9.9 shows the helper methods you should know for build

// You’ve probably noticed by now that we often ignore null values in checking equality and comparing objects.
// This works fine for the exam. In the real world, though, things aren’t so neat.
// You will have to decide how to handle null values or prevent them from being in your object.
    }
}
