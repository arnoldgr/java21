package chap5.WorkingWithVarargs.page246;


//Working with Varargs
//As mentioned in Chapter 4, a method may use a varargs parameter (variable argument)
// as if it is an array. Creating a method with a varargs parameter is a bit more complicated.
// In fact, calling such a method may not use an array at all.
//
//Creating Methods with Varargs
//There are a number of important rules for creating a method with a varargs parameter.
//Rules for Creating a Method with a Varargs Parameter
//
//    1.A method can have at most one varargs parameter.
//    2.If a method contains a varargs parameter, it must be the last parameter in the list.
//
//Given these rules, can you identify why each of these does or doesn’t compile?
// (Yes, there is a lot of practice in this chapter.
// You have to be really good at identifying valid and invalid methods for the exam.)

public class VisitAttractions {
    public static void main(String[] args) {
        walk1(1, 2, 3);
        walk2(10,2,3,4,4,5,6,7);
    }

    static public void walk1(int... steps) {

            }

    static public void walk2(int start, int... steps) {
        System.out.println(start + "start");

    }
//    public void walk3(int… steps, int start) {}     // DOES NOT COMPILE
//    public void walk4(int… start, int… steps) {}  // DOES NOT COMPILE
//    The walk1() method is a valid declaration with one varargs parameter.
//    The walk2() method is a valid declaration with one int parameter and one varargs parameter.
//    The walk3() and walk4() methods do not compile because they have a varargs parameter
//    in a position that is not the last one.
}