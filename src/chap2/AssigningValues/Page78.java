package chap2.AssigningValues;
//Casting
public class Page78 {
    public static void main(String[] args) {
//        Last but not least, casting can appear anywhere in an expression, not just on the assignment. For example, let’s take a look at a modified form of the previous example:
        short mouse = 10;
        short hamster = 3;
//        short capybara = (short)mouse * hamster;      // DOES NOT COMPILE

//        So, what’s happening on the last line? Well, remember when we said casting was a unary operation?
//        That means the cast in the last line is applied to mouse, and mouse alone.
//        After the cast is complete, both operands are promoted to int since they are used with the
//        binary multiplication operator (*), making the result an int and causing a compiler error.

//        What if we changed the last line to the following?
//        short capybara = 1 + (short)(mouse * hamster);  // DOES NOT COMPILE

//        In the example, casting is performed successfully, but the resulting value is
//        automatically promoted to int because it is used with the binary arithmetic operator (+).

//        Casting Values vs. Variables
//        Revisiting our third numeric promotional rule, the compiler doesn’t require casting when
//        working with literal values that fit into the data type. Consider these examples:

        byte hat = 1;
        byte gloves = 7 * 10;
        short scarf = 5;
        short boots = 2 + 1;

//        All of these statements compile without issue. On the other hand, neither of these statements compiles:
//        short boots = 2 + hat;  // DOES NOT COMPILE
//        byte gloves = 7 * 100;  // DOES NOT COMPILE

//        The first statement does not compile because hat is a variable, not a value,
//        and both operands are automatically promoted to int.
//        When working with values, the compiler had enough information to determine the writer’s intent.
//        When working with variables, though, there is ambiguity about how to proceed,
//        so the compiler reports an error.
//        The second expression does not compile because 700 triggers an overflow for byte, which has a maximum value of
//        127.

    }
}
