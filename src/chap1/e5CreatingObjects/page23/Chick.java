package chap1.CreatingObjects.page23;

public class Chick {
    private String name = "Fluffy";

    {
        System.out.println("setting field");
    }

    public Chick() {
        name = "Tiny";
        System.out.println("setting constructor");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}

/*Running this example prints this:

setting field
setting constructor
Tiny

Let’s look at what’s happening here. We start with the main() method because that’s where Java
 starts execution. On line 9, we call the constructor of Chick. Java creates a new object.
 First it initializes name to "Fluffy" on line 2.
 Next it executes the println() statement in the instance initializer on line 3.
 Once all the fields and instance initializers have run, Java returns to the constructor.
 Line 5 changes the value of name to "Tiny", and line 6 prints another statement.
 At this point, the constructor is done, and then the execution goes back to the println() statement
  on line 10.
Order matters for the fields and blocks of code.
You can’t refer to a variable before it has been defined.

 */