package chap1.f6UnderstandingDataTypes;

//Creating Wrapper Classes
public class Page30 {
    public static void main(String[] args) {

        int primitive = Integer.parseInt("123");
        Integer wrapper = Integer.valueOf("123");


        //The first line converts a String to an int primitive.
        // The second converts a String to an Integer wrapper class.
        // On the numeric wrapper classes, valueOf() throws a NumberFormatException on invalid input.
        // For example:


        //System.out.println(Integer.valueOf("five")); // NumberFormatException

        //On Boolean, the method returns Boolean.TRUE for any value that matches "true" ignoring case, and Boolean.FALSE otherwise. For example:

        System.out.println(Boolean.valueOf("true"));      // true
        System.out.println(Boolean.valueOf("TrUe"));      // true
        System.out.println(Boolean.valueOf("false"));     // false
        System.out.println(Boolean.valueOf("FALSE"));     // false
        System.out.println(Boolean.valueOf("kangaroo"));  // false
        System.out.println(Boolean.valueOf(null));        // false


        //Finally, the numeric integral classes (Byte, Short, Integer, and Long)
        // include an overloaded valueOf(String str, int base) method that takes a base value.
        // As you saw earlier, base 16, or hexadecimal includes the characters 0-9 along with A-Z.
        // The overloaded valueOf() method allows you to pass any of these characters and ignores case.
        // For example:

        System.out.println(Integer.valueOf("5", 16)); // 5
        System.out.println(Integer.valueOf("a", 16)); // 10
        System.out.println(Integer.valueOf("F", 16)); // 15
        //System.out.println(Integer.valueOf("G", 16)); // NumberFormatException

        //This has been known to show up on exams from time to time,
        // so make sure you understand these examples.

        /*All of the numeric classes in Table 1.6 extend the Number class, which means they all come with some useful helper methods: byteValue(), shortValue(), intValue(), longValue(), floatValue(), and doubleValue(). The Boolean and Character wrapper classes include booleanValue() and charValue(), respectively.
          As you probably guessed, these methods return the primitive value of a wrapper instance, in the type requested.
        */

        Double apple = Double.valueOf("200.99");
        System.out.println(apple.byteValue());    // -56
        System.out.println(apple.intValue());     // 200
        System.out.println(apple.doubleValue());  // 200.99

       /* These helper methods do their best to convert values but can result in a loss of precision. In the first example, there is no 200 in byte, so it wraps around to -56. In the second example, the value is truncated, which means all of the numbers after the decimal are dropped. In Chapter 5, we apply autoboxing and unboxing to show how easy Java makes it to work with primitive and wrapper values.
        Some of the wrapper classes contain additional helper methods for working with numbers. You don’t need to memorize these methods; you can assume any you are given are valid. For example, Integer has the following:

        max(int num1, int num2), which returns the largest of the two numbers
        min(int num1, int num2), which returns the smallest of the two numbers
        sum(int num1, int num2), which adds the two numbers
        */
    }
}
