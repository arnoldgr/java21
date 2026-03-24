package chap4.UsingTheStringBuilderClass;

public class Page180 {
    public static void main(String[] args) {
//        A small program can create a lot of String objects very quickly.
//        For example, how many objects do you think this piece of code creates?
        String alpha = "";
        for (char current = 'a'; current <= 'z'; current++)
            alpha += current;
        System.out.println(alpha);

//        The empty String on line 10 is instantiated, and then line 12 appends an "a".
//        However, because the String object is immutable, a new String object
//        is assigned to alpha, and the "" object becomes eligible for garbage collection.
//        The next time through the loop, alpha is assigned a new String object, "ab",
//        and the "a" object becomes eligible for garbage collection. The next iteration
//        assigns alpha to "abc", and the "ab" object becomes eligible for garbage collection, and so on.
//        This sequence of events continues, and after 26 iterations through the loop,
//        a total of 27 objects are instantiated, most of which are immediately eligible for garbage collection.

//        Using StringBuilder
//        This is very inefficient. Luckily, Java has a solution. The StringBuilder class creates a String without storing all those interim String values. Unlike the String class, StringBuilder is not immutable.
        StringBuilder alpha2 = new StringBuilder();
        for (char current = 'a'; current <= 'z'; current++)
            alpha2.append(current);
        System.out.println(alpha2);

//        On line 23, a new StringBuilder object is instantiated. The call to append() on
//        line 25 adds a character to the StringBuilder object each time through the for loop,
//        appending the value of current to the end of alpha. This code reuses the same
//        StringBuilder without creating an interim String each time.

    }
}
