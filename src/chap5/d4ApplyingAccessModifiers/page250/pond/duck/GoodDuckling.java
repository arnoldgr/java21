package chap5.d4ApplyingAccessModifiers.page250.pond.duck;

public class GoodDuckling {
    public void makeNoise() {
        var duck = new MotherDuck();
        duck.quack();                       // package access is ok
        System.out.print(duck.noise);       // package access is ok
    }
}
//GoodDuckling succeeds in learning to quack() and make noise by copying its mother.
// Notice that all the classes covered so far are in the same package, pond.duck.
// This allows package access to work.

