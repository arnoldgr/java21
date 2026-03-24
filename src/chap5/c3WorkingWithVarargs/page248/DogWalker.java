package chap5.c3WorkingWithVarargs.page248;

//Finally! You get to do something other than identify whether method declarations are valid.
// Instead, you get to look at method calls. Can you figure out why each method call outputs
// what it does?
// For now, feel free to ignore the static modifier in the walkDog() method declaration;
// we cover that later in the chapter.

public class DogWalker {
    public static void walkDog(int start, int... steps) {
        System.out.println(steps.length);
    }

    public static void main(String[] args) {
        walkDog(1);                    // 0
        walkDog(1, 2);                 // 1
        walkDog(1, 2, 3);              // 2
        walkDog(1, new int[]{4, 5});  // 2

// The following snippet does compile:
        walkDog(1, null);     // Triggers NullPointerException in walkDog(
//Since null isn’t an int, Java treats it as an array reference that happens to be null.
// It just passes on the null array object to walkDog().
// Then the walkDog() method throws an exception because it tries to determine the length of null.

    }
}

//Line 9 passes 1 as start but nothing else.
// This means Java creates an array of length 0 for steps.
// Line 10 passes 1 as start and one more value.
// Java converts this one value to an array of length 1.
// Line 11 passes 1 as start and two more values. J
// ava converts these two values to an array of length 2.
// Line 12 passes 1 as start and an array of length 2 directly as steps.
//You’ve seen that Java will create an empty array if no parameters
// are passed for a vararg. However, it is still possible to pass null explicitly.
