package chap3.BuildingSwitchStatementsAndExpressions;

public class Page118b {
    public static void main(String[] args) {
//        A break statement terminates the switch statement and returns flow control to the enclosing process. Put simply, it ends the switch statement immediately.
//        While break statements are optional, they tend to be used frequently in switch statements. Without break statements, the code continues to execute the next branch it finds, in order.
//        What do you think the following prints when printSeasonForMonth(2) is called?
printSeasonForMonth(1);
    }

    static void printSeasonForMonth(int month) {
        switch (month) {
            case 1, 2, 3:
                System.out.print("Winter-");
            case 4, 5, 6:
                System.out.print("Spring-");
            default:
                System.out.print("Unknown-");
            case 7, 8, 9:
                System.out.print("Summer-");
            case 10, 11, 12:
                System.out.print("Fall-");
        }
    }
//        It prints everything!
//                Winter-Spring-Unknown-Summer-Fall-
//It matches the first case clause and executes all of the branches in the order they are found, including the default clause

}

