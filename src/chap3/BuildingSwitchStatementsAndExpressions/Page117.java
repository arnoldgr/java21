package chap3.BuildingSwitchStatementsAndExpressions;

public class Page117 {
    public static void main(String[] args) {
//        Determining Acceptable Case Values
//        Not just any values can be used in a case clause.
//        First, the values in each case clause must be compile-time constant values.
//        This means you can use only literals, enum constants, or final constant variables.
//        By final constant, we mean that the variable must be marked with the final
//        modifier and initialized with a literal value in the same expression in which it is declared.
//        For example, you can’t have a case clause value that requires executing a
//        method at runtime, even if that method always returns the same value.
//        For these reasons, see if you can figure out why only the first and last case clauses compile:
    }

    final int getCookies() {
        return 4;
    }

    void feedAnimals() {
        final int bananas = 1;
        int apples = 2;
        int numberOfAnimals = 3;
        final int cookies = getCookies();
        switch (numberOfAnimals) {
            case bananas:
                //   case apples:        // DOES NOT COMPILE
                //  case getCookies():  // DOES NOT COMPILE
                //   case cookies :      // DOES NOT COMPILE
            case 3 * 5:
        }
//            The bananas variable is marked final, and its value is known at compile time,
//            so the first case clause is valid.
//            The apples variable in the second case clause is not marked final,
//            so it is not permitted. The next two case clauses,
//            with values getCookies() and cookies, do not compile because methods
//            are not evaluated until runtime, so they cannot be used as the value
//            of a case clause, even if one of the values is stored in a final variable.
//            The last case clause, with value 3 * 5, does compile, as expressions
//            are allowed as case values, provided the value can be resolved at compile time.

    }

}
