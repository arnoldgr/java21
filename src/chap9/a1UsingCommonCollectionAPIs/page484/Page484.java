package chap9.a1UsingCommonCollectionAPIs.page484;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Page484 {
    public static void main(String[] args) {
//        Shortening Generics Code
//        In the previous section, you saw generics that declare the type on both the left
//        and right sides like the following:

        List<Integer> list = new ArrayList<Integer>();

//        You might even have generics that contain other generics, such as this:

        Map<Long, List<Integer>> mapOfLists = new HashMap<Long, List<Integer>>();

//        That’s a lot of duplicate code to write! In this section, we offer two ways of shortening this code.

//        Applying the Diamond Operator
//        The diamond operator (<>) is a shorthand notation that allows you to omit the generic
//        type from the right side of a statement when the type can be inferred. I
//        t is called the diamond operator because <> looks like a diamond.
//        Compare the previous declarations with these new, much shorter versions:

        List<Integer> list2 = new ArrayList<>();
        Map<Long, List<Integer>> mapOfLists2 = new HashMap<>();

//        To the compiler, both these declarations and our previous ones are equivalent.
//        Note the diamond operator cannot be used as the type in a variable declaration.
//        It can be used only on the right side of an assignment operation.
//        For example, neither of the following compiles:


//        List<> list3 = new ArrayList<Integer>();      // DOES NOT COMPILE

//        class InvalidUse {
//            void use(List<> data) {
//            }                  // DOES NOT COMPILE
//        }


//        Applying var
//        As you’ve seen earlier in this book, you can also use var to shorten expressions with generics.
        var list3 = new ArrayList<Integer>();
        var mapOfLists3 = new HashMap<Long, List<Integer>>();

//        Notice how the generic type is back on the right side.
//        That’s because var infers the type from the right side of the declaration,
//        whereas the diamond operator infers it from the left side.
//        Which style you use, var or diamond operator, is up to you.
//        Just don’t specify the generic type on both sides of the =, because that’s redundant!

    }
}
