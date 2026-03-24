package chap6.inheritingmembers.page326;

//Hiding Static Methods
//A static method cannot be overridden because class objects do not inherit from each other in the same way as instance objects. On the other hand, they can be hidden. A hidden method occurs when a child class defines a static method with the same name and signature as an inherited static method defined in a parent class. Method hiding is similar to but not exactly the same as method overriding. The previous four rules for overriding a method must be followed when a method is hidden. In addition, a new fifth rule is added for hiding a method:

//The method defined in the child class must be marked as static if it is marked as static in a parent class.

//Put simply, it is method hiding if the two methods are marked static and method overriding if they are not marked static.
// If one is marked static and the other is not, the class will not compile.
//Let’s review some examples of the new rule:
 class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    } }

 class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda is chewing");
    }
    public static void main(String[] args) {
        eat();
    } }

//In this example, the code compiles and runs. The eat() method in the Panda class
// hides the eat() method in the Bear class, printing "Panda is chewing" at runtime.
// Because they are both marked as static, this is not considered an overridden method.
// That said, there is still some inheritance going on.
// If you remove the eat() declaration in the Panda class, then the program prints
// "Bear is eating" instead.


