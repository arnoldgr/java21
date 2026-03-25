package chap8.c3UsingMethodReferences.page450;

//Calling static Methods
//For this first example, we use a functional interface that converts a double to a long:
interface Converter {
    long round(double num);
}

//We can implement this interface with the round() method in Math. Here we assign a method reference and a lambda to this functional interface:
public class Page450 {
    public static void main(String[] args) {
        Converter methodRef = Math::round;
        Converter lambda = x -> Math.round(x);
        System.out.println(methodRef.round(100.1));
       System.out.println(lambda.round(100.1));
//On line 12, we reference a method with one parameter, and Java knows that it’s like a lambda
// with one parameter. Additionally, Java knows to pass that parameter to the method.
//Wait a minute. You might be aware that the round() method is overloaded—it can take a double or
// a float. How does Java know that we want to call the version with a double? With both
// lambdas and method references, Java infers information from the context.
// In this case, we said that we were declaring a Converter,
// which has a method taking a double parameter.
// Java looks for a method that matches that description. If it can’t find it or finds multiple matches,
// then the compiler will report an error. The latter is sometimes called an ambiguous type error.
    }
}
