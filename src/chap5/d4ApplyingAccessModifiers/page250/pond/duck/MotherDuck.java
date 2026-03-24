package chap5.d4ApplyingAccessModifiers.page250.pond.duck;

public class MotherDuck {
    String noise = "quack";
    void quack() {
        System.out.print(noise);            // package access is ok
    }
}
//MotherDuck can refer to noise and call quack().
// After all, members in the same class are certainly in the same package.
// The big difference is that MotherDuck lets other classes in the same
// package access members, whereas FatherDuck doesn’t (due to being private).
// GoodDuckling has a much better experience than BadDuckling:

