package chap5.d4ApplyingAccessModifiers.page249.pond.duck;

public class FatherDuck {
    private String noise = "quack";

    private void quack() {
//        page 249
        System.out.print(noise);         // private access is ok
    }
}
