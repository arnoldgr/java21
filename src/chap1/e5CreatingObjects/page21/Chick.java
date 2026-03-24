//Objects
package chap1.CreatingObjects.page21;

public class Chick {

    //There are two key points to note about the constructor:
    // the name of the constructor matches the name of the class,
    // and there’s no return type. You may see a method like this on the exam:

    public Chick() {
        System.out.println("in constructor");
    }

    public static void main(String[] args) {
    Chick c= new Chick();
    }
}
