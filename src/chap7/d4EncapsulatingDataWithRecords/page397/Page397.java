package chap7.d4EncapsulatingDataWithRecords.page397;

import java.util.ArrayList;
import java.util.List;

record Bear(String name, List<String> favoriteThings) {
}

record Couple(Bear a, Bear b) {
}

public class Page397 {
    public static void main(String[] args) {
//        Matching Records with var and Generics
//        You can also use var in a pattern matching record. Let’s apply this to our previous examples.
        var c = new Couple(new Bear("Yogi", List.of("PicnicBaskets")),
                new Bear("Fozzie", List.of("BadJokes")));

        if (c instanceof Couple(var a, var b)) {
            System.out.print(a.name() + " " + b.name());
        }
        if (c instanceof Couple(Bear(var firstName, List<String> f), var b)) {
            System.out.print(firstName + " " + b.name());
        }

//        As you can see, you can replace any element reference type with var.
//        When var is used for one of the elements of the record, the compiler
//        assumes the type to be the exact match for the type in the record.
//        Pattern matching generics within records follow the similar rules for overloading generic methods.
//        Don’t worry if you haven’t seen overloading generics before, we’ll be covering it in Chapter 9,
//        “Collections and Generics.” Let’s try a few examples, though,
//        to see the kinds of things that exam might throw at you. Each of the following compiles without issue:

        if (c instanceof Couple(Bear(var n, Object f), var b)) {
        }
        if (c instanceof Couple(Bear(var n, List f), var b)) {
        }
        if (c instanceof Couple(Bear(var n, List<?> f), var b)) {
        }
        if (c instanceof Couple(Bear(var n, List<? extends Object> f), var b)) {
        }
        if (c instanceof Couple(Bear(var n, ArrayList<String> f), var b)) {
        }

//        There are limits, though. For example, the following two examples do not compile:
//        if (c instanceof Couple(Bear(var n, List<> f), var b)) {
//        }
//        if (c instanceof Couple(Bear(var n, List<Object> f), var b)) {
//        }

//        The first example does not compile because the diamond operator (<>) cannot be used for
//        pattern matching (nor overloading generics). The second example does not compile because
//        List<Object> is not compatible with List<String>. This would also not compile if these
//        types were applied to method parameters of inherited methods, due to type erasure.
//        Again, we’ll be covering generics and type erasure in much more detail in Chapter 9.
//        In these examples, remember that f is the pattern type, not the original List<String>.
//        Given this, can you deduce why this code does not compile?
//        if (c instanceof Couple(Bear(var n, List f), var b)
//                && f.getFirst().toLowerCase().contains("p")) {  // DOES NOT COMPILE
//            System.out.print("Yummy");
//        }

//        The reference type of f is List, not List<String>, therefore f.getFirst() returns
//        an Object reference, not a String reference. Since toLowerCase() is not defined on Object,
//        the code does not compile. To compile you would either have to explicitly cast it to a String
//        or use a different pattern matching type.
    }
}
