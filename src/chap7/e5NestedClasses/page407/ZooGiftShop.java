package chap7.e5NestedClasses.page407;

//Defining an Anonymous Class
//An anonymous class is a specialized form of a local class that does not have a name.
// It is declared and instantiated all in one statement using the new keyword,
// a type name with parentheses, and a set of braces {}.
// Anonymous classes must extend an existing class or implement an existing interface.
// They are useful when you have a short implementation that will not be used anywhere else.
// Here’s an example:
      public class ZooGiftShop {
      abstract class SaleTodayOnly {
         abstract int dollarsOff();
     }
      public int admission(int basePrice) {
               SaleTodayOnly sale = new SaleTodayOnly() {
            int dollarsOff() { return 3; }
         };  // Don't forget the semicolon!
               return basePrice - sale.dollarsOff();
         }

    public static void main(String[] args) {
        ZooGiftShop zg = new ZooGiftShop();
        System.out.println(zg.admission(100));
    }}

//Lines 11–13 define an abstract class. Lines 15–17 define the anonymous class.
// Notice how this anonymous class does not have a name.
// The code says to instantiate a new SaleTodayOnly object.
// But wait: SaleTodayOnly is abstract.
// This is OK because we provide the class body right there—anonymously.
// In this example, writing an anonymous class is equivalent to writing a
// local class with an unspecified name that extends SaleTodayOnly and immediately uses it.
//Pay special attention to the semicolon on line 17.
// We are declaring a local variable on these lines.
// Local variable declarations are required to end with semicolons,
// just like other Java statements—even if they are long and happen to contain an anonymous class.

