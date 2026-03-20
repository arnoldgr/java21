package chap2.WorkingWithBinaryArithmeticOperators;

//Numeric Promotion Rules
public class Page74 {
    public static void main(String[] args) {
//        What is the data type of x * y?
        int x = 1;
        long y = 33;
        var z = x * y;

//        In this case, we follow the first rule.
//        Since one of the values is int and the other is long and since long is larger than int,
//        the int value x is first promoted to a long. The result z is then a long value.

//        What is the data type of x2 + y2?
        double x2 = 39.21;
        //float y2 = 2.1;  //does not compile
       // var z2 = x2 + y2;

//        This is actually a trick question, as the second line does not compile!
//        As you may remember from Chapter 1, floating-point literals are assumed to be double
//        unless postfixed with an f, as in 2.1f. If the value of y2 was set properly to 2.1f,
//        then the promotion would be similar to the previous example, with both operands being
//        promoted to a double, and the result z2 would be a double value.

//        What is the data type of x3 * y3?
        short x3 = 10;
        short y3 = 3;
        var z3 = x3 * y3;  //shorts, byte and char are promoted t o int

//        On the last line, we must apply the third rule: that x3 and y3 will both be promoted to int
//        before the binary multiplication operation, resulting in an output of type int.
//        If you were to try to assign the value to a short variable z without casting,
//        then the code would not compile. Pay close attention to the fact that the resulting output
//        is not a short, as we’ll come back to this example in the upcoming “Assigning Values” section.

//        What is the data type of w * a / t?
        short w = 14;
        float a = 13;
        double t = 30;
        var s = w * a / t;

//        In this case, we must apply all of the rules.
//        First, w will automatically be promoted to int solely because it is a short and is being
//        used in an arithmetic binary operation. The promoted w value will then be automatically
//        promoted to a float so that it can be multiplied with a.
//        The result of w * a will then be automatically promoted to a double so that it can be divided by t,
//        resulting in a double value.


    }
}
