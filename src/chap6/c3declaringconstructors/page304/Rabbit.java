package chap6.declaringconstructors.page304;

//Every class in Java has a constructor, whether you code one or not.
// If you don’t include any constructors in the class,
// Java will create one for you without any parameters.
// This Java-created constructor is called the default constructor and
// is added any time a class is declared without any constructors.
// We often refer to it as the default no-argument constructor, for clarity. Here’s an example:

public class Rabbit {
    public static void main(String[] args) {
//        new Rabbit();      // Calls the default constructor even when one is not inserted
    }
}

//In the Rabbit class, Java sees that no constructor was coded and creates one.
// The previous class is equivalent to the following, in which the default constructor
// is provided and therefore not inserted by the compiler:



