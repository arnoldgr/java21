package chap4.UsingTheStringBuilderClass;

public class Page182 {
    public static void main(String[] args) {
//        Creating a StringBuilder
//        There are three ways to construct a StringBuilder:
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("animal");
        StringBuilder sb3 = new StringBuilder(10);

//        The first says to create a StringBuilder containing an empty sequence of characters
//        and assign sb1 to point to it. The second says to create a StringBuilder
//        containing a specific value and assign sb2 to point to it.
//        The first two examples tell Java to manage the implementation details.
//        The final example tells Java that we have some idea of how big the
//        eventual value will be and would like the StringBuilder to reserve a
//        certain capacity, or number of slots, for characters.

//        Using Common Methods
//        These four methods work exactly the same as in the String class.
//        Be sure you can identify the output of this example:

        var sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);

//        The correct answer is anim 7 s.
//        The indexOf() method calls return 0 and 4, respectively.
//        The substring() method returns the String starting with index 0
//        and ending right before index 4.
//        The length() method returns 7 because it is the number of characters in the StringBuilder
//        rather than an index. Finally, charAt() returns the character at index 6.
//        Here, we do start with 0 because we are referring to indexes.
//        If this doesn’t sound familiar, go back and read the section on String again.
//        Notice that substring() returns a String rather than a StringBuilder.
//        That is why sb is not changed.
//        The substring() method is really just a method that inquires
//        about the state of the StringBuilder.
    }
}
