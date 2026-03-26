package chap9.a1UsingCommonCollectionAPIs.page487;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Page487 {
    public static void main(String[] args) {
//        Removing with Conditions
//        The removeIf() method removes all elements that match a condition.
//        We can specify what should be deleted using a block of code or even a method reference.
//        The method signature looks like the following.
//        (We explain what the ? super means in the “Working with Generics” section later in this chapter.)
//        public boolean removeIf(Predicate<? super E> filter)

//        It uses a Predicate, which takes one parameter and returns a boolean.
//        Let’s take a look at an example:
        Collection<String> list = new ArrayList<>();
        list.add("Magician");
        list.add("Assistant");
        System.out.println(list);     // [Magician, Assistant]
        list.removeIf(s -> s.startsWith("A"));
        System.out.println(list);     // [Magician]

//        Line 21 shows how to remove all of the String values that begin with the letter A.
//        This allows us to make the Assistant disappear.
//        Let’s try an example with a method reference:
        Collection<String> set = new HashSet<>();
        set.add("Wand");
        set.add("");
        set.removeIf(String::isEmpty); // s -> s.isEmpty()
        System.out.println(set);       // [Wand]

//        On line 30, we remove any empty String objects from set.
//        The comment on that line shows the lambda equivalent of the method reference.
//        Line 15 shows that the removeIf() method successfully removed one element from list.


//        Iterating on a Collection
//        There’s a forEach() method that you can call on a Collection instead of writing a loop.
//        It uses a Consumer that takes a single parameter and doesn’t return anything.
//        The method signature is as follows:
//        public void forEach(Consumer<? super T> action)

//        Cats like to explore, so let’s print out two of them using both method references and lambdas:
        Collection<String> cats = List.of("Annie", "Ripley");
        cats.forEach(System.out::println);
        cats.forEach(c -> System.out.println(c));

//        The cats have discovered how to print their names. Now they have more time to
//        play (as do we)!
    }
}
