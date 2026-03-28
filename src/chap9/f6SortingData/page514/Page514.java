package chap9.f6SortingData.page514;

public record Duck(String name, int weight) implements Comparable<Duck> {
    public int compareTo(Duck d) {
        return name.compareTo(d.name);
    }
    public String toString() { return name; }
}


public class Page514 {
//    Comparing Comparable and Comparator
//    There are several differences between Comparable and Comparator.
//    We’ve listed them for you in Table 9.8.

//        TABLE 9.8 Comparison of Comparable and Comparator

//    Difference                        Comparable       Comparator
//
//    Package name                      java.lang        java.util
//
//Interface must be implemented
//by  class comparing                    yes              no
//
//Method name in interface              compareTo()       compare()
//
//number of parameters                   1                2
//
//Common to declare using a lambda        no               yes


//    Memorize this table—really.
//    The exam will try to trick you by mixing up the two and seeing if you can catch it.
//    Do you see why this doesn’t compile?

//    var byWeight = new Comparator<Duck>() { // DOES NOT COMPILE
//        public int compareTo(Duck d1, Duck d2) {
//            return d1.getWeight()-d2.getWeight();
//        }
//    };

//    The method name is wrong. A Comparator must implement a method named compare().
//
//    Pay special attention to method names and the number of parameters
//    when you see Comparator and Comparable in questions.

}
