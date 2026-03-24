package chap1.InitialisingVariables.page42;

public class Page42 {
//    public void doesThisCompile(boolean check) {
//        var question;
//        question = 1;
//        var answer;
//        if (check) {
//            answer = 2;
//        } else {
//            answer = 3;
//        }
//        System.out.println(answer);
//    }

    //does not compile because the declaration and assignment must be in the same statement

//    public void twoTypes() {
//        int a, var b = 3;  // DOES NOT COMPILE
//        var a, b = 3;      // DOES NOT COMPILE
//        var n = null;      // DOES NOT COMPILE
//    }
    //Line 5 wouldn’t work even if you replaced var with a real type.
    // All the types declared on a single line must be the same type and share the same declaration.
    // We couldn’t write int a, int b = 3; either.
    // Line 6 shows that you can’t use var to define two variables on the same line.
    //Line 7 is a single line. The compiler is being asked to infer the type of null.
    // This could be any reference type. The only choice the compiler could make is Object.
    // However, that is almost certainly not what the author of the code intended.
    // The designers of Java decided it would be better not to allow var for null than to have
    // to guess at intent.


}
