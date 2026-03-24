package chap7.c3SealingClasses.page383;

//Creating non-sealed Subclasses
//The non-sealed modifier is used to open a sealed parent class to potentially unknown subclasses.
        abstract sealed class Mammal permits Feline {}
        non-sealed class Feline extends Mammal {}
        class Tiger extends Feline {}

//        In this example, we are able to create an indirect subclass of Mammal, called Tiger,
//        not named in the declaration of Mammal.
//        Also notice that Tiger is not final, so it may be extended by any subclass, such as BengalTiger.
        class BengalTiger extends Tiger {}

//        At first glance, this might seem a bit counterintuitive.
//        After all, we were able to create subclasses of Mammal
//        that were not declared in Mammal. So is Mammal still sealed? Yes, but that’s thanks to polymorphism.
//        Any instance of Tiger or BengalTiger is also an instance of Feline, which is named in the Mammal declaration.
//        We discuss polymorphism more toward the end of this chapter.
//        For now, you just need to understand that Mammal is sealed to Feline and its subclasses.

//        If you’re still worried about opening a sealed class too much with a non-sealed subclass,
//        remember that the person writing the sealed class can see the declaration of all direct subclasses at compile time.
//        They can decide whether to allow the non-sealed subclass to be supported.

