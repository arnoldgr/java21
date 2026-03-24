package chap7.a1ImplementingInterfaces;

//Reusing Code with private Interface Methods
//The last two types of concrete methods that can be added to interfaces are private and private
// static interface methods. Because both types of methods are private,
// they can only be used in the interface declaration in which they are declared.
// For this reason, they were added primarily to reduce code duplication.
// For example, consider the following code sample:
interface Schedule {
    default void wakeUp()        { checkTime(7);  }
    private static void haveBreakfast() { checkTime(9);  }
    static void workOut()        { checkTime(18); }
    private static void checkTime(int hour) {
        if (hour > 17) {

            System.out.println("You’re late!");
        } else {
            System.out.println("You have "+(17-hour)+" hours left "
                    + "to make the appointment");
        }
    }
}

//You could write this interface without using a private method by copying the contents of the checkTime()
// method into the places it is used. It’s a lot shorter and easier to read if you don’t!
// Since the authors of Java were nice enough to add this feature for our convenience,
// we might as well use it!

//We could have also declared checkTime() as public in the previous example,
// but this would expose the method to use outside the interface.
// One important tenet of encapsulation is to not expose the internal workings of a
// class or interface when not required. We cover encapsulation later in this chapter.

//The difference between a non-static private method and a static one is
// analogous to the difference between an instance and static method declared within a class.
// In particular, it’s all about what methods each can be called from.