package chap7.e5NestedClasses.page407;

//Now we convert this same example to implement an interface instead of extending an abstract class:
public class ZooGiftShop2 {
    interface SaleTodayOnly {
        int dollarsOff();
    }

    public int admission(int basePrice) {
        SaleTodayOnly sale = new SaleTodayOnly() {
            public int dollarsOff() {
                return 3;
            }
        };
        return basePrice - sale.dollarsOff();
    }
    public static void main(String[] args) {
        ZooGiftShop zg = new ZooGiftShop();
        System.out.println(zg.admission(100));
    }
}

//The most interesting thing here is how little has changed.
// Lines 5-7 declare an interface instead of an abstract class.
// Line 11 is public instead of using default access since interfaces require abstract methods to be public.
// And that is it.
// The anonymous class is the same whether you implement an interface or extend a class!
// Java figures out which one you want automatically.
// Just remember that in this second example, an instance of a class is created on line 10, not an interface.
//But what if we want to both implement an interface and extend a class?
// You can’t do so with an anonymous class unless the class to extend is java.lang.Object.
// The Object class doesn’t count in the rule.
// Remember that an anonymous class is just an unnamed local class.
// You can write a local class and give it a name if you have this problem.
// Then you can extend a class and implement as many interfaces as you like.
// If your code is this complex, a local class probably isn’t the most readable option anyway.


