package chap9.f6SortingData.page513;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Sometimes you want to sort an object that did not implement Comparable,
// or you want to sort objects in different ways at different times.
// Suppose that we add weight to our Duck class.
record Duck(String name, int weight) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }

    public String toString() {
        return name;
    }
}

public class Page513 {
    public static void main(String[] args) {
        //We also override toString() so our next set of output is shorter. We now have the following:
        Comparator<Duck> byWeight = new Comparator<>() {
            public int compare(Duck d1, Duck d2) {
                return d1.weight() - d2.weight();
            }
        };
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack", 7));
        ducks.add(new Duck("Puddles", 10));
        Collections.sort(ducks);
        System.out.println(ducks);  // [Puddles, Quack]
        Collections.sort(ducks, byWeight);
        System.out.println(ducks);  // [Quack, Puddles]

//The Duck class itself can define only one compareTo() method.
// In this case, name was chosen.
// If we want to sort by something else, we have to define that sort order outside
// the compareTo() method using a separate class or lambda expression.
//Lines 11–15 show how to define a Comparator using an anonymous class.
// On lines 19–22, we sort with the class’s internal Comparator and then with the
// separate Comparator to see the difference in output.
//Comparator is a functional interface since there is only one abstract method to implement.
// This means that we can rewrite the Comparator on lines 11–15 using a lambda expression, as shown here:

        Comparator<Duck> byWeight2 = (d1, d2) -> d1.weight() - d2.weight();
        Collections.sort(ducks, byWeight2);
        System.out.println(ducks);  // [Quack, Puddles]

//Alternatively, we can use a method reference and a helper method to specify that we want to sort by weight.

        Comparator<Duck> byWeight3 = Comparator.comparing(Duck::weight);
        Collections.sort(ducks, byWeight3);
        System.out.println(ducks);  // [Quack, Puddles]

//In this example, Comparator.comparing() is a static interface method that creates a Comparator given a lambda expression or method reference. Convenient, isn’t it?


//Is Comparable a Functional Interface?

//We said that Comparator is a functional interface because it has a single abstract method. Comparable is also a functional interface since it also has a single abstract method. However, using a lambda for Comparable would be silly. The point of Comparable is to implement it inside the object being compared.

    }
}
