package chap5.DesigningMethods;
//DESIGNING METHODS
public class Page234 {
//    Every interesting Java program we’ve seen has had a main() method.
//    You can write other methods too. For example,
//    you can write a basic method to take a nap

//    METHOD DECLARATION
    public static void main(String[] args) {
        nap(10);
    }

//    This is called a method declaration, which specifies all the information needed to call the method.
//    There are a lot of parts, and we cover each one in more detail.
//    Two of the parts—the method name and parameter list—are called the method signature.
//    The method signature provides instructions for how callers can reference this method.
//    The method signature does not include the return type and access modifiers,
//    which control where the method can be referenced.

//    To call this method, just use the method signature and provide an int value in parentheses:
//    nap(10);

    static public void nap(int i) {
        System.out.println("take a nap " + i + " times");
    }
}
