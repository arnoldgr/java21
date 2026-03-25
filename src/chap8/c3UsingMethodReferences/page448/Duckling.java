package chap8.c3UsingMethodReferences.page448;

//Using Method References
//Method references are another way to make the code easier to read, such as simply mentioning the name of the method. Like lambdas, it takes time to get used to the new syntax. In this section, we show the syntax along with the four types of method references. We also mix in lambdas with method references.
//Suppose we are coding a duckling that is trying to learn how to quack. First we have a functional interface:
interface LearnToSpeak {
    void speak(String sound);
}

  class DuckHelper {
    public static void teacher(String name, LearnToSpeak learner) {
        // Exercise patience (omitted)
        learner.speak(name);
    }
}

//Finally, it is time to put it all together and meet our little Duckling. This code implements the functional interface using a lambda:
public class Duckling {
    public static void makeSound(String sound) {
        LearnToSpeak learner = s -> System.out.println(s);
        DuckHelper.teacher(sound, learner);
    }

    public static void main(String[] args) {
        makeSound("swish!");

    }
}

//Not bad. There’s a bit of redundancy, though. The lambda declares one parameter named s. However, it does nothing other than pass that parameter to another method. A method reference lets us remove that redundancy and instead write this:
//LearnToSpeak learner = System.out::println;

//The :: operator tells Java to call the println() method later. It will take a little while to get used to the syntax. Once you do, you may find your code is shorter and less distracting without writing as many lambdas.




//Remember that :: is like a lambda, and it is used for deferred execution with a functional interface. You can even imagine the method reference as a lambda if it helps you.




//A method reference and a lambda behave the same way at runtime. You can pretend the compiler turns your method references into lambdas for you.
//There are four formats for method references.

//static methods
//Instance methods on a particular object
//Instance methods on a parameter to be determined at runtime
//Constructors

//Let’s take a brief look at each of these in turn. In each example, we show the method reference and its lambda equivalent. For now, we create a separate functional interface for each example. In the next section, we introduce built-in functional interfaces so you don’t have to keep writing your own.

