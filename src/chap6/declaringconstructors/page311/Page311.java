package chap6.declaringconstructors.page311;

public class Page311 {
//    Default Constructor Tips and Tricks
//    We’ve presented a lot of rules so far, and you might have noticed something.
//    Let’s say we have a class that doesn’t include a no-argument constructor.
//    What happens if we define a subclass with no constructors,
//    or a subclass with a constructor that doesn’t include a super() reference?

    public class Mammal {
        public Mammal(int age) {}
    }
//
//    public class Seal extends Mammal {}  // DOES NOT COMPILE
//
//    public class Elephant extends Mammal {
//        public Elephant() {}              // DOES NOT COMPILE
//    }

//    The answer is that neither subclass compiles. Since Mammal defines a constructor,
//    the compiler does not insert a no-argument constructor.
//    The compiler will insert a default no-argument constructor into Seal, though,
//    but it will be a simple implementation that just calls a nonexistent parent default constructor.

//    public class Seal extends Mammal {
//        public Seal() {
//            super();  // DOES NOT COMPILE
//        }
//    }

//    Likewise, Elephant will not compile for similar reasons.
//    The compiler doesn’t see a call to super() or this() as the first line of the constructor so it inserts a call
//    to a nonexistent no-argument super() automatically.

//    public class Elephant extends Mammal {
//        public Elephant() {
//            super();  // DOES NOT COMPILE
//        }
//    }

//    In these cases, the compiler will not help, and you must create at least one constructor in your child class
//    that explicitly calls a parent constructor via the super() command.
    public class Seal extends Mammal {
        public Seal() {
            super(6);  // Explicit call to parent constructor
        }
    }

    public class Elephant extends Mammal {
        public Elephant() {
            super(4);  // Explicit call to parent constructor
        }
    }

//    Subclasses may include no-argument constructors even if their parent classes do not.
//    For example, the following compiles because Elephant includes a no-argument constructor:
    public class AfricanElephant extends Elephant {}

//    It’s a lot to take in, we know. For the exam, you should be able to spot right away why
//    classes such as our first Seal and Elephant implementations did not compile.

//    super() Always Refers to the Most Direct Parent

//    A class may have multiple ancestors via inheritance.
//    In our previous example, AfricanElephant is a subclass of Elephant, which in turn is a subclass of Mammal.
//    For constructors, though, super() always refers to the most direct parent.
//    In this example, calling super() inside the AfricanElephant class always refers to the Elephant class
//    and never to the Mammal class.

//    We conclude this section by adding two constructor rules to your skill set.

//    If a constructor calls super() or this(), then it must be the first line of the constructor.
//    If the constructor does not contain a this() or super() reference,
//    then the compiler automatically inserts super() with no arguments as the first line of the constructor.
//
//    Congratulations, you’ve learned everything we can teach you about declaring constructors.
//    Next, we move on to initialization and discuss how to use constructors.

}
