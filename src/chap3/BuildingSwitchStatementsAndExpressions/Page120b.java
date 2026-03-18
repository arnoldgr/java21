package chap3.BuildingSwitchStatementsAndExpressions;

public class Page120b {
    public static void main(String[] args) {

    }
//    Returning Consistent Data Types
//    Just as case values have to use a consistent data type,
//    the switch expression must return a consistent value.
//    Simply put, when assigning a value as the result of a switch expression,
//    a branch can’t return a value with an unrelated type.

    int measurement = 10;
    int size = switch (measurement) {
      //  case 5  -> Integer.valueOf(1);
        case 10 -> (short)2;
        default -> 3;
    //    case 20 -> "4";   // DOES NOT COMPILE
    //    case 40 -> 5L;    // DOES NOT COMPILE
    //    case 50 -> null;  // DOES NOT COMPILE
    };

//    The switch expression is being assigned to an int variable,
//    so all of the values must be consistent with int. The first
//    case clause compiles without issue, as the Integer value is
//    unboxed to int. We’ll cover autoboxing and unboxing in Chapter 5,
//    “Methods.” The second and third case clauses are fine, as they can
//    be stored as an int. The last three case expressions do not compile
//    because each returns a type that is incompatible with int.

}

