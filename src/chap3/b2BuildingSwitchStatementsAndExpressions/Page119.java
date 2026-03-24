package chap3.BuildingSwitchStatementsAndExpressions;

public class Page119 {
    public static void main(String[] args) {
        printSeasonForMonth(5);
    }

    //    Contrast this with a switch expression that matches only a single branch at runtime and therefore does not require break statements.
    static void printSeasonForMonth(int month) {
        String value = switch (month) {
            case 1, 2, 3 -> "Winter-";
            case 4, 5, 6 -> "Spring-";
            default -> "Unknown-";
            case 7, 8, 9 -> "Summer-";
            case 10, 11, 12 -> "Fall-";
        };
        System.out.print(value);
    }


}
