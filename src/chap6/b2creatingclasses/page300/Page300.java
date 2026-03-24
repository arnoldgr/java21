package chap6.creatingclasses.page300;

//Calling the super Reference
//In Java, a variable or method can be defined in both a parent class and a child class.
//This means the object instance actually holds two copies of the same variable with the same underlying name.
// When this happens, how do we reference the version in the parent class instead of the current class?
// Let’s take a look at this example:
// Reptile.java
class Reptile {
    protected int speed = 10;
}

// Crocodile.java
class Crocodile extends Reptile {
    protected int speed = 20;

    public int getSpeed() {
        return speed;
    }

    public static void main(String[] data) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());  // 20
    }
}

//One of the most important things to remember about this code is that an instance of Crocodile stores two
// separate values for speed: one at the Reptile level and one at the Crocodile level.


//Declaring a variable with the same name as an inherited variable is referred to as hiding a variable and
// is discussed later in this chapter.

//But what if we want the program to print the value in the Reptile class? Within the Crocodile class, we can access the parent value of speed instead, by using the super reference or keyword. The super reference is similar to the this reference, except that it excludes any members found in the current class. In other words, the member must be accessible via inheritance.
//public int getSpeed() {
//    return super.speed;  // Causes the program to now print 10
//}


