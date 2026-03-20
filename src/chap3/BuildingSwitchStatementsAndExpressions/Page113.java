package chap3.BuildingSwitchStatementsAndExpressions;

public class Page113 {
    public static void main(String[] args) {
//        First off, both types start with a switch keyword and a variable wrapped in parentheses.
//        String name = "123";
        String name = "1234";
        switch (name) {                    // Switch statement
            case "Sancha":
                System.out.print(1);
                break;
            case "Jacob", "Jake":
                System.out.print(2);
                break;
            default:
                System.out.print(999);
                break;
        }


        System.out.println(switch (name) { // Switch expression
            case "Sancha" -> 1;
            case "Jacob", "Jake" -> 2;
            default -> 999;
        });

//        As you can see, both types of switch support zero or more
//        case clauses.Each case clause includes
//        a set of matching values split up by commas(, ).
//        It is then followed by a separator, which can be a colon (:)
//        or the arrow operator (->).
//        Finally, each clause then defines an expression, or code block with braces ({}),for
//        what to execute when there’s a match.

//        Using the Arrow Operator with switch Statements
//        While switch statements support both colons and arrow operators,
//        you’re likely to see them used with colons more often in practice.
//        This is because the colon syntax has been around a lot longer in Java.
//        If you do use the arrow operator, then you must use it for all clauses.
//        For example, the following switch statement does not compile:
        int type = 2;
        switch (type) {
            case 0:
                System.out.print("Lion");
            //    case 1 -> System.out.print("Elephant");
        }
//        This would compile if both clauses used the same operator.
    }
}