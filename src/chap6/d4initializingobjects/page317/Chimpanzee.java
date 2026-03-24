package chap6.initializingobjects.page317;
//Next, let’s try a simple example with inheritance:
class Primate {
    public Primate() {
        System.out.print("Primate-");
    } }

class Ape extends Primate {
    public Ape(int fur) {
        System.out.print("Ape1-");
    }
    public Ape() {
        System.out.print("Ape2-");
    } }

public class Chimpanzee extends Ape {
    public Chimpanzee() {
        super(2);
        System.out.print("Chimpanzee-");
    }
    public static void main(String[] args) {
        new Chimpanzee();
    } }

//The compiler inserts the super() command as the first statement of both the Primate and Ape constructors.
// The code will execute with the parent constructors called first and yield the following output:
//Primate-Ape1-Chimpanzee-

//Notice that only one of the two Ape() constructors is called.
// You need to start with the call to new Chimpanzee() to determine which constructors will be executed.
// Remember, constructors are executed from the bottom up, but since the first line of every
// constructor is a call to another constructor, the flow ends up with the parent constructor
// executed before the child constructor.

