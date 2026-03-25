package chap8.c3UsingMethodReferences.page451;

//Calling Instance Methods on a Parameter
//This time, we are going to call the same instance method that doesn’t take any parameters.
// The trick is that we will do so without knowing the instance in advance.
// We need a different functional interface this time since it needs to know about the String.
interface StringParameterChecker {
    boolean check(String text);
}

interface StringTwoParameterChecker {
    boolean check(String text, String prefix);
}

public class Page451 {
    public static void main(String[] args) {
//        We can implement this functional interface as follows:
        StringParameterChecker methodRef = String::isEmpty;
        StringParameterChecker lambda = s -> s.isEmpty();

        System.out.println(methodRef.check("Zoo"));  // false

//        Line 23 says the method that we want to call is declared in String. It looks like a static method,
//        but it isn’t. Instead, Java knows that isEmpty() is an instance method that does not take any parameters.
//        Java uses the parameter supplied at runtime as the instance on which the method is called.
//        Compare lines 23 and 24 with lines 19 and 20 of our instance example.
//        They look similar, although one references a local variable named str,
//        while the other only references the functional interface parameters.
//        You can even combine the two types of instance method references. Again,
//        we need a new functional interface that takes two parameters.

        StringTwoParameterChecker methodRef2 = String::startsWith;
        StringTwoParameterChecker lambda2 = (s, p) -> s.startsWith(p);

        System.out.println(methodRef2.check("Zoo", "A"));  // false

//        Since the functional interface takes two parameters, Java has to figure out what they represent. The first one will always be the instance of the object for instance methods. Any others are to be method parameters.
//                Remember that line 26 may look like a static method, but it is really a method reference declaring that the instance of the object will be specified later. Line 27 shows some of the power of a method reference. We were able to replace two lambda parameters this time.
//
    }
}



