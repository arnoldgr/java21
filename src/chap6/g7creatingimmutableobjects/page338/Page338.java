package chap6.creatingimmutableobjects.page338;

//Creating Immutable Objects
//As you might remember from Chapter 4, an immutable object is one that cannot change state after it is created.
// The immutable objects pattern is an object-oriented design pattern in which an object cannot be modified after
// it is created.
//Immutable objects are helpful when writing secure code because you don’t have to worry about the values changing.
// They also simplify code when dealing with concurrency since immutable objects can be easily shared between multiple threads.

//Declaring an Immutable Class
//Although there are a variety of techniques for writing an immutable class, you should be familiar with a
// common strategy for making a class immutable:

//Mark the class as final or make all of the constructors private.
//Mark all the instance variables private and final.
//Don’t define any setter methods.
//Don’t allow referenced mutable objects to be modified.
//Use a constructor to set all properties of the object, making a copy if needed.
//
//The first rule prevents anyone from creating a mutable subclass.
// The second and third rules ensure that callers don’t make changes to instance variables and
// are the hallmarks of good encapsulation, a topic we discuss along with records in Chapter 7.
//The fourth rule for creating immutable objects is subtle.
// Basically, it means you shouldn’t expose an accessor (or getter) method for mutable instance fields.
// Can you see why the following creates a mutable object?

import java.util.*;

final class Animal {  // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public Animal() {
        this.favoriteFoods = new ArrayList<String>();
        this.favoriteFoods.add("Apples");
    }

    public List<String> getFavoriteFoods() {
       return favoriteFoods;

    }
}


//We carefully followed the first three rules, but unfortunately, a malicious caller could still modify our data.
public class Page338 {
    public static void main(String[] args) {
        var zebra = new Animal();
        System.out.println(zebra.getFavoriteFoods());  // [Apples]

        zebra.getFavoriteFoods().clear();
        zebra.getFavoriteFoods().add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoods());  // [Chocolate Chip Cookies]
    }
}

//
//Oh no! Zebras should not eat Chocolate Chip Cookies! It’s not an immutable object if we can change its contents! If we don’t have a getter for the favoriteFoods object, how do callers access it? Simple: by using delegate or wrapper methods to read the data.
//        import java.util.*;
//final class Animal {  // An immutable object declaration
//    private final List<String> favoriteFoods;
//
//    public Animal() {
//        this.favoriteFoods = new ArrayList<String>();
//        this.favoriteFoods.add("Apples");
//    }
//
//    public int getFavoriteFoodsCount() {
//        return favoriteFoods.size();
//    }
//
//    public String getFavoriteFoodsItem(int index) {
//        return favoriteFoods.get(index);
//    } }
//
//In this improved version, the data is still available. However, it is a true immutable object because
// the mutable variable cannot be modified by the caller.
//
// Copy on Read Accessor Methods
//
//Besides delegating access to any private mutable objects, another approach is to make a copy of the mutable object any time it is requested.
//
//
//public ArrayList<String> getFavoriteFoods() {
//    return new ArrayList<String>(this.favoriteFoods);
//}
//
//
// Of course, changes in the copy won’t be reflected in the original, but at least the original
// is protected from external changes. This can be an expensive operation if called frequently by the caller.
//
