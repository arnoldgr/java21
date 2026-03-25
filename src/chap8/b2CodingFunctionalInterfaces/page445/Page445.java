package chap8.b2CodingFunctionalInterfaces.page445;

//    Coding Functional Interfaces
//    Earlier in the chapter, we declared the CheckTrait interface, which has exactly one method for implementers to write. Lambdas have a special relationship with such interfaces. In fact, these interfaces have a name. A functional interface is an interface that contains a single abstract method. Your friend Sam can help you remember this because it is officially known as a single abstract method (SAM) rule.

//    Defining a Functional Interface
//    Let’s take a look at an example of a functional interface and a class that implements it:
    @FunctionalInterface
     interface Sprint {
        public void sprint(int speed);
    }

     class Tiger implements Sprint {
        public void sprint(int speed) {
            System.out.println("Animal is sprinting fast! " + speed);
        }
    }

//    In this example, the Sprint interface is a functional interface because
//    it contains exactly one abstract method, and the Tiger class is a valid class that
//    implements the interface.


