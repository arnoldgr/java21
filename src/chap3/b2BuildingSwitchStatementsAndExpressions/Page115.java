package chap3.BuildingSwitchStatementsAndExpressions;

public class Page115 {
    public static void main(String[] args) {
//        Challenge time! See if you can figure out which of these compiles:

        int food = 5, month = 4, weather = 2, day = 0, time = 4;

//        String meal = switch food { // #1
//            case 1  -> "Dessert"
//            default -> "Porridge"
//        };

//        switch (month) // #2
//        case 4: System.out.print("January");
//
//        switch (weather) { // #3
//            case 2: System.out.print("Rainy");
//            case 5: {
//                System.out.print("Sunny");
//            }
//        }

//        switch (day) { // #4
//            case 1: 13: System.out.print("January");
//            default     System.out.print("July");
//        }
//
//        String description = switch (time) { // #5
//            case 10 -> "Morning";
//            default -> "Late";
//        }

//correction


        String meal = switch (food) { // #1
            case 1 -> "Dessert";
            default -> "Porridge";
        };

        switch (month) {// #2
            case 4:
                System.out.print("January");

                switch (weather) { // #3
                    case 2:
                        System.out.print("Rainy");
                    case 5: {
                        System.out.print("Sunny");
                    }
                }

                switch (day) { // #4
                    case 1, 13:
                        System.out.print("January");
                    default:
                        System.out.print("July");
                }

                String description = switch (time) { // #5
                    case 10 -> "Morning";
                    default -> "Late";
                };

//            A switch statement is not required to contain any case clauses. This is perfectly valid:
                switch (month) {
                }


        }
    }}

