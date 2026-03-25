package chap8.b2CodingFunctionalInterfaces.page447;

//Adding Object Methods
//All classes inherit certain methods from Object. For the exam, you should know the following Object method signatures:

//public String toString()
//public boolean equals(Object)
//public int hashCode()

//We bring this up now because there is one exception to the single abstract method rule that you
// should be familiar with. If a functional interface includes an abstract method with the
// same signature as a public method found in Object, those methods do not count toward the
// single abstract method test.
// The motivation behind this rule is that any class that implements the interface will inherit from Object, as all classes do, and therefore always implement these methods.

//Since Java assumes all classes extend from Object, you also cannot declare an interface method that is
// incompatible with Object.
// For example, declaring an abstract method int toString() in an interface would not compile since
// Object’s version of the method returns a String.

//Let’s take a look at an example. Is the Soar class a functional interface?
interface Soar {
    abstract String toString();
}

//It is not. Since toString() is a public method implemented in Object,
// it does not count toward the single abstract method test. On the other hand,
// the following implementation of Dive is a functional interface:


interface Dive {
    String toString();
    public boolean equals(Object o);
    public abstract int hashCode();
    public void dive();
}

//The dive() method is the single abstract method, while the others are not counted
// since they are public methods defined in the Object class.

//Be wary of examples that resemble methods in the Object class but are not actually defined
// in the Object class. Do you see why the following is not a valid functional interface?

interface Hibernate {
    String toString();
    public boolean equals(Hibernate o);
    public abstract int hashCode();
    public void rest();
}

//Despite looking a lot like our Dive interface,
// the Hibernate interface uses equals(Hibernate) instead of equals(Object).
// Because this does not match the method signature of the equals(Object) method defined in the Object class,
// this interface is counted as containing two abstract methods: equals(Hibernate) and rest().

