package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page464;

import java.util.function.DoubleToIntFunction;
import java.util.function.ToIntFunction;

public class Page464 {
    public static void main(String[] args) {
//        Functional Interfaces for double, int, and long
//        We’ve been using functional interfaces for a while now, so you should have a good grasp of how to
//        read the table.
//        Let’s do one example just to be sure. Which functional interface would you use to
//        fill in the blank to make the following code compile?

//        var d = 1.0;
//        ______________ f1 = x -> 1;
//        f1.applyAsInt(d);
//        When you see a question like this, look for clues. You can see that the functional interface in
//        question takes a double parameter and returns an int. You can also see that it has a
//        single abstract method named applyAsInt.
//        The DoubleToIntFunction and ToIntFunction functional interfaces meet all three of those criteria.


        var d = 1.0;
        DoubleToIntFunction f1 = x -> 1;
        System.out.println(f1.applyAsInt(d));

        //OR

        ToIntFunction f2 = x -> 1;
        System.out.println(f1.applyAsInt(d));
    }
}
