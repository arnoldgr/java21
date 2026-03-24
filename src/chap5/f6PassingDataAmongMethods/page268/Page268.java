package chap5.PassingDataAmongMethods.page268;

public class Page268 {
//    Pass-by-Value vs. Pass-by-Reference
//    Different languages handle parameters in different ways.
//    Pass-by-value is used by many languages, including Java.
//    In this example, the swap() method does not change the original values.
//    It only changes a and b within the method.


    public static void main(String[] args) {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1);   // 1

        System.out.println(original2);   // 2
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
//    The other approach is pass-by-reference.
//    It is used by default in a few languages, such as Perl.
//    We aren’t going to show you Perl code here because you are studying for the Java exam,
//    and we don’t want to confuse you.
//    In a pass-by-reference language, the variables would be swapped and the output would be reversed.
//    To review, Java uses pass-by-value to get data into a method.
//    Assigning a new primitive or reference to a parameter doesn’t change the caller.
//    Calling methods on a reference to an object can affect the caller.
}
