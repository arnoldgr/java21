package chap8.c3UsingMethodReferences.page450;

//Calling Instance Methods on a Particular Object
//For this example, our functional interface checks if a String starts with a specified value.
interface StringStart {
    boolean beginningCheck(String prefix);
}

interface StringChecker {
    boolean check();
}

public class Page450b {
    public static void main(String[] args) {
        //Conveniently, the String class has a startsWith() method that takes one parameter and returns a boolean.
        // Let’s look at how to use method references with this code:
        var str = "Zoo";
        StringStart methodRef = str::startsWith;
        StringStart lambda = s -> str.startsWith(s);

        System.out.println(methodRef.beginningCheck("A"));  // false


//Line 19 shows that we want to call str.startsWith() and pass a single parameter to be supplied at runtime.
// This would be a nice way of filtering the data in a list.
//A method reference doesn’t have to take any parameters.
// In this example, we create a functional interface with a method that doesn’t take any parameters
// but returns a value:

//We implement it by checking if the String is empty.
         String str3 = "";
          StringChecker methodRef2 = str::isEmpty;
          StringChecker lambda2 = () -> str.isEmpty();
        System.out.print(methodRef2.check());  // true

//        Since the method on String is an instance method, we call the method reference on an instance of the String
//        class.
//        While all method references can be turned into lambdas, the opposite is not always true.For example, consider
//        this code:
        String str2 = "";
        StringChecker lambda3 = () -> str2.startsWith("Zoo");

//        How might we write this as a method reference?You might try one of the following:
//        StringChecker methodReference = str::startsWith;         // DOES NOT COMPILE

//        StringChecker methodReference2 = str::startsWith ("Zoo");  // DOES NOT COMPILE

//        Neither of these works !While we can pass the str as part of the method reference, there’s no way to pass the
//        "Zoo" parameter with it.Therefore, it is not possible to write this lambda as a method reference.
    }
}

