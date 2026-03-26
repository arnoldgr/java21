package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page465;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Page465 {
    public static void main(String[] args) {
//        Working with Variables in Lambdas
//        Now that we’ve learned about functional interfaces, we will use them to show different approaches
//        for variables.
//        They can appear in three places with respect to lambdas: the parameter list,
//        local variables declared inside the lambda body, and variables referenced from
//        the lambda body.
//        All three of these are opportunities for the exam to trick you.
//        We explore each one so you’ll be alert when tricks show up!

//        Listing Parameters
//        Earlier in this chapter, you learned that specifying the type of parameters is optional.
//        Additionally, var can be used in place of the specific type.
//        That means all three of these statements are interchangeable:
        Predicate<String> p = x -> true;
        Predicate<String> p2 = (var x) -> true;
        Predicate<String> p3 = (String x) -> true;
    }

//        The exam might ask you to identify the type of the lambda parameter.
//        In our example, the answer is String. How did we figure that out?
//        A lambda infers the types from the surrounding context. That means you get to do the same.
//        In this case, the lambda is being assigned to a Predicate that takes a String.
//        Another place to look for the type is in a method signature.
//        Let’s try another example. Can you figure out the type of x?
    public void whatAmI() {
        consume((var x) -> System.out.print(x), 123);
    }

    public void consume(Consumer<Integer> c, int num) {
        c.accept(num);
    }

//    If you guessed Integer, you were right. The whatAmI() method creates a lambda
//    to be passed to the consume() method.
//    Since the consume() method expects an Integer as the generic, we know that is what
//    the inferred type of x will be.
//    But wait; there’s more. In some cases, you can determine the type without even
//    seeing the method signature. What do you think the type of x is here?

    public void counts(List<Integer> list) {
        list.sort((var x, var y) -> x.compareTo(y));
    }

//    The answer is again Integer.
//    Since we are sorting a list, we can use the type of the list to determine the type of the lambda parameter.
//    Since lambda parameters are just like method parameters, you can add modifiers to them.
//    Specifically, you can add the final modifier or an annotation, as shown in this example:
    public void counts2(List<Integer> list) {
        list.sort((final var x, @Deprecated var y) -> x.compareTo(y));
    }

//    While this tends to be uncommon in real life, modifiers such as these have been known
//    to appear in passing on the exam.

}

