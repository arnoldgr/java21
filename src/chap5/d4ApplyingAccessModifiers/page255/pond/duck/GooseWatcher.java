package chap5.d4ApplyingAccessModifiers.page255.pond.duck;

import chap5.d4ApplyingAccessModifiers.page255.pond.goose.Goose;

public class GooseWatcher {
    public void watch() {
        Goose goose = new Goose();
//        goose.floatInWater();     // DOES NOT COMPILE
    }
}
//This code doesn’t compile because we are not in the Goose class.
// The floatInWater() method is declared in Bird.
// GooseWatcher is not in the same package as Bird, nor does it extend Bird.
// Goose extends Bird. That only lets Goose refer to floatInWater(), not callers of Goose.
//If this is still puzzling, try it. Type in the code and try to make it compile.
// Then reread this section. Don’t worry—it wasn’t obvious to us the first time either!
