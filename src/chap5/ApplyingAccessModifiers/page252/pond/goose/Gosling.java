package chap5.ApplyingAccessModifiers.page252.pond.goose;


import chap5.ApplyingAccessModifiers.page252.pond.shore.Bird;

public class Gosling extends Bird {   // Gosling is a subclass of Bird
    public void swim() {
        floatInWater();                 // protected access is ok
        System.out.println(text);         // protected access is ok
    }
    public static void main(String[] args) {
        new Gosling().swim();
    }
}
//This is a simple subclass. It extends the Bird class.
// Extending means creating a subclass that has access to any protected
// or public members of the parent class.
// Running this program prints floating twice: once from calling floatInWater(),
// and once from the print statement in swim(). Since Gosling is a subclass of Bird,
// it can access these members even though it is in a different package.
