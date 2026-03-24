package chap6.inheritingmembers.page324;

//Rule #4: Covariant Return Types
//The fourth and final rule around overriding a method is probably the most complicated, as it requires knowing the relationships between the return types. The overriding method must use a return type that is covariant with the return type of the inherited method.
//Let’s try an example for illustrative purposes:
class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    } }

class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }
//    public CharSequence getColor() {  // DOES NOT COMPILE
//        return "grey";
//    }
}

//The subclass JavanRhino attempts to override two methods from Rhino: getName() and getColor().
// Both overridden methods have the same name and signature as the inherited methods.
// The overridden methods also have a broader access modifier, public, than the inherited methods.
// Remember, a broader access modifier is acceptable in an overridden method.
//From Chapter 4, “Core APIs,” we learned that String implements the CharSequence interface, making String a
// subtype of CharSequence.
// Therefore, the return type of getName() in JavanRhino is covariant with the return type of getName() in Rhino.
//On the other hand, the overridden getColor() method does not compile because CharSequence is not a subtype of String.
// To put it another way, all String values are CharSequence values, but not all CharSequence values are String values.
// For instance, a StringBuilder is a CharSequence but not a String.
// For the exam, you need to know if the return type of the overriding method is the same as or a
// subtype of the return type of the inherited method.

//A simple test for covariance is the following: given an inherited return type A and an overriding return type B,
// can you assign an instance of B to a reference variable for A without a cast?
// If so, then they are covariant. This rule applies to primitive types and object types alike.
// If one of the return types is void, then they both must be void, as nothing is covariant with void except itself.

//That’s everything you need to know about overriding methods for this chapter.
// In Chapter 9, “Collections and Generics,” we revisit overriding methods involving generics.
// There’s always more to learn!

