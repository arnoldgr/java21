package chap3.CreatingDecisionMakingStatements;

//pattern matching
public class page106 {
    public static void main(String[] args) {
//        Pattern matching is a useful tool for reducing boilerplate code in your application.
//        Boilerplate code is code that tends to be duplicated throughout a section of
//        code over and over again in a similar manner.
//        To understand why this feature was added, consider the following code that takes a
//        Number instance and compares it with the value 5. If you haven’t seen Number or Integer,
//        you just need to know that Integer inherits from Number for now. You’ll see them a lot in this book!
        short number = 5;
        compareIntegers(number); // calling ths method below
        compareIntegers2(number); // calling a shoter method version using pattern matching
    }

    static void compareIntegers(Number number) {
        if (number instanceof Integer) {
            Integer data = (Integer) number;
//  The cast is needed since the compareTo() method is defined on Integer, but not on Number.
//  Code that first checks if a variable is of a particular type and then immediately casts it to that
//  type is extremely common in the Java world.It’s so common that the authors of Java decided to implement a
//  shorter syntax for it:
        }
    }

    static void compareIntegers2(Number number) {
        if (number instanceof Integer data) {
            System.out.print(data.compareTo(5));
        }
//        The variable data in this example is referred to as the pattern variable.
//        Notice that this code also avoids any
//        potential ClassCastException because the cast operation is executed only
//        if the instanceof operator returns
//        true.
    }
}
