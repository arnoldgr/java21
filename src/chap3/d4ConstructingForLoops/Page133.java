package chap3.ConstructingForLoops;

//For Loop
public class Page133 {
    public static void main(String[] args) {
// for (initialization;boolean expression;update statement) {
// body
// }

//1.initialization executes
//2.if boolean expression true continue to body else exit loop
//3.body executes
//4.execute update statement after body executes
//5. return to set 2

//Remember initialization step only executes once at the beginning
//Each of the three sections is separated by a semicolon. In addition,
// the initialization and update sections may contain
// multiple statements, separated by commas.

//Variables declared in the initialization block of a for loop have limited scope and are
// accessible only within the for loop.
// Be wary of any exam questions in which a variable is declared within the initialization
// block of a for loop and then read outside the loop. For example, this code does not compile
// because the loop variable i is referenced outside the loop:
        for (int i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
//        System.out.println(i);  // DOES NOT COMPILE
//
//        Alternatively, variables declared before the for loop and assigned a value in the
//        initialization block may
//        be used outside the for loop because their scope precedes the creation of the for loop.
        int i;
        for (i = 0; i < 10; i++)
            System.out.println("Value is: " + i);
        System.out.println(i);

//        Let’s take a look at an example that prints the first five numbers, starting with zero:
        for (int i2 = 0; i2 < 5; i2++) {
            System.out.print(i2 + " ");
        }
    }
}