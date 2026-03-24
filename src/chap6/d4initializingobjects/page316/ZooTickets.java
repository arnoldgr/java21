package chap6.initializingobjects.page316;

//Initialize Instance of X

//Initialize Class X if it has not been previously initialized.
//Initialize the superclass instance of X.
//Process all instance variable declarations in the order in which they appear in the class.
//Process all instance initializers in the order in which they appear in the class.
//Initialize the constructor, including any overloaded constructors referenced with this().

//Let’s try an example with no inheritance. See if you can figure out what the following application outputs:
public class ZooTickets {
    private String name = "BestZoo";

    {
        System.out.print(name + "-");
    }

    private static int COUNT = 0;

    static {
        System.out.print(COUNT + "-");
    }

    static {
        COUNT += 10;
        System.out.print(COUNT + "-");
    }

    public ZooTickets() {
        System.out.print("z-");
    }

    public static void main(String... patrons) {
        new ZooTickets();
    }
}

//The output is as follows:
//        0-10-BestZoo-z-

//First, we have to initialize the class.
// Since there is no superclass declared, which means the superclass is Object,
// we can start with the static components of ZooTickets.
// In this case, lines 19, 21, and 25 are executed, printing 0- and 10-.
// Next, we initialize the instance created on line 35.
// Again, since no superclass is declared, we start with the instance components.
// Lines 13 and 16 are executed, which prints BestZoo-.
// Finally, we run the constructor on lines 30-32, which outputs z-.
