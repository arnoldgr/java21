package chap6.creatingclasses.page297;

// Lion.java
public class Lion extends Animal {
    protected void setProperties(int age, String n) {
        setAge(age);
        name = n;
    }
    public void roar() {
        System.out.print(name + ", age " + getAge() + ", says: Roar!");
    }
    public static void main(String[] args) {
        var lion = new Lion();
        lion.setProperties(3, "kion");
        lion.roar();
    }
}
//
//There’s a lot going on here, we know!
// The age variable exists in the parent Animal class and is not directly accessible in the Lion child class.
// It is indirectly accessible via the setAge() method.
// The name variable is protected, so it is inherited in the Lion class and directly accessible.
// We create the Lion instance in the main() method and use setProperties() to set instance variables.
// Finally, we call the roar() method, which prints the following:
//kion, age 3, says: Roar!

//Let’s take a look at the members of the Lion class.
// The instance variable age is marked private and is not directly accessible from the subclass Lion.
// Therefore, the following would not compile:
//public class Lion extends Animal {
//    public void roar() {
//        System.out.print("Lion's age: " + age);  // DOES NOT COMPILE
//    }
//}
//
//Remember when working with subclasses that private members are never inherited, and package members are only inherited if the two classes are in the same package. If you need a refresher on access modifiers, it may help to read Chapter 5 again.
