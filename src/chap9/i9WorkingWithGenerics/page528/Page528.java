package chap9.i9WorkingWithGenerics.page528;

//
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

//



class Elephant {
    static String name = "Elephant";

    @Override
    public String toString() {
        return "Elephant";
    }
}

class Zebra {
}

class Robot {
}

//Generic classes aren’t limited to having a single type parameter. This class shows two generic parameters.
class SizeLimitedCrate<T, U> {
    private T contents;
    private U sizeLimit;

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}

public class Page528 {
    public static void main() {

//        T represents the type that we are putting in the crate.U represents the unit that we are using to measure
//        the maximum size for the crate.To use this generic class,we can write the following:
        Elephant elephant = new Elephant();
        Integer numPounds = 15_000;
        SizeLimitedCrate<Elephant, Integer> c1
                = new SizeLimitedCrate<>(elephant, numPounds);

//        Here we specify that the type is Elephant, and the unit is Integer.We also throw in a reminder that numeric
//        literals can contain underscores.


//        Understanding Type Erasure
//        Specifying a generic type allows the compiler to enforce proper use of the generic type.For example, specifying
//        the generic type of Crate as Robot is like replacing the T in the Crate class with Robot.However, this is just
//        for compile time.
//        Behind the scenes, the compiler replaces all references to T in Crate with Object.In other words, after the code
//        compiles, your generics are just Object types.The Crate class looks like the following at runtime:
//        public class Crate {
//            private Object contents;
//
//            public Object lookInCrate() {
//                return contents;
//            }
//
//            public void packCrate(Object contents) {
//                this.contents = contents;
//            }
//        }
//
//        This means there is only one class file.There aren’t different copies for different parameterized types. (Some
//        other languages work that way.)This process of removing the generics syntax from your code is referred to as
//        type erasure.Type erasure allows your code to be compatible with older versions of Java that do not contain
//        generics.

//        crate.packCrate(new Robot());
//        The compiler adds the relevant casts for your code to work with this type of erased class.
//        For example, you type the following:
//      Robot r = crate.lookInCrate();

//        The compiler turns it into the following:
//        Robot r = (Robot) crate.lookInCrate();
    }
}