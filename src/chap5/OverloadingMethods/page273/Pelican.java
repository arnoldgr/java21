package chap5.OverloadingMethods.page273;

//Java picks the most specific version of a method that it can.
// What do you think this code outputs?
public class Pelican {
    public void fly(String s) {
        System.out.print("string");
    }

    public void fly(Object o) {
        System.out.print("object");
    }
    public static void main(String[] args) {
        var p = new Pelican();
        p.fly("test");
        System.out.print("-");
        p.fly(56);
    }
}

//The answer is string-object. The first call passes a String and finds a direct match.
// There’s no reason to use the Object version when there is a nice String parameter
// list just waiting to be called. The second call looks for an int parameter list.
// When it doesn’t find one, it autoboxes to Integer.
// Since it still doesn’t find a match, it goes to the Object one.
