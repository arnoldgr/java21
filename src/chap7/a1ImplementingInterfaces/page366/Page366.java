package chap7.a1ImplementingInterfaces.page366;

//Inserting Implicit Modifiers
//As mentioned earlier, an implicit modifier is one that the compiler will automatically insert.
// It’s reminiscent of the compiler inserting a default no-argument constructor
// if you do not define a constructor, which you learned about in Chapter 6.
// You can choose to insert these implicit modifiers yourself or let the compiler insert them for you.
//The following list includes the implicit modifiers for interfaces that you need to know for the exam:

//Interfaces are implicitly abstract.
//Interface variables are implicitly public, static, and final.
//Interface methods without a body are implicitly abstract.
//Interface methods without the private modifier are implicitly public.

//The last rule applies to abstract, default, and static interface methods, which we cover in the next section.
//Let’s take a look at an example.
// The following two interface definitions are equivalent, as the compiler will convert them both
// to the second declaration:
 interface Soar {
    int MAX_HEIGHT = 10;
    final static boolean UNDERWATER = true;

    void fly(int speed);

    abstract void takeoff();

    public abstract double dive();
}

 abstract interface Soar2 {
     public static final int MAX_HEIGHT = 10;
     public final static boolean UNDERWATER = true;

     public abstract void fly(int speed);

     public abstract void takeoff();

     public abstract double dive();
 }
//
//Conflicting Modifiers
//What happens if a developer marks a method or variable with a modifier that conflicts with an
// implicit modifier? For example, if an abstract method is implicitly public,
// can it be explicitly marked protected or private?
//     public interface Dance {
//         private int count = 4;  // DOES NOT COMPILE
//        protected void step();  // DOES NOT COMPILE
//     }

//     Neither of these interface member declarations compiles, as the compiler will apply
//     the public modifier to both, resulting in a conflict.

