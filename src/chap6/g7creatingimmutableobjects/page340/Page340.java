package chap6.creatingimmutableobjects.page340;

//Performing a Defensive Copy
//So, what’s this about the fifth and final rule for creating immutable objects? In designing our class, let’s say we want a rule that the data for favoriteFoods is provided by the caller and that it always contains at least one element. This rule is often called an invariant; it is true any time we have an instance of the object.

import java.util.ArrayList;

final class Animal {  // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public Animal(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.size() == 0)
            throw new RuntimeException("favoriteFoods is required");
        this.favoriteFoods = favoriteFoods;
 
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }

    public String getFavoriteFoodsItem(int index) {
        return favoriteFoods.get(index);

    }
}

//To ensure that favoriteFoods is provided, we validate it in the constructor and throw an exception
// if it is not provided. So is this immutable? Not quite! A malicious caller might be tricky and keep
// their own secret reference to our favoriteFoods object, which they can modify directly.
public class Page340 {
    public static void main(String[] args) {
        var favorites = new ArrayList<String>();
        favorites.add("Apples");

        var zebra = new Animal(favorites);  // Caller still has access to favorites
        System.out.println(zebra.getFavoriteFoodsItem(0));  // [Apples]

        favorites.clear();
        favorites.add("Chocolate Chip Cookies");
        System.out.println(zebra.getFavoriteFoodsItem(0));  // [Chocolate Chip Cookies]

    }
}


//Whoops! It seems like Animal is not immutable anymore, since its contents can change after it is created.
// The solution is to make a copy of the list object containing the same elements.
//public Animal(List<String> favoriteFoods) {
//    if (favoriteFoods == null || favoriteFoods.size() == 0)
//        throw new RuntimeException("favoriteFoods is required");
//    this.favoriteFoods = new ArrayList<String>(favoriteFoods);
//}

//The copy operation is called a defensive copy because the copy is being made in case other code does something unexpected. It’s the same idea as defensive driving: prevent a problem before it exists. With this approach, our Animal class is once again immutable.
