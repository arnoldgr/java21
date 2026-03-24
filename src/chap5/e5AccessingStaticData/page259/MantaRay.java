package chap5.e5AccessingStaticData.page259;

//The compiler will give you an error about making a static reference to an instance method.
public class MantaRay {
    private String name = "Sammy";
    public static void first() {  }
    public static void second() {  }
    public void third() {  System.out.print(name); }

    public static void main(String args[]) {
        first();
        second();
//        third();  // compile error

    }
}

//The compiler will give you an error about making a static reference to an instance method.
