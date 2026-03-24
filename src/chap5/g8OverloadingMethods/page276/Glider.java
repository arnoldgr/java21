package chap5.g8OverloadingMethods.page276;

//Let’s give this a practice run using the rules in Table 5.6.
// What do you think this outputs?
public class Glider {
    public static String glide(String s) {
        return "1";
    }
    public static String glide(String... s) {
        return "2";
    }
    public static String glide(Object o) {
        return "3";
    }
    public static String glide(String s, String t) {
        return "4";
    }
    public static void main(String[] args) {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }
}


//It prints out 142. The first call matches the signature taking a
// single String because that is the most specific match.
// The second call matches the signature taking two String parameters
// since that is an exact match. It isn’t until the third call that the
// varargs version is used since there are no better matches.



