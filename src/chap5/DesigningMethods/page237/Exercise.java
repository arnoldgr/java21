package chap5.DesigningMethods.page237;


public class Exercise {
    //            Do see why these do not compile?
    public void bike1() {
    }

    public final void bike2() {
    }

    public static final void bike3() {
    }

    public final static void bike4() {
    }

//  public modifier void bike5() {}       // DOES NOT COMPILE
//  public void final bike6() {}          // DOES NOT COMPILE
    final public void bike7() {
    }


//        The bike1() method is a valid declaration with no optional specifier.
//        This is OK—it is optional, after all.
//        The bike2() method is a valid declaration, with final as the optional specifier.
//        The bike3() and bike4() methods are valid declarations with both final and static as optional specifiers.
//        The order of these two keywords doesn’t matter.
//        The bike5() method doesn’t compile because modifier is not a valid optional specifier.
//        The bike6() method doesn’t compile because the optional specifier is after the return type.
//        The bike7() method does compile. Java allows the optional specifiers to appear before the access modifier.
//        This is a weird case and not one you need to know for the exam.
//        We are mentioning it so you don’t get confused when practicing.
}


