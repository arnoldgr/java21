package chap5.OverloadingMethods.page274;

//Autoboxing
//As we saw earlier, autoboxing applies to method calls,
// but what happens if you have both a primitive and an integer version?
public class Kiwi {
    public void fly(int numMiles) {}
    public void fly(Integer numMiles) {}
}

//These method overloads are valid.
// Java tries to use the most specific parameter list it can find.
// This is true for autoboxing as well as other matching types we talk about in this section.
//This means calling fly(3) will call the first method.
// When the primitive int version isn’t present, Java will autobox.
// However, when the primitive int version is provided,
// there is no reason for Java to do the extra work of autoboxing.
