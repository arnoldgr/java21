package chap9.i9WorkingWithGenerics.page532;

//Writing Generic Methods
//Up until this point, you’ve seen formal type parameters declared on the class or interface level.
// It is also possible to declare them on the method level. This is often useful for static methods since
// they aren’t part of an instance that can declare the type. However, it is also allowed on non-static methods.
// In this example, both methods use a generic parameter:

class Handler {
    public static <T> void prepare(T t) {
        System.out.println("Preparing " + t);
    }

    public static <T> Crate<T> ship(T t) {
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }
}

//The method parameter is the generic type T. Before the return type, we declare the formal type parameter of <T>.
// In the ship() method, we show how you can use the generic parameter in the return type,
// Crate<T>, for the method.
//Unless a method is obtaining the generic formal type parameter from the class/interface,
// it is specified immediately before the return type of the method. This can lead to some interesting-looking code!
class More {
    public static <T> void sink(T t) {
    }

    public static <T> T identity(T t) {
        return t;
    }

//    public static T noGood(T t) {
//        return t;
//    } // DOES NOT COMPILE
}

//Line 3 shows the formal parameter type immediately before the return type of void.

// Line 4 shows the return type being the formal parameter type. It looks weird, but it is correct.
//
// Line 5 omits the formal parameter type and therefore does not compile.

//Real World Scenario

//Optional Syntax for Invoking a Generic Method

//You can call a generic method normally, and the compiler will try to figure out which one you want. Alternatively, you can specify the type explicitly to make it obvious what the type is.
//
//Box.<String>ship("package");
//Box.<String[]>ship(args);


//It is up to you whether this makes things clearer. You should at least be aware that this syntax exists.
class Crate<T> {
    private T contents;

    public T lookInCrate() {
        return contents;
    }

    public void packCrate(T contents) {
        this.contents = contents;
        System.out.println(contents);
    }
}