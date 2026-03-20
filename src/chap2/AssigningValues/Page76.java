package chap2.AssigningValues;

//CASTING VALUES
public class Page76 {
    public static void main(String[] args) {
        int fur = (int) 5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short) (4 + 10);
       // long feathers = 10 ( long);  // DOES NOT COMPILE , THE CAST TYPE MUST BE ON THE LEFT SIDE OF THE VALUE BEING CAST

//        See if you can figure out why none of the following lines of code compiles:
//        float egg = 2.0 / 9;        // DOES NOT COMPILE
//        int tadpole = (int)5 * 2L;  // DOES NOT COMPILE
//        short frog = 3 - 2.0;       // DOES NOT COMPILE

//        Reviewing Primitive Assignments
//        See if you can figure out why each of the following lines does not compile:
//        int fish = 1.0;        // DOES NOT COMPILE
//        short bird = 1921222;  // DOES NOT COMPILE
//        int mammal = 9f;       // DOES NOT COMPILE
//        long reptile = 192_301_398_193_810_323;  // DOES NOT COMPILE
//
//        The first statement does not compile because you are trying to assign a double 1.0 to an integer value.
//        Even though the value is a mathematic integer, by adding .0, you’re instructing the compiler to treat
//        it as a double.
//        The second statement does not compile because the literal value 1921222 is outside the range of short,
//        and the compiler detects this. The third statement does not compile because the f added to the end of
//        the number instructs the compiler to treat the number as a floating-point value,
//        but the assignment is to an int.
//        Finally, the last statement does not compile because Java interprets the literal as an int
//        and notices that the value is larger than int allows. The literal would need a postfix L or l
//        to be considered a long.

    }
}
//SUMMARY
//        Casting is a unary operation where one data type is explicitly interpreted as another data type.
//        Casting is optional and unnecessary when converting to a larger or widening data type,
//        but it is required when converting to a smaller or narrowing data type.
//        Without casting, the compiler will generate an error when trying to put a larger data type inside a smaller one.
//        Casting is performed by placing the data type, enclosed in parentheses,
//        to the left of the value you want to cast. Here are some examples of casting:
