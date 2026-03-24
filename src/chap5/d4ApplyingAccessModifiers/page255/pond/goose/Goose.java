package chap5.d4ApplyingAccessModifiers.page255.pond.goose;

import chap5.d4ApplyingAccessModifiers.page254.pond.shore.Bird;

public class Goose extends Bird {
    public void helpGooseSwim() {
        Goose other = new Goose();
        other.floatInWater();
        System.out.print(other.text);
    }
    public void helpOtherGooseSwim() {
        Bird other = new Goose();
//        other.floatInWater();           // DOES NOT COMPILE
//        System.out.print(other.text);   // DOES NOT COMPILE
    }
}

//The first method is fine. In fact, it is equivalent to the Swan example.
// Goose extends Bird. Since we are in the Goose subclass and referring to a Goose reference,
// it can access protected members. The second method is a problem.
// Although the object happens to be a Goose, it is stored in a Bird reference.
// We are not allowed to refer to members of the Bird class since we are not in the
// same package and the reference type of other is not a subclass of Goose.
