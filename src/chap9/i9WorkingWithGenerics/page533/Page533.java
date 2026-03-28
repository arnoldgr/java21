package chap9.i9WorkingWithGenerics.page533;

class Robot {
}


//When you have a method declare a generic parameter type, it is independent of the class generics. Take a look at this class that declares a generic T at both levels:
class TrickyCrate<T> {
    public <T> T tricky(T t) {
        return t;
    }
}

public class Page533 {
    public static void main(String[] args) {
        System.out.println(crateName());
    }

    //See if you can figure out the type of T on lines 8 and 9 when we call the code as follows:
    public static String crateName() {
        TrickyCrate<Robot> crate = new TrickyCrate<>();
        return crate.tricky("bot");
    }
//    Clearly, “T is for tricky.” Let’s see what is happening. On line 8,
//    T is Robot because that is what gets referenced when constructing a Crate.
//    On line 2, T is String because that is what is passed to the method.
//    When you see code like this, take a deep breath and write down what is happening so you don’t get confused.
}



