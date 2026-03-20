package chap3.BuildingSwitchStatementsAndExpressions;


public class Page118 {
    public static void main(String[] args) {
//        Using Enum Values with switch//
//        When the switch variable is an enum type, then the case clauses must be the enum values.
shouldGetACoat(Season.FALL);
    }

    static enum Season {SPRING, SUMMER, FALL, WINTER;}

    static boolean shouldGetACoat(Season s) {
        return switch (s) {
            case SPRING -> false;
            case Season.SUMMER -> false;
            case FALL -> true;
            case Season.WINTER -> true;
        };
//        For an enum value, you can specify just the value, as shown with SPRING and FALL.
//        Starting with Java 21, you can optionally specify the name with the value, such as
//        Season.SPRING and Season.FALL.

    }


    //    Remember, the data type for case clauses must match the data type of the switch variable.
//    See if you can spot why the following does not compile:
    String cleanFishTank(int dirty) {
        return switch (dirty) {
            //  case "Very" -> "1 hour";  // DOES NOT COMPILE
            default -> "45 minute";
        };
    }
}
