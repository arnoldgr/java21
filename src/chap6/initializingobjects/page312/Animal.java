package chap6.initializingobjects.page312;

//In Chapter 1, we covered order of initialization, albeit in a very simplistic manner.
// Order of initialization refers to how members of a class are assigned values.
// They can be given default values, like 0 for an int, or require explicit values, such as for final variables.
// In this section, we go into much more detail about how order of initialization works and how to spot errors on the exam.

//Initializing Classes
//We begin our discussion of order of initialization with class initialization.
// First, we initialize the class, which involves invoking all static members in the class hierarchy,
// starting with the highest superclass and working downward.
// This is sometimes referred to as loading the class.
// The Java Virtual Machine (JVM) controls when the class is initialized,
// although you can assume the class is loaded before it is used.
// The class may be initialized when the program first starts,
// when a static member of the class is referenced, or shortly before an instance of the class is created.
//One of the most important rules with class initialization is that it happens at most once for each class.
// The class may also never be loaded if it is not used in the program.
// We summarize the order of initialization for a class as follows:
//Initialize Class X

//Initialize the superclass of X.
//Process all static variable declarations in the order in which they appear in the class.
//Process all static initializers in the order in which they appear in the class.

//Taking a look at an example, what does the following program print?
public class Animal {
    static { System.out.print("A"); }
}

class Hippo extends Animal {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
        new Hippo();
        new Hippo();
    }
    static { System.out.print("B"); }
}

//It prints ABC exactly once.
// Since the main() method is inside the Hippo class,
// the class will be initialized first, starting with the superclass and printing AB.
// Afterward, the main() method is executed, printing C.
// Even though the main() method creates three instances, the class is loaded only once.
