package chap5.d4ApplyingAccessModifiers.page253.pond.swan;


import chap5.d4ApplyingAccessModifiers.page253.pond.shore.Bird;

public class Swan extends Bird {     // Swan is a subclass of Bird

    public void swim() {
        System.out.print(text);        // protected access is ok
    }

    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();          // subclass access to superclass
        System.out.print(other.text);  // subclass access to superclass
    }

    public void helpOtherBirdSwim() {
        Bird other = new Bird();
//        other.floatInWater();          // DOES NOT COMPILE
//        System.out.print(other.text);  // DOES NOT COMPILE
    }
}
//Take a deep breath. This is interesting.
// Swan is not in the same package as Bird but does extend it—which implies
// it has access to the protected members of Bird since it is a subclass.
// And it does. Lines 9 and 10 refer to protected members via inheriting them.
//Lines 15 and 16 also successfully use protected members of Bird.
// This is allowed because these lines refer to a Swan object.
// Swan inherits from Bird, so this is OK.
// It is sort of a two-phase check.
// The Swan class is allowed to use protected members of Bird,
// and we are referring to a Swan object.
// Granted, it is a Swan object created on line 14 rather than an inherited one, but it is still a Swan object.
// Lines 21 and 22 do not compile. Wait a minute. They are almost exactly the same as lines 15 and 16!
// There’s one key difference. This time a Bird reference is used rather than inheritance.
// It is created on line 20. Bird is in a different package, and this code isn’t inheriting from Bird,
// so it doesn’t get to use protected members.
// Say what, now? We just got through saying repeatedly that Swan inherits from Bird.
// And it does. However, the variable reference isn’t a Swan. The code just happens to be in the Swan class.
//It’s OK to be confused.
// This is arguably one of the most confusing points on the exam.
// Looking at it a different way, the protected rules apply under two scenarios:
//
//A member is used without referring to a variable.
// This is the case on lines 9 and 10.
// In this case, we are taking advantage of inheritance, and protected access is allowed.
//A member is used through a variable.
// This is the case on lines 16, 17, 21, and 22.
// In this case, the rules for the reference type of the variable are what matter.
// If it is a subclass, protected access is allowed.
// This works for references to the same class or a subclass.
