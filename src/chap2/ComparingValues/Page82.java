package chap2.ComparingValues;
//Relational Operators
public class Page82 {
    public static void main(String[] args) {
        //Numeric Comparison Operators
        int gibbonNumFeet = 2, wolfNumFeet = 4, ostrichNumFeet = 2;
        System.out.println(gibbonNumFeet < wolfNumFeet);      // true
        System.out.println(gibbonNumFeet <= wolfNumFeet);     // true
        System.out.println(gibbonNumFeet >= ostrichNumFeet);  // true
        System.out.println(gibbonNumFeet > ostrichNumFeet);   // false

//        Notice that the last example outputs false, because although gibbonNumFeet and ostrichNumFeet
//        have the same value, gibbonNumFeet is not strictly greater than ostrichNumFeet.

    }
}
