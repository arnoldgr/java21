package chap7.a1ImplementingInterfaces.page364;

//Let’s take a look at another example involving an abstract class that implements an interface:
 interface HasTail {
    public int getTailLength();
}

 interface HasWhiskers {
    public int getNumberOfWhiskers();
}

 abstract class HarborSeal implements HasTail, HasWhiskers {}

// class CommonSeal extends HarborSeal {}  // DOES NOT COMPILE

//The HarborSeal class compiles because it is abstract and not required to implement any of the
// abstract methods it inherits.
// The concrete CommonSeal class, though, must override all inherited abstract methods.

//Mixing Class and Interface Keywords

//The exam creators are fond of questions that mix class and interface terminology.
// Although a class can implement an interface, a class cannot extend an interface.
// Likewise, while an interface can extend another interface, an interface cannot implement another interface.
// The following examples illustrate these principles:
interface CanRun {}
//public class Cheetah extends CanRun {}   // DOES NOT COMPILE

class Hyena {}
//public interface HasFur extends Hyena {} // DOES NOT COMPILE

//Be wary of exam questions that mix class and interface declarations.