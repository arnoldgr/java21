package chap5.PassingDataAmongMethods.page271;
//Where autoboxing and unboxing really shine is when we apply them to method calls.
public class Chimpanzee {
    public void climb(long t) {}
    public void swing(Integer u) {}
    public void jump(int v) {}
    public static void main(String[] args) {
        var c = new Chimpanzee();
        c.climb(123);
        c.swing(123);
//        c.jump(123L);  // DOES NOT COMPILE
    }
}

//In this example, the call to climb() compiles because the int value can be implicitly cast to a long.
// The call to swing() also is permitted, because the int value is autoboxed to an Integer.
// On the other hand, the call to jump() results in a compiler error because a
// long must be explicitly cast to an int. In other words, Java will not automatically convert to a narrower type.

