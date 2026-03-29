package chap9.i9WorkingWithGenerics.page539b;


import java.util.List;

class A {
}

class B extends A {
}

class C extends B {
}

public class Page539b {
    public static void main(String[] args) {
    }

    //        Passing Generic Arguments
//        Now on to the methods. Same question: try to figure out why they don’t compile
//        or what they do. We will present the methods one at a time because there is more to think about.
    <T> T first(List<? extends T> list) {
        return list.get(0);
    }

//        The first method, first(), is a perfectly normal use of generics.
//        It uses a method-specific type parameter, T. It takes a parameter of List<T>,
//        or some subclass of T, and it returns a single object of that T type.
//        For example, you could call it with a List<String> parameter and have it return a String. Or you could call it with a List<Number> parameter and have it return a Number. Or—well, you get the idea.
//        Given that, you should be able to see what is wrong with this one:
//<T> <?extends T> second(List<? extends T> list) { // DOES NOT COMPILE
//        return list.get(0);
//    }

//        The next method, second(), does not compile because the return type isn’t actually a type.
//        You are writing the method. You know what type it is supposed to return.
//        You don’t get to specify this as a wildcard.
//        Now be careful—this one is extra tricky:
//    <B extends A> B third(List<B> list) {
//        return new B(); // DOES NOT COMPILE
//    }

//        This method, third(), does not compile. <B extends A> says that you want to use B
//        as a type parameter just for this method and that it needs to extend the A class.
//        Coincidentally, B is also the name of a class. Well, it isn’t a coincidence.
//        It’s an evil trick. Within the scope of the method, B can represent class A, B, or C,
//        because all extend the A class. Since B no longer refers to the B class in the method,
//        you can’t instantiate it.
//        After that, it would be nice to get something straightforward.

    void fourth(List<? super B> list) {
    }

//        We finally get a method, fourth(), that is a normal use of generics.
//        You can pass the type List<B>, List<A>, or List<Object>.
//        Finally, can you figure out why this example does not compile?
//    <X> void fifth(List<X super B> list) {
//    } // DOES NOT COMPILE
//
//        This last method, fifth(), does not compile because it tries to mix a method-specific
//        type parameter with a wildcard.
//        A wildcard must have a ? in it.
//        Phew. You made it through generics. It’s the hardest topic in this chapter
//        (and why we covered it last!).
//        Remember that it’s OK if you need to go over this material a few times to get your head around it.


}
