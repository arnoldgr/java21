package chap4.CreatingAndManipulatingStrings;

public class Page178 {
    public static void main(String[] args) {
//        Formatting Values
//        There are methods to format String values using formatting flags.
//        Two of the methods take the format string as a parameter, and
//        the other uses an instance for that value.
//        One method takes a Locale, which you learn about in Chapter 11.
//        The method parameters are used to construct a formatted
//        String in a single method call, rather than via a lot of format
//        and concatenation operations. They return a reference to the
//        instance they are called on so that operations can be chained together.

//        The method signatures are as follows:
//        public static String format(String format, Object… args)
//        public static String format(Locale loc, String format, Object… args)
//        public String formatted(Object… args)

//        The following code shows how to use these methods:
        var name = "Kate";
        var orderId = 5;

// All print: Hello Kate, order 5 is ready
        System.out.println("Hello "+name+", order "+orderId+" is ready");
        System.out.println(String.format("Hello %s, order %d is ready",
                name, orderId));
        System.out.println("Hello %s, order %d is ready"
                .formatted(name, orderId));

//        In the format() and formatted() operations, the parameters are inserted and
//        formatted via symbols in the order that they are provided in the vararg
//
//        %s        Applies to any type, commonly String values
//        %d        Applies to integer values like int and long
//        %f        Applies to floating-point values like float and double
//        %n        Inserts a line break using the system-dependent line separator

//        The following example uses all four symbols from Table 4.2:
        name = "James";
        var score = 90.25;
        var total = 100;
        System.out.println("%s:%n   Score: %f out of %d"
                .formatted(name, score, total));

//         Mixing data types may cause exceptions at runtime.
//         For example, the following throws an exception because a
//         floating-point number is used when an integer value is expected:

//        var str = "Food: %f tons".formatted(2.0);  // formats are the same
        var str = "Food: %d tons".formatted(2.0); // IllegalFormatConversionException
        System.out.println(str);

    }
}
