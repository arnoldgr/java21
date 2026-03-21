package chap5.AccessingStaticData.page260;

//If we fix this by adding static to third(), we create a new problem. Can you figure out what it is?
//add static to the name variable as well.
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
        third();
    }
}

//The compiler will give you an error about making a static reference to an instance method.
// If we fix this by adding static to third()