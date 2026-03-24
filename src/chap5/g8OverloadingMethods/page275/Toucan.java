package chap5.g8OverloadingMethods.page275;

//Varargs
//Which method do you think is called if we pass an int[]?
public class Toucan {
    public static void main(String[] args) {
//        It is time to mention how they are different.
//        It shouldn’t be a surprise that you can call either method by passing an array:
        fly(new int[]{1, 2, 3});  // Allowed to call either fly() method

//        However, you can only call the varargs version with stand-alone parameters:
        fly(1, 2, 3);  // Allowed to call only the fly() method using varargs only

//        Obviously, this means they don’t compile exactly the same.
//        The parameter list is the same, though, and that is what
//        you need to know with respect to overloading for the exam.

    }

    //    Which method do you think is called if we pass an int[]?
//    Will not compile, they are both the same signature
//    static public void fly(int[] lengths) {}
    static public void fly(int... lengths) {
    }     // DOES NOT COMPILE
}

//Trick question!
// Remember that Java treats varargs as if they were an array.
// This means the method signature is the same for both methods.
// Since we are not allowed to overload methods with the same parameter list,
// this code doesn’t compile. Even though the code doesn’t look the same,
// it compiles to the same parameter list.

