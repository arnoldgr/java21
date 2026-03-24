package chap5.c3WorkingWithVarargs.page247;

public class Page247 {
    public static void main(String[] args) {

//    When calling a method with a varargs parameter, you have a choice.
//    You can pass in an array, or you can list the elements of the
//    array and let Java create it for you.
//    Given our previous walk1() method, which takes a varargs parameter, we can call it one of two ways:
        // Pass an array
        int[] data = {1, 2, 3};
        walk1(data);
        // Pass a list of values
        walk1(1, 2, 3);
//        You can even omit the varargs values in the method call, and Java will create an array of length zero for you.
        walk1();

//        Accessing Elements of a Vararg
//        Accessing a varargs parameter is just like accessing an array.
//        It uses array indexing. Here’s an example:
            run(11, 77);     // 77


//        Line 24 calls a varargs method with two parameters.
//        When the method is called, it sees an array of size 2.
//        Since indexes are zero-based, 77 is printed.

    }

    //    Regardless of which one you use to call the method, the method will receive an array containing the elements. We can reinforce this with the following example:
    static public void walk1(int... steps) {
        int[] step2 = steps;     // Not necessary, but shows steps is of type int[]
        System.out.println(step2.length);
    }

//        Accessing Elements of a Vararg
//        Accessing a varargs parameter is just like accessing an array.
//        It uses array indexing. Here’s an example:
    public static void run ( int... steps){
        System.out.print(steps[1]);
    }

}