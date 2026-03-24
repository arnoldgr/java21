package chap7.a1ImplementingInterfaces.page369;

//For the exam, you should be familiar with various rules for declaring default methods.
//Default Interface Method Definition Rules

//A default method may be declared only within an interface.
//A default method must be marked with the default keyword and include a method body.
//A default method is implicitly public.
//A default method cannot be marked abstract, final, or static.
//A default method may be overridden by a class that implements the interface.
//If a class inherits two or more default methods with the same method signature, then the class must override the method.

//The first rule should give you some comfort in that you’ll only see default methods in interfaces. If you see them in a class or enum on the exam, something is wrong. The second rule just denotes syntax, as default methods must use the default keyword. For example, the following code snippets will not compile because they mix up concrete and abstract interface methods:
//interface Carnivore {
//    public default void eatMeat();        // DOES NOT COMPILE
//    public int getRequiredFoodAmount() {  // DOES NOT COMPILE
//        return 13;
//    } }

//The next three rules for default methods follow from the relationship with abstract interface methods. Like abstract interface methods, default methods are implicitly public. Unlike abstract methods, though, default interface methods cannot be marked abstract since they provide a body. They also cannot be marked as final, because they are designed so that they can be overridden in classes implementing the interface, just like abstract methods. Finally, they cannot be marked static since they are associated with the instance of the class implementing the interface.

