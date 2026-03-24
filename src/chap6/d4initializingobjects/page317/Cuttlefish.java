package chap6.initializingobjects.page317;

//The next example is a little harder. What do you think happens here?
public class Cuttlefish {
    private String name = "swimmy";

    {
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {
        System.out.println(COUNT);
    }

    {
        COUNT++; System.out.println(COUNT);
    }

    public Cuttlefish() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Ready");
        new Cuttlefish();
    }
}


//The output looks like this:
//0
//Ready
//swimmy
//1
//Constructor

//No superclass is declared, so we can skip any steps that relate to inheritance.
// We first process the static variables and static initializers—lines 11 and 14, with line 14 printing 0.
// Now that the static initializers are out of the way, the main() method can run, which prints Ready.
// Next we create an instance declared on line 28. Lines 5, 8, and 18 are processed,
// with line 8 printing swimmy and line 6 printing 1.
// Finally, the constructor is run on lines 21–23, which prints Constructor.
