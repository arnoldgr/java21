package chap9.f6SortingData.page509;



//        Sorting Data
//        We discussed “order” for the TreeSet and TreeMap classes.
//        For numbers, order is obvious—it is numerical order.
//        For String objects, order is defined according to the Unicode character mapping.

//        Remember 7Up from Chapter 4, “Core APIs”? When working with a String, numbers sort before letters,
//        and uppercase letters sort before lowercase letters.

//        We use Collections.sort() in many of these examples.
//        It returns void because the method parameter is what gets sorted.
//        You can also sort objects that you create yourself.
//        Java provides an interface called Comparable.
//        If your class implements Comparable, it can be used in data structures that require comparison.
//        In fact, you’ve seen many Comparable classes in this book include String, StringBuilder, BigDecimal,
//        BigInteger and the primitive wrapper classes. There is also a class called Comparator,
//        which is used to specify that you want to use a different order than the object itself provides.
//        Comparable and Comparator are similar enough to be tricky.
//        The exam likes to see if it can trick you into mixing up the two.
//        Don’t be confused! In this section, we discuss Comparable first.
//        Then, as we go through Comparator, we point out all of the differences.

//        Creating a Comparable Class
//        The Comparable interface has only one method. In fact, this is the entire interface:
//        interface Comparable<T> {
//            int compareTo(T o);
//        }



import java.util.ArrayList;
import java.util.Collections;

public class Page509 {
    public static void main(String[] args) {
//        Next, we can sort the ducks as follows:
        var ducks = new ArrayList<Duck>();
        ducks.add(new Duck("Quack"));
        ducks.add(new Duck("Puddles"));
        System.out.println(ducks);
        Collections.sort(ducks);  // sort by name
        System.out.print(ducks);  // [Duck[name=Puddles], Duck[name=Quack]]

//        If we didn’t implement the Comparable interface, all we have is a method named compareTo(),
//        and line 14 would not compile.
//        We could also implement Comparable<Object> or some other class for T,
//        but this wouldn’t be as useful for sorting a group of Duck objects.
//        Finally, the Duck class implements compareTo().
//        Since Duck is comparing objects of type String and the String class already has a compareTo() method,
//        it can just delegate.

//        You might have noticed we use a record here. From Chapter 7,
//        “Beyond Classes,” a record provides a lot of useful boilerplate code
//        like constructors and meaningful implementations of toString().
//        Just remember, both records and classes can implement Comparable.
    }
}
