package chap6.initializingobjects.page313;
//Why the Hippo Program Printed C After AB

//In the previous example, the Hippo class was initialized before the main() method was executed.
// This happened because our main() method was inside the class being executed, so it had to be loaded on startup. What if you instead called Hippo inside another program?


class Animal {
    static { System.out.print("A"); }
}

class Hippo extends Animal {

    static { System.out.print("B"); }
}

public class
HippoFriend {
    public static void main(String[] grass) {
        System.out.print("C");
        new Hippo();
    }
}


//Assuming the class isn’t referenced anywhere else, this program will likely print CAB,
// with the Hippo class not being loaded until it is needed inside the main() method.
// We say likely because the rules for when classes are loaded are determined by the JVM at runtime.
// For the exam, you just need to know that a class must be initialized before it is referenced or used.
// Also, the class containing the program entry point, aka the main() method,
// is loaded before the main() method is executed.
