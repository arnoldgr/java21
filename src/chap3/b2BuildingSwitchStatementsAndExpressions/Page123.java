package chap3.BuildingSwitchStatementsAndExpressions;

public class Page123 {
    public static void main(String[] args) {

//    How do you return a value from a case block?
//    You could use a return statement, but that ends the method, not just the switch expression!
//    Enter the yield statement, shown in Figure 3.6.
//    It allows the case clause to return a value.
//    For example, the following uses a mix of case expressions and case blocks:
        int fish = 5;
        int length = 12;
        var name = switch (fish) {
            case 1 -> "Goldfish";
            case 2 -> {
                yield "Trout";     //semi colon required
            }
            case 3 -> {
                if (length > 10) yield "Blobfish";
                else yield "Green";
            }                      //no semi colon required
            case 4 -> {
                throw new RuntimeException("Unsupported value");
            }
            default -> "Swordfish";
        };

//        Think of the yield keyword as a return statement within a switch expression.
//        Because a switch expression must return a value, a yield is often required within a
//        case block.The one “exception” to this rule is if the code throws an exception,
//        as shown in the previous example.

//        Watch Semicolons in switch Expressions
//        When writing a case expression, a semicolon is required,
//        but when writing a case block, it is prohibited.

        fish = 1;
//        var name = switch (fish) {
//            case 1  -> "Goldfish"           // DOES NOT COMPILE (missing semicolon)
//            case 2  -> { yield "Trout"; };  // DOES NOT COMPILE (extra semicolon)
//            default -> "Shark";
//        }  // DOES NOT COMPILE (missing semicolon)


//        A bit confusing, right? It’s just one of those things you have to train yourself
//        to spot on the exam.

    }
}
