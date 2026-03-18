package chap3.WritingWhileLoops;

public class Page130 {
    public static void main(String[] args) {
//        a while loop is similar to an if statement in that it is composed of a
//        boolean expression and a statement, or a block of statements.
//        During execution, the boolean expression is evaluated before each iteration
//        of the loop and exits if the evaluation returns false.
//        Let’s see how a loop can be used to model a mouse eating a meal:
        int bitesOfCheese = 20;
        eatCheese(bitesOfCheese);
    }

    static void eatCheese ( int bitesOfCheese){
        int roomInBelly = 5;
        while (bitesOfCheese > 0 && roomInBelly > 0) {
            bitesOfCheese--;
            roomInBelly--;
        }
        System.out.println(bitesOfCheese + " pieces of cheese left");
    }
//    This method takes an amount of food—in this
//    case , cheese—and continues until the mouse has no room in its belly or there
//    is no food left to eat.With each
//    iteration of the loop, the mouse “eats”one bite of food and loses one spot in its
//    belly.By using a compound
//    boolean statement, you ensure that the while loop can end for either of the conditions.
}
