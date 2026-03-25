package chap1.h8InitialisingVariables.page38;

//initialising variables
public class Page38 {
    public static void main(String[] args) {
        //Final Local Variables
        //The final keyword can be applied to local variables and is equivalent to declaring constants in other languages. Consider this example:
        final int y = 10;
        int x = 20;
        //y = x + 10;  // DOES NOT COMPILE

        //Both variables are set, but y uses the final keyword. For this reason, line 7 triggers a compiler error since the value cannot be modified.
        //The final modifier can also be applied to local variable references. The following example uses an int[] array object, which you learn about in Chapter 4.
        final int[] favoriteNumbers = new int[10];
        favoriteNumbers[0] = 10;
        favoriteNumbers[1] = 20;
        // favoriteNumbers = null;  // DOES NOT COMPILE


    }

//    public int notValid() {
//        int y = 10;
//        int x;
//        int reply = x + y;  // DOES NOT COMPILE, x has no value
//
//        return reply;
//    }

    //The y variable is initialized to 10. By contrast, x is not initialized before it is used in the expression on line 7, and the compiler generates an error. The compiler is smart enough to recognize variables that have been initialized after their declaration but before they are used. Here’s an example:
    public int valid() {
        int y = 10;
        int x;  // x is declared here
        x = 3;  // x is initialized here
        int z;  // z is declared here but never initialized or used
        int reply = x + y;
        return reply;
    }

    public void findAnswer(boolean check) {
        int answer;
        int otherAnswer;
        int onlyOneBranch;
        if (check) {
            onlyOneBranch = 1;
            answer = 1;
        } else {
            answer = 2;
        }
        System.out.println(answer);
        // System.out.println(onlyOneBranch);  // DOES NOT COMPILE
        // The onlyOneBranch variable is initialized only if check happens to be true.
        // The compiler knows there is the possibility for check to be false, resulting in uninitialized code,
        // and gives a compiler error.

    }
    //In the previous example, check is a method parameter.
    public void findAnswer2(boolean check) {}

    //Take a look at the following method checkAnswer() in the same class:
    public void checkAnswer() {
        boolean value;
        // findAnswer2(value);  // DOES NOT COMPILE
    }
}

