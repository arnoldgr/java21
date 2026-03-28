package chap9.i9WorkingWithGenerics.page535;

import java.util.ArrayList;
import java.util.List;

public class Page535 {

    //Creating Unbounded Wildcards
//An unbounded wildcard represents any data type. You use ? when you want to specify that any type is OK with you.
// Let’s suppose that we want to write a method that looks through a list of any type.
    public static void printList(List<Object> list) {
        for (Object x : list)
            System.out.println(x);
    }

    //    public static void printList(List<?> list) {
//        for (Object x : list)
//            System.out.println(x);
//    }
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java");
//        printList(keywords); // DOES NOT COMPILE
        //Wait. What’s wrong? A String is a subclass of an Object.
        // This is true. However, List<String> cannot be assigned to List<Object>.
        // We know, it doesn’t sound logical.
        // Java is trying to protect us from ourselves with this one.
        // Imagine if we could write code like this:

//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(Integer.valueOf(42));
//        List<Object> objects = numbers; // DOES NOT COMPILE
//        objects.add("forty two");
//        System.out.println(numbers.get(1));

//        On line 4, the compiler promises us that only Integer objects will appear in numbers.
//        If line 6 compiled, line 7 would break that promise by putting a String in there
//        since numbers and objects are references to the same object.
//        Good thing the compiler prevents this.
//       Going back to printing a list, we cannot assign a List<String> to a List<Object>.
//       That’s fine; we don’t need a List<Object>. What we really need is a List of “whatever.”
//       That’s what List<?> is. The following code does what we expect:
//        public static void printList(List<?> list) {
//            for (Object x : list)
//                System.out.println(x);

//        The printList() method takes any type of list as a parameter.
//        The keywords variable is of type List<String>. We have a match! List<String> is a list of anything.
//        “Anything” just happens to be a String here.
//        Finally, let’s look at the impact of var. Do you think these two statements are equivalent?
        List<?> x1 = new ArrayList<>();
        var x2 = new ArrayList<>();

//        They are not. There are two key differences.
//        First, x1 is of type List, while x2 is of type ArrayList.
//        Additionally, we can only assign x2 to a List<Object>.
//        These two variables do have one thing in common.
//        Both return type Object when calling the get() method.

    }
}