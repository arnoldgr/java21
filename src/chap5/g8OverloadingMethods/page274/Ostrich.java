package chap5.g8OverloadingMethods.page274;

//Primitives
//Primitives work in a way that’s similar to reference variables.
//Java tries to find the most specific matching overloaded method.
// What do you think happens here?
public class Ostrich {
    public void fly(int i) {
        System.out.print("int");
    }
    public void fly(long l) {
        System.out.print("long");
    }
    public static void main(String[] args) {
        var p = new Ostrich();
        p.fly(123);
        System.out.print("-");
        p.fly(123L);
    }
}
//The answer is int-long.
// The first call passes an int and sees an exact match.
// The second call passes a long and also sees an exact match.
// If we comment out the overloaded method with the int parameter list,
// the output becomes long-long. Java has no problem calling a larger primitive.
// However, it will not do so unless a better match is not found.
