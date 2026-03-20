package chap3.BuildingSwitchStatementsAndExpressions;

public class Page126 {
    public static void main(String[] args) {

    }
//    Ordering switch Branches
//    As we mentioned earlier in the chapter, the order of case and default clauses for switch
//    statement matters, because more than one branch might be reached during execution.
//    For switch expressions that don’t use pattern matching, ordering isn’t important,
//    as only one branch can be reached.
//    Well, when working with pattern matching, the order matters regardless of the type of switch!
//    For example, consider this new version of printDetails() in which the order has been changed:
    void printDetails(Number height) {
        String message = switch (height) {
            case Number n  -> "Unknown: " + n;
         //   case Integer i -> "Rounded: " + i;  //unreachable code
         //   case Double d  -> "Precise: " + d;  //unreachable code
        };
        System.out.print(message);
    }

//    The code no longer compiles as the second and third case clauses are considered dominated
//    by the preceding case Number statement. To put it another way, it is impossible for
//    any process to reach these two case clauses. This is also referred to as unreachable code,
//    which we cover more later in this chapter. In most cases, when the compiler detects
//    unreachable code, it results in a compiler error.


//    Ordering branches is also important if a when clause is used. For example, what ifa when clause is used. For example, what if we reordered the first two branches of our getTrainer() method?
//String getTrainer(Number animal) {
//   return switch (animal) {
//      case Integer i             -> "Daniel";
//      case Integer i when i > 10 -> "Joseph"; // DOES NOT COMPILE
//      …
//   };
//}
//
//In the event that animal is an Integer, Daniel will always be selected. Poor Joseph! Likewise,
// the compiler does not allow this code to compile.

}
