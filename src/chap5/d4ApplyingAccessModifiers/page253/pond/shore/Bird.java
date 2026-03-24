package chap5.ApplyingAccessModifiers.page253.pond.shore;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.print(text);         // protected access is ok
    }
}