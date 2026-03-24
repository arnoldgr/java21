package chap3.BuildingSwitchStatementsAndExpressions;

public class Page121 {
    public static void main(String[] args) {

    }

    //    Exhausting the switch Branches
//    Unlike a switch statement, a switch expression must return a value.
//    Why? Let’s try an illustrative example.
//    void identifyType(String type) {
//        Integer reptile = switch (type) { // DOES NOT COMPILE
//            case "Snake"  -> 1;
//            case "Turtle" -> 2;
//        };
//    }
//
//    What is the value of reptile if type is not equal to Snake or Turtle?
//    Does it throw an exception? Return null or -1? The answer is “None of
//    the above.” Java decided this behavior would be unsupported and triggers
//    a compiler error if the switch expression is not exhaustive.
//    A switch is said to be exhaustive if it covers all possible values.
//    All switch expressions must be exhaustive, which means they must handle all
//    possible values. As we’ll see shortly, there are times a switch statement must
//    be exhaustive too. There are three ways to write an exhaustive switch:
//
//    Add a default clause.
//    If the switch takes an enum, add a case clause for every possible enum value.
//    Cover all possible types of the switch variable with pattern matching.
//
//    In practice, the first solution is the one most often used.
//    You can try writing case clauses for all possible int values, but we
//    promise it doesn’t work! Even smaller types like byte are not permitted
//    by the compiler, despite there being only 256 possible values.
//    The second solution applies only to switch expressions that take an enum.
//    For example, consider the following:
    enum Season {SPRING, SUMMER, FALL, WINTER}

//    String getWeatherMissingOne(Season value) {
//        return switch (value) {  // DOES NOT COMPILE
//            case WINTER -> "Cold";
//            case SPRING -> "Rainy";
//            case SUMMER -> "Hot";
//        };
//    }

    //    This code does not compile because FALL is not covered.
//    The fix is either to add a case for FALL or add a default clause (or both).
    String getWeatherCoveredAll(Season value) {
        return switch (value) {
            case WINTER -> "Cold";
            case SPRING -> "Rainy";
            case SUMMER -> "Hot";
            case FALL -> "Warm";
            default -> throw new RuntimeException("Unsupported Season");
        };
    }

//    TIP:When writing switch expressions, it may be a good idea to add a default branch,
//    even if you cover all possible values. This means that if someone modifies
//    the enum witha new value, your code will still compile.

}
