package chap8.d4WorkingWithBuiltInFunctionalInterfaces.page455.page467;

import java.util.function.Predicate;

public class Page467 {
    static Boolean returnSame(Integer i) {
        return true;
    }
    public static void main(String[] args) {
//        Real World Scenario

//        Keep Your Lambdas Short

//        Having a lambda with multiple lines and a return statement is often a clue that you should
//        refactor and put that code in a method.
//        For example, the previous example could be rewritten as follows:


        Predicate<Integer> p1 = a -> returnSame(a);


//        This simpler form can be further refactored to use a method reference:


        Predicate<Integer> p2 = Page467::returnSame;


//        You might be wondering why this is so important. In Chapter 10, lambdas and method
//        references are used in chained method calls.
//        The shorter the lambda, the easier it is to read the code.

    }
}
