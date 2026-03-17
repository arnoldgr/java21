package chap2.MakingDecisionsWithTheTernaryOperator;

public class Page89 {
    public static void main(String[] args) {
//        It is notable in that it is the only operator that takes three operands.
//        The ternary operator has the following form:
//        booleanExpression ? expression1 : expression2

//        The first operand must be a boolean expression,
//        and the second and third operands can be any expression that returns a value.
//        The ternary operation is really a condensed form of a combined if and else statement that returns a value.
//        For example, consider the following code snippet that calculates the food amount for an owl:
        int owl = 5;
        int food;
        if (owl < 2) {
            food = 3;
        } else {
            food = 4;
        }
        System.out.println(food);  // 4

//        Compare the previous code snippet with the following ternary operator code snippet:

        int food2 = owl < 2 ? 3 : 4;
        System.out.println(food2);  // 4

//        These two code snippets are equivalent.

//        Note that it is often helpful for readability to add parentheses around the expressions
//        in ternary operations, although doing so is certainly not required.
//        It is especially helpful when multiple ternary operators are used together, though.
//        Consider the following two equivalent expressions:
        int food1 = owl < 4 ? owl > 2 ? 3 : 4 : 5;
        int food3 = (owl < 4 ? ((owl > 2) ? 3 : 4) : 5);

//        While they are equivalent, we find the second statement far more readable.
//        That said, it is possible the exam could use multiple ternary operators in a single line.

//        You should know that there is no requirement that second and third expressions in
//        ternary operations have the same data types, although it does come into play when
//        combined with the assignment operator. Compare the two statements following the variable declaration:
        int stripes = 7;

        System.out.print((stripes > 5) ? 21 : "Zebra");//System.out.print() does not care that the expressions are
                                                       // completely different types

//        int animal = (stripes < 9) ? 3 : "Horse";  // DOES NOT COMPILE "Horse" is of the wrong data type and
                                                    //        cannot be assigned to an int

//        As we saw with the conditional operators, a ternary expression can contain an
//        unperformed side effect, as only one of the expressions on the right side will be
//        evaluated at runtime. Let’s illustrate this principle with the following example:
        int sheep = 1;
        int zzz = 1;
        int sleep = zzz<10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz);  // 2,1

//        Notice that since the left-hand boolean expression was true, only sheep was incremented.
//        Contrast the preceding example with the following modification:
        sheep = 1;
        zzz = 1;
        sleep = sheep>=10 ? sheep++ : zzz++;
        System.out.print(sheep + "," + zzz);  // 1,2

//        Now that the left-hand boolean expression evaluates to false, only zzz is incremented.
//        In this manner, we see how the expressions in a ternary operator may not be applied
//        if the particular expression is not used.
//        For the exam, be wary of any question that includes a ternary expression in which
//        a variable is modified in one of the expressions on the right-hand side.


    }
}
