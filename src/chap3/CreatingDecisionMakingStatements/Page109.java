package chap3.CreatingDecisionMakingStatements;

import java.util.Random;

//flow scoping
public class Page109 {
    public static void main(String[] args) {
        Number number = new Random().nextInt();
        Number number2 = Integer.valueOf(new Random().nextInt());
       printIntegersOrNumbersGreaterThan5(number);
       printIntegerTwice(number);
       printOnlyIntegers(number);

//        The compiler applies flow scoping when working with pattern matching. Flow scoping means the variable is only in scope when the compiler can definitively determine its type. Flow scoping is unlike any other type of scoping, in that it is not strictly hierarchical. It is determined by the compiler based on the branching and flow of the program.
//        Given this information, can you see why the following does not compile?

    }

    static void printIntegersOrNumbersGreaterThan5(Number number) {
//        if (number instanceof Integer data || data.compareTo(5) > 0)
//            System.out.println(data);
    }

 //    The key thing to notice is that we used OR (||) not AND (&&) in the conditional statement.
//    If the input does not inherit Integer, the data variable is undefined. Since the compiler
//    cannot guarantee that data is an instance of Integer, the code does not compile.
//    What about this example?

    static void printIntegerTwice(Number number) {
        if (number instanceof Integer data)
            System.out.println(data.intValue());
//        System.out.print(data.intValue());  // DOES NOT COMPILE
    }
//    Since the input might not have inherited Integer, data is no longer in scope after
//    the if statement. Oh, so you might be thinking that the pattern variable
//    is then only in scope inside the if statement block, right?
//    Well, not exactly!

//    Consider the following example that does compile:
   static void printOnlyIntegers(Number number) {
        if (!(number instanceof Integer data))
            return;
        System.out.println(data.intValue());
    }

//    It might surprise you to learn this code does compile. Eek!
//    What is going on here? The method returns if the input does not inherit Integer.
//    This means that when the last line of the method is reached, the input must inherit Integer,
//    and therefore data stays in scope even after the if statement ends. Understanding why
//    this example compiles and the one before it does not, is the key to understanding flow scoping.




}
