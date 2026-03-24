package chap6.creatingclasses.page301;

//Let’s see if you’ve gotten the hang of this and super. What does the following program output?
class Insect {
    protected int numberOfLegs = 4;
    String label = "buggy";
}

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age);
        System.out.println(numberOfLegs);
    }

    public static void main(String[] n) {
        new Beetle().printData();
    }
}

//That was a trick question—this program code would not compile!
// Let’s review each line of the printData() method. Since label is defined in the parent class,
// it is accessible via both this and super references.
// For this reason, lines 10 and 11 compile and would both print buggy if the class compiled.
// On the other hand, the variable age is defined only in the current class, making it
// accessible via this but not super. For this reason, line 12 compiles (and would print 3), but line 13 does not.
// Remember, while this includes current and inherited members, super only includes inherited members.
//Last but not least, what would line 14 print if line 13 was commented out?
// Even though both numberOfLegs variables are accessible in Beetle, Java checks outward, starting with the narrowest scope. For this reason, the value of numberOfLegs in the Beetle class is used, and 6 is printed. In this example, this.numberOfLegs and super.numberOfLegs refer to different variables with distinct values.
//Since this includes inherited members, you often only use super when you have a naming conflict via inheritance.
//
// For example, you have a method or variable defined in the current class that
// matches a method or variable in a parent class.
// This commonly comes up in method overriding and variable hiding, which are discussed later in this chapter.
// Phew, that was a lot! Using this and super can take a little getting used to. Since we use them often in upcoming sections, make sure you understand the last example really well before moving forward.
