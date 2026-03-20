package chap3.BuildingSwitchStatementsAndExpressions;

import java.util.Random;

public class Page125 {
    public static void main(String[] args) {
//        One advantage of guards is that now switch can do something it’s never done before:
//        it can handle ranges. Previously, if you wanted to support a range of values with a switch,
//        you had to list all the possible case values. With the when clause, you can support range
//        matches. Quite convenient!

        Number variableToTest = new Random().nextInt();
        int result = switch (variableToTest) {
            case Integer x when x > 0 && x <= 20 -> 3;
            case Integer x -> 5;
            case Number n -> 10;
        };

        System.out.println(variableToTest);
        System.out.println(result);


//    Applying Acceptable Types
//    One of the simplest rules when working with switch and pattern matching is that the type
//    can’t be unrelated. It must be the same type as the switch variable or a subtype.

        Number fish = 10;
        String name = switch (fish) {
            case Integer freshWater -> "Bass";
            case Number saltWater -> "ClownFish";
            //     case String s           -> "Shark";  // DOES NOT COMPILE
        };

        System.out.println(name);
    }
}