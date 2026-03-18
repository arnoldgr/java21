package chap3.BuildingSwitchStatementsAndExpressions;

//Handling a null Case
public class Page128 {
    public static void main(String[] args) {
//        What if the switch variable is null at runtime? We can try using a default clause but you might be surprised at the result.
        String fish = null;
        System.out.print(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "BlueTang" -> "Hello again!";
            default -> "Goodbye";
        });
//
//        This code compiles(it technically is exhaustive) but throws a NullPointerException !
//        One “quick fix”would be
//        to add an if/else statement around the switch,but that would add a lot of extra boilerplate code.

        if (fish == null) {
            System.out.print("What type of fish are you?");
        } else {
            System.out.print(switch (fish) {
                case "ClownFish" -> "Hello!";
                case "BlueTang" -> "Hello again!";
                default -> "Goodbye";
            });
        }

//        New to Java 21, switch now supports
//        case null
//        clause when working with object types, allowing us to rewrite our previous example
//        as the following:

        System.out.print(switch (fish) {
            case "ClownFish" -> "Hello!";
            case "BlueTang" -> "Hello again!";
            case null -> "What type of fish are you?";
            default -> "Goodbye";
        });

//        That’s a lot less boilerplate code, now that we don’t have to handle null separately.

//        Case null Is Considered Pattern Matching

//        Any guess as to why the following code snippet does not compile?

//        switch (fish) {  // DOES NOT COMPILE  should add a default
//            case "ClownFish":
//                System.out.print("Hello!");
//            case "BlueTang":
//                System.out.print("Hello again!");
//            case null:
//                System.out.print("What type of fish are you?");
//
//        }


//        Anytime case null is used within a switch,then the switch statement is
//        considered to use pattern matching.As you should remember
//        from the previous section, that means the switch statement must be exhaustive.Adding a
//        default branch allows the code to compile.
    }
}
