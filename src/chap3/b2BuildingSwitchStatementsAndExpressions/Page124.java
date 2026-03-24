package chap3.BuildingSwitchStatementsAndExpressions;

//Using Pattern Matching with switch
public class Page124 {
    public static void main(String[] args) {
        Number num = 34;
        Double doub = 36.00;
        Integer inter = 38;
        printDetails(num);
        printDetails(doub);
        printDetails(inter);

        //
        System.out.println(getTrainer(num));
        System.out.println(getTrainer(doub));
        System.out.println(getTrainer(inter));
    }

    //    One of the biggest new features of Java 21 is that pattern matching has been extended to switch.
//    There’s a number of rules to cover, so let’s start with the basics.
//    To use pattern matching with a switch, first start with an object reference variable.
//    Any object reference type is permitted, provided the switch makes use of pattern matching.
//    Next, in each case clause, define a type and pattern matching variable.
    static void printDetails(Number height) {
        String message = switch (height) {
            case Integer i -> "Rounded: " + i;
            case Double d -> "Precise: " + d;
            case Number n -> "Unknown: " + n;
        };
        System.out.println(message);
    }
//    In this example, we output different values depending on the type of the switch variable.
//    The same rules about local variables and flow scoping that we learned about earlier with
//    pattern matching apply. For instance, the pattern matching variable exists only within
//    the case branch for which it is defined. This allows us to reuse the same name for
//    two case branches.

//    using guards
//    Let’s try an example using the when clause. Suppose our zoo has different trainers that can handle different size
//    animals depending on the measurement type.

    static String getTrainer(Number height) {
        return switch (height) {
            case Integer i when i > 10 -> "Joseph";
            case Integer i -> "Daniel";
            case Double num when num <= 15.5 -> "Peter";
            case Double num -> "Kelly";
            case Number num -> "Ralph";
        };
//        In this example, Joseph works with the animal if the height is an Integer greater than 10.
//        Daniel is then selected for all other Integer values. Likewise, Peter handles all
//        Double measurements less than or equal to 15.5, while Kelly handles the remaining
//        Double values. Finally, Ralph handles all animals that don’t meet one of the previous
//        requirements, such as if Short was used.

    }

}
