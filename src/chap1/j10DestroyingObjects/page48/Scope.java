package chap1.j10DestroyingObjects.page48;

//Look at this code and see whether you can figure out when each object first becomes eligible for garbage collection:
public class Scope {
    public static void main(String[] args) {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
    }
}