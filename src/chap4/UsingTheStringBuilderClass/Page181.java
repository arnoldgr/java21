package chap4.UsingTheStringBuilderClass;

public class Page181 {
    public static void main(String[] args) {
//        StringBuilder is not immutable. In fact, we gave it 27 different values in the example
//        (a blank plus adding each letter in the alphabet).
//        The exam will likely try to trick you with respect to StringBuilder being mutable and String being immutable.
//        Chaining makes this even more interesting.
//        When we chained String method calls, the result was a new String with the answer. Chaining StringBuilder methods doesn’t work this way. Instead, the StringBuilder changes its own state and returns a reference to itself. Let’s look at an example to make this clearer:
        StringBuilder sb = new StringBuilder("start");
        sb.append("+middle");                      // sb = "start+middle"
        StringBuilder same = sb.append("+end");    // "start+middle+end"
        System.out.println(sb == same);

//        Line 11 adds text to the end of sb. It also returns a reference to sb, which is ignored.
//        Line 12 also adds text to the end of sb and returns a reference to sb. This time the reference is stored in same. This means sb and same point to the same object and would print out the same value.

//        What do you think this example prints?
        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println(a==b);
    }
}
