package chap3.BuildingSwitchStatementsAndExpressions;
//switch expression
public class Page114 {
    public static void main(String[] args) {
//        Unlike a switch statement, a switch expression often requires a semicolon (;) after it, such as when it is used with the assignment operator (=) or a return statement. This has more to do with how the switch expression is used than the switch expression itself.
//        A switch expression also requires a semicolon (;) after each case expression that doesn’t use a block. For example, how many semicolons are missing in the following?
        int bear = 30;
//        var result = switch (bear) {
//            case 30 -> "Grizzly"
//            default -> "Panda"
//        }

//        The answer is three.Each case or default expression requires a semicolon
//        as well as the assignment itself.The following fixes the code:
        var result = switch (bear) {
            case 30 -> "Grizzly";
            default -> "Panda";
        };
    }
}
