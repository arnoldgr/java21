package chap9.f6SortingData.page511;

//Checking for null
//When working with Comparable and Comparator in this chapter, we tend to assume the data has values, but this is not always the case. When writing your own compare methods, you should check the data before comparing it if it is not validated ahead of time.

import java.util.ArrayList;
import java.util.Collections;

record MissingDuck(String name) implements Comparable<MissingDuck> {
    public int compareTo(MissingDuck quack) {
        if (quack == null)
            throw new IllegalArgumentException("Poorly formed duck!");
        if (this.name == null && quack.name == null)
            return 0;
        else if (this.name == null) return -1;
        else if (quack.name == null) return 1;
        else return name.compareTo(quack.name);
    }
}

public class Page511 {
    public static void main(String[] args) {
        var missingDuck = new ArrayList<MissingDuck>();
        missingDuck.add(null);
        missingDuck.add(new MissingDuck("f"));
        missingDuck.add(new MissingDuck(null));
        Collections.sort(missingDuck);
        System.out.println(missingDuck);
//        This method throws an exception if it is passed a null MissingDuck object.
//        What about the ordering? If the name of a duck is null, it’s sorted first.
    }
}
