package chap5.ApplyingAccessModifiers.page250.pond.swan;
//In this same pond, a swan just gave birth to a baby swan.
// A baby swan is called a cygnet.
// The cygnet sees the ducklings learning to quack and decides to learn from MotherDuck as well.


import chap5.ApplyingAccessModifiers.page250.pond.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        var duck = new MotherDuck();
//        duck.quack();                       // DOES NOT COMPILE
//        System.out.print(duck.noise);       // DOES NOT COMPILE
    }
}

//Oh, no! MotherDuck only allows lessons to other ducks by restricting access to the pond.duck package.
// Poor little BadCygnet is in the pond.swan package, and the code doesn’t compile.
// Remember that when there is no access modifier on a member, only
// classes in the same package can access the member.
