package chap3.BuildingSwitchStatementsAndExpressions;

public class Page129 {
    public static void main(String[] args) {
//        Since using case null implies pattern matching, the ordering of branches matters anytime case null is used. While case null can appear almost anywhere in switch, it cannot be used after a default statement. For instance, only the first of the following two switch statements compile.
        String fish = null;
        System.out.print(switch (fish) {
            case String s when "ClownFish".equals(s) -> "Hello!";
            case null -> "No good";
            case String s when "BlueTang".equals(s) -> "Hello again!";
            default -> "Goodbye";
        });
//        System.out.print(switch (fish) {
//            case String s when "ClownFish".equals(s) -> "Hello!";
//            case String s when "BlueTang".equals(s) -> "Hello again!";
//            default -> "Goodbye";
//            case null -> "No good";  // DOES NOT COMPILE case null must not be after default
//        });

//        In the second example, the default clause dominates the case null clause.
//        For the exam, make sure you can identify where default and case null can
//        be used within a switch.

    }
}
