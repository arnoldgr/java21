package chap3.ConstructingForLoops;

public class Page137 {
    public static void main(String[] args) {
//        Modifying Loop Variables
//        As a general rule, it is considered a poor coding practice to modify loop variables as it can lead to an unexpected result, such as in the following examples:
//        for (int i = 0; i < 10; i++)  // Infinite Loop
//            i = 0;

        for (int j = 1; j < 10; j++)  // Iterates 5 times
            j++;
//        It also tends to make code difficult for other people to follow.
    }
}
