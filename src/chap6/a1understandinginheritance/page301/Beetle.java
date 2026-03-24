package chap6.understandinginheritance.page301;

public class Beetle extends Insect {
    protected int numberOfLegs = 6;
    short age = 3;

    public void printData() {
        System.out.println(this.label);
        System.out.println(super.label);
        System.out.println(this.age);
//        System.out.println(super.age); parent class does not have an age
        System.out.println(numberOfLegs);
    }

    public static void main(String[] n) {
        new Beetle().printData();
    }
}

//CLASS DOES NOT COMPILE. COMMENT OUT LINE 11

//That was a trick question—this program code would not compile!
// Let’s review each line of the printData() method.
// Since label is defined in the parent class, it is accessible via both this and super references.
// For this reason, lines 8 and 9 compile and would both print buggy
// if the class compiled.
// On the other hand, the variable age is defined only in the current class, making
// it accessible via this but not super.
// For this reason, line 10 compiles (and would print 3), but line 11 does not.
// Remember, while this includes current and inherited members, super only includes inherited members.
//Last but not least, what would line 12 print if line 4 was commented out?
