package chap5.AccessingStaticData.page260b;

//There’s another way the exam creators will try to trick you regarding static and instance members. A static member cannot call an instance member without referencing an instance of the class. This shouldn’t be a surprise since static doesn’t require any instances of the class to even exist.
//The following is a common mistake for rookie programmers to make:
public class MantaRay {
    static private String name = "Sammy";

    public static void first() {
    }

    public static void second() {
    }

    static public void third() {
        System.out.print(name);
    }

    public static void main(String args[]) {
        first();
        second();
        MantaRay ray = new MantaRay();
//        The second solution would have been to call third() as an instance method and
//        not use static for the method or the variable.
        ray.third();
    }
}

//The compiler will give you an error about making a static reference to an instance method.
// If we fix this by adding static to third()