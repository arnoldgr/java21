package chap3.BuildingSwitchStatementsAndExpressions;

public class Page120 {
    public static void main(String[] args) {
        printWeather(2);
    }

//    When Is a switch Expression Not a switch Expression?
//
//    As stated earlier, a switch expression always returns a value, regardless of the syntax used.
//    What about the following?

   static void printWeather(int rain) {
        switch (rain) {
            case 0 -> System.out.print("Dry");
            case 1 -> System.out.print("Wet");
            case 2 -> System.out.print("Storm");
        }
    }


//    Since the return type of System.out.print() is void, this statement does not return a value.
//    This is actually a switch statement that uses the arrow operator syntax.
//    Since it doesn’t return a value, it is not a switch expression.
//    It’s a little confusing, we know!

}
