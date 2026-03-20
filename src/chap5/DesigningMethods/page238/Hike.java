package chap5.DesigningMethods.page238;

public class Hike {
    public void hike1() {
    }

    public void hike2() {
        return;
    }

    public String hike3() {
        return "";
    }

//    public String hike4() {
//    }             // DOES NOT COMPILE

    //    public hike5() {}                    // DOES NOT COMPILE
//    public String int hike6() { }        // DOES NOT COMPILE
//    String hike7(int a) {                // DOES NOT COMPILE missing return for all possibilties
//        if (1 < 2) return "orange";
//    }

//    Since the return type of the hike1() method is void, the return statement is optional.
//    The hike2() method shows the optional return statement that correctly doesn’t return anything.
//    The hike3() method is a valid declaration with a String return type and a
//    return statement that returns a String.
//    The hike4() method doesn’t compile because the return statement is missing.
//    The hike5() method doesn’t compile because the return type is missing.
//    The hike6() method doesn’t compile because it attempts to use two return types.
//    You get only one return type.
//    The hike7() method is a little tricky.
//    There is a return statement, but it doesn’t always get run.
//    Even though 1 is always less than 2, the compiler won’t fully evaluate
//    the if statement and requires a return statement if this condition is false. What about this modified version?
//    String hike8(int a) {
//        if (1 < 2) return "orange";
//        return "apple";                   // COMPILER WARNING
//    }

//    The code compiles, although the compiler will produce a warning about unreachable code
//    (or dead code).
//    This means the compiler was smart enough to realize you wrote code that cannot possibly be reached.
//    When returning a value, it needs to be assignable to the return type

}
