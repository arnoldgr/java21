package chap9.i9WorkingWithGenerics.page537;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Page537 {

    public static void main(String[] args) {
//        Creating Lower -Bounded Wildcards
//        Let’s try to write a method that adds a string "quack" to two lists.
        List<String> strings = new ArrayList<String>();
        strings.add("tweet");

        List<Object> objects = new ArrayList<Object>(strings);
        addSound(strings);
        addSound(objects);

//        The problem is that we want to pass a List<String > and a List<Object > to the same method.First, make sure you
//        understand why the first three examples in Table 9.16 do not solve this problem.
    }

    //    To solve this problem, we need to use a lower bound.
    public static void addSound(List<? super String> list) {
        list.add("quack");

//With a lower bound, we are telling Java that the list will be a list of String objects or a list of some objects
// that are a superclass of String. Either way, it is safe to add a String to that list.
//Just like generic classes, you probably won’t use this in your code unless you are writing code for others to reuse.
// Even then, it would be rare. But it’s on the exam, so now is the time to learn it!

//Understanding Generic Supertypes

//When you have subclasses and superclasses, lower bounds can get tricky.//
        List<? super IOException> exceptions = new ArrayList<Exception>();
//  exceptions.add(new Exception()); // DOES NOT COMPILE
        exceptions.add(new IOException());
        exceptions.add(new FileNotFoundException());
//
//
//Line 35 references a List that could be List<IOException> or List<Exception> or List<Object>.
// Line 36 does not compile because we could have a List<IOException>, and an Exception object wouldn’t fit in there.
//Line 37 is fine. IOException can be added to any of those types.
// Line 38 is also fine. FileNotFoundException can also be added to any of those three types.
// This is tricky because FileNotFoundException is a subclass of IOException, and the keyword says super.
// Java says, “Well, FileNotFoundException also happens to be an IOException, so everything is fine.”
//
    }
}